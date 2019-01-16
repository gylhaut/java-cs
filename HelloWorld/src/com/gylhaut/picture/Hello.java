package com.gylhaut.picture;

public class Hello {
    private int age;
    public static void main(String[] args){
        Hello h = new Hello();
        h.setAge(18);
        System.out.println("Hello World  "+h.getAge());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
