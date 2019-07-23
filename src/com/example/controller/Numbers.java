package com.example.controller;

public class Numbers {

    private double number = 0;

    public double showNumbersWhile() {
        double i = 0;
        if (number >= 0 && number <= 3) {
            while (i <= 3) {
                number = number + 0.1;
                System.out.println(number);
                i++;
            }
        }
        return number;
    }
}
