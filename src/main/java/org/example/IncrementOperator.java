package org.example;

public class IncrementOperator {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;

        System.out.println(lives); // 4

        lives--; // Decremento
        System.out.println(lives); // 3

        lives++; // Incremento
        System.out.println(lives);

        // De forma prefija

        // Usando posfijo
        int gift = 100 + lives++;
        System.out.println(gift); // lives deberia estar en 5
        // Pero solo se suman 4 nada mas, devuelve 104

        System.out.println(lives); // Ahora si es 5

        // Usando prefijo
        lives--;
        gift = 100 + ++lives;
        System.out.println(gift); // Ahora si gift suma 5 y devuelve 105


    }
}
