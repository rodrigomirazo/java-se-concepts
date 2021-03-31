package com.tcs.binding;

public class FastFood {
    public void create() {
        System.out.println(" Creating in FastFood class");
    }
}
class Pizza extends FastFood {
    public void create() {
        System.out.println(" Creating in Pizza class");
    }
}

class Main {
    public static void main(String[] args) {

        System.out.println("\n Static binding");
        FastFood fastFood = new FastFood();
        fastFood.create();

        System.out.println("\n Dynamic binding");
        FastFood pza = new Pizza();
        pza.create();
    }
}

