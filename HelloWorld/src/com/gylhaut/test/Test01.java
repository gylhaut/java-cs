package com.gylhaut.test;
import com.gylhaut.bean.Letter;
import com.gylhaut.util.Bubble;
import java.util.Map;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        String str = "this is a red apple which is very nice eat apple";
        String[] strArrays = str.split(" ");
        Map<String, Letter> letters = Bubble.getMapCount(strArrays);
        Set<String> keys = letters.keySet();
        for(String key:keys){
            Letter col =letters.get(key);
            System.out.println("字母:" +key+",次数"+col.getCount());
        }
    }
}
