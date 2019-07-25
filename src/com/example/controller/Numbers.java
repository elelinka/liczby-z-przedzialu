package com.example.controller;

import java.util.Locale;

public class Numbers {

    public void showNumbersWhile() {
        double number = 0;
        while (number <= 3) {
            System.out.printf(Locale.US, "%2.1f, ", number);
            number += 0.1;

        }
        System.out.printf(Locale.US, "%2.1f", number);
    }

    public void showNumbersDoWhile() {
        double number = 0;
        do {
            System.out.printf(Locale.US, "%2.1f, ", number);
            number += 0.1;
        } while (number <= 3);
        System.out.printf(Locale.US, "%2.1f", number);
    }
}
