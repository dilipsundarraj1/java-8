package com.learnJava.parallelstreams;

public class Sum {

    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void performSum(int input){
        total+=input;
        //System.out.println("total: " + total);

    }

}
