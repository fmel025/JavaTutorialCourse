package org.example;

public class DataTypes {
    public static void main(String[] args) {

        // Numeric variables
        int number = 1234567890;

        long numberLong = 12345678901L;

        double numberDecimal = 123.234;

        float numberFloat = 123.234f;

        // Caracteres

        char vocal = 'a';

        // A partir de java 10 podemos ignorar el tipo de dato de variable
        // y agregar un tipo de variable generico a partir del cual
        // Java va a inferir el tipo de dato de la variable.

        var salary = 3000; // it is an int
        System.out.println(salary);

        var pension = salary * 0.03; // is double
        System.out.println(pension);

        var totalSalary = salary - pension; // is double
        System.out.println(totalSalary);

        var employeeName = "Fernando Melendez";
        System.out.println("Employee Name: " + employeeName);
    }
}
