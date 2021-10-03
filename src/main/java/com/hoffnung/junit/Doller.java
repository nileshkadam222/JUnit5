package com.hoffnung.junit;

public class Doller {
    public int amount;

    public Doller(int amount){
        this.amount = amount;
    }

    public int multiplay(int by){
        return this.amount *= by;
    }
}
