package com.learnJavaMyVersion.lambdas;

public class RunableLambdaExample {
    public static void main(String[] args) {


        /*
         * Prior java 8
         * */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        /*
        * Java 8 lambda syntax
        *
        * */
        // () -> {}
        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2");
        };

        new Thread(runnableLambda).start();

        //
        Runnable runnableLambda1 = () -> System.out.println("Inside Runnable 3");
        new Thread(runnableLambda1).start();

        //
        new Thread(() -> System.out.println("Inside Runnable 4")).start();
    }
}
