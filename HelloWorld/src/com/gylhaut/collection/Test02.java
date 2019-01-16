package com.gylhaut.collection;

import java.util.ArrayList;

interface Stuff{}
//矿石
interface Ore extends Stuff{}

//武器
interface Weapon extends Stuff{}
//垃圾
interface Rubbish extends Stuff{}
//金矿
class Gold implements Ore{
    public String toString(){
        return "Gold";
    }
}
//铜矿
class Copper implements Ore{
    @Override
    public String toString() {
        return "Copper";
    }
}
//枪
class Gun implements Weapon{
    @Override
    public String toString() {
        return "Gun";
    }
}
//榴弹
class Grenade implements Weapon{
    @Override
    public String toString() {
        return "Grenade";
    }
}
class Stone implements Rubbish{
    @Override
    public String toString() {
        return "Stone";
    }
}
public class Test02 {
    public static ArrayList<Stuff> collectStuff(Stuff[] s){
        ArrayList<Stuff> al = new ArrayList<>();
        for (int i = 0; i <s.length ; i++) {
            if (!(s[i] instanceof Rubbish)){
                al.add(s[i]);
            }
        }
        return al;
    }
    public static void main(String[] args){
        Stuff[] s = {new Gold(),new Copper(),new Gun(),new Grenade(),new Stone()};
        ArrayList<Stuff> stuffs = collectStuff(s);
        System.out.println("The useful Stuff collected is:");
        for (int i = 0; i <stuffs.size() ; i++) {
            System.out.println(stuffs.get(i));
        }
    }
}
