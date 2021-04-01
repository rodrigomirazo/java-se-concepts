package com.tcs.abstraction;

//interface Acceleration {
//    void accelerate();
//}

public abstract class Vehicle {
    public void applyBreakes() {
        System.out.println("Uses Mechanical Breaks");
    }

}

class TeslaModel3 extends Vehicle {
    @Override
    public void applyBreakes() {
        System.out.println("Uses Recovery Breaks");
    }
}

class Tsuru extends Vehicle {
}

class ChevyC2 extends Vehicle {
}

class Jetta extends Vehicle {
}

class Test {
    public static void main(String[] args) {

        Vehicle leonardosJetta = new Jetta(); // Java doent know the TYPE of leonardosJetta

        Vehicle myCar = new Tsuru();


        TeslaModel3 tesla = new TeslaModel3();
        Tsuru tsuru = new Tsuru();
        ChevyC2 chevyC2 = new ChevyC2();

        System.out.println("tesla: ");
        tesla.applyBreakes();

        System.out.println("tsuru: ");
        tsuru.applyBreakes();

        System.out.println("chevyC2: ");
        chevyC2.applyBreakes();

        System.out.println("\n\nAcceleration");
    }
}

//2. Implement abstract method: public abstract void accelerate();
//@Override public void accelerate() { System.out.println("Accelerate 0-60 3 seconds"); }