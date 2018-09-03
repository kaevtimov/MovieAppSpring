package com.example.demo.utils;

public class IdGenerator {

    private int id = 0;

    public int getNextId(){
        return ++this.id;
    }
}
