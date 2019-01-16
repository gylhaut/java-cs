package com.gylhaut.util;

import com.gylhaut.bean.Node;

public class ListUtil {
    public static Node findKthToTail(Node head, int k) {
        Node ahead = head;
        Node behind = head;
        int count = 1;
        if (ahead == null||behind == null)
            return ahead;

        while (ahead.getNext() != null) {
            ahead = ahead.getNext();
            count++;
        }

        for (int i =0;i< count-k;i++){
            behind = behind.getNext();
        }
        return behind;
    }

}
