package com.gylhaut.util;

import com.gylhaut.bean.Letter;

import java.util.HashMap;
import java.util.Map;

/**
 * 冒泡排序
 */
public class Bubble {
    /**
     * 统计单词个数
     * @param strArrays
     * @return
     */
    public static Map<String, Letter> getStringLetterMap(String[] strArrays) {
        Map<String, Letter> letters = new HashMap<>();//存储在map中
        for (String strArray : strArrays) {
            if (!letters.containsKey(strArray)) {
                letters.put(strArray,new Letter());
            }
            Letter col = letters.get(strArray);
            col.setCount(col.getCount()+1);
        }
        return letters;
    }

    /**
     *统计单词个数
     * @param strArrays
     * @return
     */
    public static Map<String, Letter> getStringMap(String[] strArrays) {
        Map<String, Letter> letters = new HashMap<>();//存储在map中
        for (String strArray : strArrays) {
            if (!letters.containsKey(strArray)) {
                Letter letter = new Letter();
                letter.setCount(1);
                letters.put(strArray,letter);
            }else {
                Letter col = letters.get(strArray);
                col.setCount(col.getCount()+1);
            }

        }
        return letters;
    }

    /**
     *统计单词个数
     * @param strArrays
     * @return
     */
    public static Map<String, Letter> getMapCount(String[] strArrays) {
        Map<String, Letter> letters = new HashMap<>();//存储在map中
        for (String strArray : strArrays) {
            Letter letter;
            if (null == letters.get(strArray)) {
                letter = new Letter();
                letter.setCount(1);
                letters.put(strArray,letter);
            }else {
                Letter col = letters.get(strArray);
                col.setCount(col.getCount()+1);
            }

        }
        return letters;
    }

    public static Map<String, Letter> getIntegerCount(int[] strArrays) {
        Map<String, Letter> letters = new HashMap<>();//存储在map中
        for (Integer strArray : strArrays) {
            if (!letters.containsKey(strArray.toString())) {
                Letter letter = new Letter();
                letter.setCount(1);
                letters.put(strArray.toString(),letter);
            }else {
                Letter col = letters.get(strArray.toString());
                col.setCount(col.getCount()+1);
            }

        }
        return letters;
    }


    public static void bubbleSort(int[] array) {
        boolean sorted =true;
        for (int i = 0; i < array.length-1; i++) {
            sorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sorted =false;
                }
            }
            if (sorted){//减少趟数
                break;
            }
        }

    }
}
