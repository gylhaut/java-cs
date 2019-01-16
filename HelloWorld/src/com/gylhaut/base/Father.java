package com.gylhaut.base;

/**
 *  父类为泛型类
 * 1、属性
 * 2、方法
 *
 * 要么同时擦除，要么子类大于等于父类的类型,
 * 不能子类擦除，父类泛型
 * 1、属性类型
 *  父类中，随父类而定
 *  子类中，随子类而定
 * 2、方法重写:

 * @param <T>
 * @param <T1>
 */
public abstract class Father<T,T1> {
    T name;
}
