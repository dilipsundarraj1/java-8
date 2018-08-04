package com.learnJava.defaults;

/**
 * Created by z001qgd on 8/2/18.
 */
public interface Interface3 extends Interface1,Interface2 {

    default void methodC(){
        System.out.println("Inside method C");
    }
    default void methodA(){
        System.out.println("Inside method A "+ Interface3.class);
    }
}
