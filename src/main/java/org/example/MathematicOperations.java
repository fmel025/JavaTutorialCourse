package org.example;

import java.sql.SQLOutput;

public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.PI); // Imprime el numero PI
        System.out.println(Math.E); // Imprime la constante de Euler

        // Ceil devuelve un entero redondeado hacia arriba
        System.out.println(Math.ceil(x));

        // Floor devuelve un entero redondeado hacia abajo
        System.out.println(Math.floor(x));

        // Devuelve un numero elevado a otro

        System.out.println(Math.pow(x,y));

        // Encontrando el dato mayor entre dos datos

        System.out.println(Math.max(x,y));

        // Encontrando la raiz cuadrada

        System.out.println(Math.sqrt(y));

        // Area de un circulo

        System.out.println(Math.PI * Math.pow(y,2));
    }
}
