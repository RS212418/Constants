package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double VAT = 0.2;
        Scanner input = new Scanner(System.in);
        System.out.println("Input cash amount");
        int amount;
        amount = input.nextInt();
        double perecentage = 100.0 * VAT;
        double total;
        total = (amount + VAT*amount);
        System.out.println(total);
    }
}
