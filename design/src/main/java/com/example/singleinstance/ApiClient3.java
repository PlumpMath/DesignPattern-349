package com.example.singleinstance;

/**
 * Created by zhangsheng on 2016/12/25.
 */

public class ApiClient3 {
    /*
    * 如果使用双重检查锁定来实现懒汉式单例类，需要在静态成员变量instance之前增加修饰符volatile，
    * 被volatile修饰的成员变量可以确保多个线程都能够正确处理，且该代码只能在JDK 1.5及以上版本中才能正确执行。
    * 由于volatile关键字会屏蔽Java虚拟机所做的一些代码优化，
    * 可能会导致系统运行效率降低，因此即使使用双重检查锁定来实现单例模式也不是一种完美的实现方式
    * */
    private volatile static ApiClient3 apiClient3 = null;

    private ApiClient3() {
    }

    public static ApiClient3 getInstance() {
        if (apiClient3 == null) {
            synchronized (ApiClient3.class) {
                if (apiClient3 == null) {
                    apiClient3 = new ApiClient3();
                }
            }
        }
        return apiClient3;
    }

}
