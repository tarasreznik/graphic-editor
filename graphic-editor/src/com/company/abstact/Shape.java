package com.company.abstact;

public abstract class Shape {

    public String getName(){
        return this.getClass().getSimpleName();
    }
}
