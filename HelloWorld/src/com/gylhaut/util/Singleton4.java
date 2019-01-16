package com.gylhaut.util;

/**
 * 强烈推荐使用的解法：利用静态构造函数
 */
public final class Singleton4 {
    private  Singleton4(){

    }
    private static  Singleton4 instance = new Singleton4();
    public static Singleton4 GetInstance(){
        return instance;
    }
}
