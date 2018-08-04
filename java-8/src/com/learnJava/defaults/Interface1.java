package com.learnJava.defaults;

/**
 * Created by z001qgd on 8/2/18.
 */
public interface Interface1 {

    default void methodA(){
        System.out.println("Inside method A"+Interface1.class);
    }
}
