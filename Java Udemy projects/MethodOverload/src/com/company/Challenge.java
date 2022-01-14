package com.company;

public class Challenge {
    public static double centimeters;
    public static int feet;
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(6,11));
        System.out.println(calcFeetAndInchesToCentimeters(75));
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            centimeters = ((feet * 12 * 2.54) + inches * 2.54);
            return centimeters;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches >= 0) {
            feet=inches/12;
            inches=inches%12;
            calcFeetAndInchesToCentimeters(feet,inches);
            return centimeters;
        } else {
            return -1;
        }
    }

}