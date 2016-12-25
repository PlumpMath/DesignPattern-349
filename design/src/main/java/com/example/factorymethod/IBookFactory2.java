package com.example.factorymethod;

/**
 * Created by zhangsheng on 2016/12/25.
 */

public abstract class IBookFactory2 {
//    通过将业务方法的调用移入工厂类，可以直接使用工厂对象来调用产品对象的业务方法
    public void generateBook(){
        IBook iBook = this.makeBook();
        iBook.generate();
    }

    public abstract IBook makeBook();
}
