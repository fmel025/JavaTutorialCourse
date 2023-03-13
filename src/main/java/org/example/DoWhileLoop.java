package org.example;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese su opcion: ");
            response = Integer.parseInt(sc.nextLine());
            System.out.println("La opcion escogida fue: " + response);
        } while (response != 0);
        System.out.println("Bye bye");
    }
}
