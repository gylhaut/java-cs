package com.gylhaut.util;

/**
 * 可行的解法：加同步锁前后两次判断实例是否已存在
 */
public final class Singleton3 {
    private Singleton3(){

    }
    private static final Object syncObj = new Object();

    public static Singleton3 getInstance() {
        if(instance == null){
            synchronized(syncObj){
                if (instance ==null){
                    instance = new Singleton3();
                }
            }
        }

        return instance;
    }

    private static Singleton3 instance = null;

}
