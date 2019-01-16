package com.gylhaut.util;

import com.gylhaut.bean.TreeNode;

public class BinaryTreeHelper {

    /**
     * 指向头节点
     * @param root
     * @return
     */
    public static TreeNode convert(TreeNode root){
        root=convert2Link(root);
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    /**
     * 搜索二叉树转成双向链表
     * @param root
     * @return
     */
    public static TreeNode convert2Link(TreeNode root){
        if(root == null|| (root.left == null && root.right == null)){
            return root;
        }
        TreeNode tmp = null;
        if(root.left != null){
           tmp= convert2Link(root.left);
           while (tmp.right != null){
               tmp = tmp.right;
           }
           tmp.right = root;
           root.left = tmp;
        }
        if (root.right !=null){
            tmp = convert2Link(root.right);
            while (tmp.left != null){
                tmp = tmp.left;
            }
            tmp.left = root;
            root.right = tmp;
        }

        return root;
    }

}

