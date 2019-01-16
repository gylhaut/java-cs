package com.gylhaut.base;

/**
 * 斐波拉契数列
 */
public class FibonacciDemo {
    public static long fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static long fibonaccina(int n){
        int[] array ={0,1};
        if(n <2){
            return array[n];
        }
        int pre = 0;
        int current =1;
        int next =0;
        for(int i=2;i<=n;i++){
            next = pre + current;
            pre = current;
            current = next;
        }
        return next;
    }
}
