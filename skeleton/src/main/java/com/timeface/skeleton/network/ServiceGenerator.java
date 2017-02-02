package com.timeface.skeleton.network;

import com.google.gson.Gson;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.timeface.skeleton.BuildConfig;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zhangsheng on 2017/1/8.
 */

public class ServiceGenerator {
    private static class ServiceHolder {
        private static ServiceGenerator generator = new ServiceGenerator();
    }

    public ServiceGenerator getInstance() {
        return ServiceHolder.generator;
    }

    //Network constants
    private final int TIMEOUT_CONNECT = 30;   //In seconds
    private final int TIMEOUT_READ = 30;   //In seconds
    private final String CONTENT_TYPE = "Content-Type";
    private final String CONTENT_TYPE_VALUE = "application/json";

    private OkHttpClient.Builder okHttpBuilder;

    private ServiceGenerator() {
        this.okHttpBuilder = new OkHttpClient.Builder();
        Interceptor headerInterceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original = chain.request();
                Request request = original.newBuilder()
                        .header(CONTENT_TYPE, CONTENT_TYPE_VALUE)
                        .method(original.method(), original.body())
                        .build();
                return chain.proceed(request);
            }
        };
        okHttpBuilder.addInterceptor(headerInterceptor);
        okHttpBuilder.connectTimeout(TIMEOUT_CONNECT, TimeUnit.SECONDS);
        okHttpBuilder.readTimeout(TIMEOUT_READ, TimeUnit.SECONDS);
    }

    public <S> S createService(Class<S> serviceClass, String baseUrl) {
        OkHttpClient client = okHttpBuilder.build();
        client.interceptors().add(getLogger());
        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit.create(serviceClass);
    }

    private HttpLoggingInterceptor getLogger() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        if (BuildConfig.DEBUG) {
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS)
                    .setLevel(HttpLoggingInterceptor.Level.BODY);
        }
        return loggingInterceptor;
    }
}
