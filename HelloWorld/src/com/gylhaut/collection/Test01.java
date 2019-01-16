package com.gylhaut.collection;

import java.util.LinkedList;

/**
 * 基类
 */
class Base{
    static {
        System.out.println("Base static block");
    }
    {
        System.out.println("Base Block");
    }
    public Base(){
        System.out.println("Base Constructor");
    }
}
public class Test01 extends Base{

    LinkedList ll = new LinkedList();
    static {
        System.out.println("Derived static block");
    }
    {
        System.out.println("Derived block");
    }
    public Test01(){
        System.out.println("Derived Constructor");
    }
    public static void main(String[] args){
       new Test01();
    }
}  

