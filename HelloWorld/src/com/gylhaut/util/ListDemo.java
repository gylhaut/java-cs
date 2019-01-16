package com.gylhaut.util;

import com.gylhaut.bean.Node;

public class ListDemo {
    /**
     *
     * @param head
     * @param k
     * @return
     */
    public static Node findKthToTail(Node head, int k) {
        if(head ==null || k ==0){
            return null;
        }
        Node ahead = head;
        Node behind = null;
        for (int i = 0; i <k-1 ; i++) {
            if (ahead.getNext() != null){
                ahead = ahead.getNext();
            }else {
                return null;
            }

        }
        behind = head;
        while (ahead.getNext()!=null){
            ahead = ahead.getNext();
            behind = behind.getNext();
        }
        return behind;
    }
}
