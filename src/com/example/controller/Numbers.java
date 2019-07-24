package com.example.controller;

public class Numbers {

    public void showNumbersWhile() {
        double number = 0;
        while (number <= 3.1) {
            System.out.printf("%2.1f ", number);
            number = number + 0.1;

        }
    }

    public void showNumbersDoWhile() {
        double number = 0;
        do {
            System.out.printf("%2.1f ", number);
            number = number + 0.1;
        } while (number <= 3.1);
    }
}
