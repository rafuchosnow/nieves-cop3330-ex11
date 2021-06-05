package org.example;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        String euroString = input.nextLine();
        float euroNumber = Float.parseFloat(euroString);

        System.out.print("What is the exchange rate? ");
        String rateString = input.nextLine();
        float rateNumber = Float.parseFloat(rateString);

        float conversion = euroNumber * rateNumber;

        DecimalFormat dfDollar = new DecimalFormat("#.##");

        System.out.println(euroNumber + " euros at an exchange rate of " + rateNumber + " is\n"
                           + dfDollar.format(conversion) + " U.S. dollars.");
    }
}
