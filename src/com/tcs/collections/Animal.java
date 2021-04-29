package com.tcs.collections;

import java.sql.Timestamp;
import java.util.Objects;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }
}

class Dog extends Animal {

}
