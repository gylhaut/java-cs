package com.gylhaut.util;

public final class Singleton5 {
    private Singleton5(){

    }
    public static Singleton5 getInstance(){
        return Nested.instance;
    }

    private static class Nested{
        private Nested(){

        }
        private static final Singleton5 instance = new Singleton5();
    }
}
