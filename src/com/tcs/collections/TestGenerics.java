package com.tcs.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TestGenerics<T extends Person> {

    public void Test() {
        Student[] studentArray = {
                new Student("Nicolas", 25, "TCS"),
                new Student("Andrea", 25, "TCS"),
                new Student("Israel", 25, "TCS")
        };

        Person[] personsArray = {
                new Person("Rodrigo", 29),
                new Person("Eric", 35)
        };

        PrintUtility printUtility = new PrintUtility();
        printUtility.printNames(personsArray);
    }

}
