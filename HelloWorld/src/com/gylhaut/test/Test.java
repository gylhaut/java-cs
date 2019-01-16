package com.gylhaut.test;

import com.gylhaut.bean.Letter;
import com.gylhaut.util.Bubble;

import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        //Bubble.bubbleSort(arr);
        Map<String, Letter> letters = Bubble.getIntegerCount(arr);
        Set<String> keys = letters.keySet();
        for(String key:keys){
            Letter col =letters.get(key);
            System.out.println("数字:" +key+",次数"+col.getCount());
        }
    }
}



