package com.tcs.collections;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PrintUtility2<T extends Person, K extends Animal> {

    public static void main(String[] args) {
        Student[] studentArray = {
                new Student("Nicolas", 25, "TCS"),
                new Student("Andrea", 25, "TCS"),
                new Student("Israel", 25, "TCS")
        };

        Person[] personsArray = {
                new Person("Rodrigo", 29),
                new Person("Eric", 35)
        };

    }

    public List<T> fromArrayToList(T[] a) {
        return (List<T>) Arrays.stream(a).collect(Collectors.toList());
    }

}
