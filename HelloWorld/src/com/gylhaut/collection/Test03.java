package com.gylhaut.collection;
class Obj{

    @Override
    public String toString() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    private String str = "defaut value";
}

public class Test03 {
    private Obj aObj = new Obj();
    private int anInt = 0;

    public Obj getaObj() {
        return aObj;
    }

    public int getAnInt() {
        return anInt;
    }
    public void changeObj(Obj inObj){
        inObj.setStr("chaged value");
    }
    public void changeInt(int inInt){
        inInt =1;
    }
    public static void main(String[] args){
        Test03 oRef = new Test03();
        System.out.println("**************引用类型*******************");
        System.out.println("调用changeObj()前: " +oRef.getaObj());
        oRef.changeObj(oRef.getaObj());
        System.out.println("调用changeObj()后: " +oRef.getaObj());
    }

}
