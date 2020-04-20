package com.example.bodymassindex;

public class BodyMassIndex {

    private final static int IMPERIALMULTIPLIER = 703;

    public static float calculateBMI(double weight, double height, boolean metric) {

        double bmi = 1;

        if(!metric) {
            bmi *= IMPERIALMULTIPLIER;
        }

        bmi *= weight;
        bmi /= (height * height);

        return (float) bmi;
    }

}