package com.gylhaut.bean;

public class TreeNode<T> {
    public T data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(T data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }
}
