package com.alifetvaci.springbeansmutability;


public class Job {

    protected int count = 0;

    void counter() {
        this.count++;
    }

    public int getCount() {
        return count;
    }
}
