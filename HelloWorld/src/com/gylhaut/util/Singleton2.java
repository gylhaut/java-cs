package com.gylhaut.util;

/**
 * 多线程是实现方式
 */
public final class Singleton2 {
    private Singleton2(){

    }
    private static final Object syncObj = new Object();

    public static Singleton2 getInstance() {
        synchronized(syncObj){
            if (instance ==null){
                instance = new Singleton2();
            }
        }
        return instance;
    }

    private static Singleton2 instance = null;


}
