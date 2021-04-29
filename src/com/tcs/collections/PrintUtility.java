package com.tcs.collections;

import java.util.Arrays;

public class PrintUtility <T extends Person> {

    void printNames(T[] personsArray) {

        Arrays.stream(personsArray).forEach(person -> {
            System.out.println(person);
        });
    }

    void sorting(T[] personsArray) {

    }

}
