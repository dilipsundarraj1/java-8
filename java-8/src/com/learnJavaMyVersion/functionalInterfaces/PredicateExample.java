package com.learnJavaMyVersion.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> predicate = (a)-> { return a%2==0;};
    static Predicate<Integer> predicate2 = (a)-> a%2==0;
    static Predicate<Integer> predicate3 = (a)-> a%5==0;

    public static void predicateAnd(){
        System.out.println("********Inside predicateAnd() method ***********");
        System.out.println(predicate2.and(predicate3).test(10));
        System.out.println(predicate2.and(predicate3).test(8));
        System.out.println(predicate2.and(predicate3).test(9));
    }

    public static void predicateOr(){
        System.out.println("********Inside predicateOr() method ***********");
        System.out.println(predicate2.or(predicate3).test(10));
        System.out.println(predicate2.or(predicate3).test(8));
        System.out.println(predicate2.or(predicate3).test(9));
    }

    public static void predicateNegate(){
        System.out.println("********Inside predicateNegate() method ***********");
        System.out.println(predicate2.or(predicate3).negate().test(10));
        System.out.println(predicate2.or(predicate3).negate().test(8));
        System.out.println(predicate2.or(predicate3).negate().test(9));
    }
    public static void main(String[] args) {



        System.out.println("Is 4 even number? : "+ predicate.test(4));
        System.out.println("Is 4 even number? : "+ predicate2.test(4));

        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
