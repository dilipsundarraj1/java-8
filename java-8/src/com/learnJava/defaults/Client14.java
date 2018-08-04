package com.learnJava.defaults;

public class Client14 implements Interface1,Interface4{

    public void  methodA(){
        System.out.println("Inside method A "+Client14.class);
    }

    public static void main(String[] args) {
        Client14 client14 = new Client14();
        client14.methodA();

    }

}
