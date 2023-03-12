package org.example;

public class CastingVariables {
    public static void main(String[] args) {
        // "Transformar" un double a entero
        double numberD = 12.34;
        int number = (int) numberD;

        System.out.println(numberD);
        System.out.println(number);

        // Se truncan los decimales dentro de number
        // Pero en numberD se mantienen sus decimales.

        // Estimacion
        double monthlyDogs = 30.0/12.0;

        int estimatedMonthlyDogs = (int) monthlyDogs;

        System.out.println(estimatedMonthlyDogs);
        System.out.println(monthlyDogs);

        // Exactitud

        int a = 30;
        int b = 12;

        System.out.println((double) a/b);
    }
}
