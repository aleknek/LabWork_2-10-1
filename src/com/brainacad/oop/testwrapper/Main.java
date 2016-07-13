package com.brainacad.oop.testwrapper;

public class Main {

    public static void main(String[] args) {

        Integer x1 = 10;
        Integer x2 = new Integer(10);
        Integer x3 = Integer.valueOf(10);
        Integer x4 = Integer.parseInt("10");

        // compare ==
        if (x1 == x2) {
            System.out.println("x1 == x2 is true");
        } else {
            System.out.println("x1 == x2 is false");
        }

        if (x1 == x3) {
            System.out.println("x1 == x3 is true");
        } else {
            System.out.println("x1 == x3 is false");
        }

        if (x1 == x4) {
            System.out.println("x1 == x4 is true");
        } else {
            System.out.println("x1 == x4 is false");
        }

        if (x2 == x3) {
            System.out.println("x2 == x3 is true");
        } else {
            System.out.println("x2 == x3 is false");
        }

        if (x2 == x4) {
            System.out.println("x2 == x4 is true");
        } else {
            System.out.println("x2 == x4 is false");
        }

        if (x3 == x4) {
            System.out.println("x3 == x4 is true");
        } else {
            System.out.println("x3 == x4 is false");
        }

        // compare equals
        if (x1.equals(x2)) {
            System.out.println("x1 equals x2 is true");
        } else {
            System.out.println("x1 equals x2 is false");
        }

        if (x1.equals(x3)) {
            System.out.println("x1 equals x3 is true");
        } else {
            System.out.println("x1 equals x3 is false");
        }

        if (x1.equals(x4)) {
            System.out.println("x1 equals x4 is true");
        } else {
            System.out.println("x1 equals x4 is false");
        }

        if (x2.equals(x3)) {
            System.out.println("x2 equals x3 is true");
        } else {
            System.out.println("x2 equals x3 is false");
        }

        if (x2.equals(x4)) {
            System.out.println("x2 equals x4 is true");
        } else {
            System.out.println("x2 equals x4 is false");
        }

        if (x3.equals(x4)) {
            System.out.println("x3 equals x4 is true");
        } else {
            System.out.println("x3 equals x4 is false");
        }
    }
}
