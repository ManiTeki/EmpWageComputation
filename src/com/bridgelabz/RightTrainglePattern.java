package com.bridgelabz;

public class RightTrainglePattern {
    public static void main(String[] args) {
        int i, j, number, n = 7;
        for (i = 0; i < n; i++) {
            number = 1;
            for (j = 0; j <= i; j++) {
                System.out.println(j + "");
                number++;
            }
            System.out.println();
        }
    }
}
