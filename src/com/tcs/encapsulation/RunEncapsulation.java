package com.tcs.encapsulation;

import com.tcs.encapsulation.pojos.CarByPieces;
import com.tcs.encapsulation.pojos.*;

public class RunEncapsulation {

    public static void main(String[] args) {

        // Build the Car Manually
        CarByPieces carByPieces = new CarByPieces();
        carByPieces.engine = "old Engine";
        carByPieces.wheels = new String[]{"wheel", "wheel", "wheel", "wheel"};
        carByPieces.seats = "old seats";
        carByPieces.chassis = "old chasis";

        // Buy car from Store
        CarEncapsulated carEncapsulated  = new CarEncapsulated();
        System.out.println("Show me the Car");
        carEncapsulated.toString();
    }

}

