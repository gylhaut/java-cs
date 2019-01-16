package com.gylhaut.util;

/**
 * 第一种实现方式
 */
public final class Singleton {
    private Singleton(){

    }

    /**
     * 单例方法
     * @return
     */

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    private static Singleton instance = null;


}
