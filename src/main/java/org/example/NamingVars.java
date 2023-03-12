package org.example;

// Upper Camel Case
// El nombre de la clase debe ser igual al nombre del archivo.
public class NamingVars {
    public static void main(String[] args){

        // No es ningun tipo xd
        int cellphone = 333777;

        // Este es el lower Camel Case
        int cellPhone = 5555333;

        // Ambas son distintas por el hecho del case-sensitive

        System.out.println(cellphone);
        System.out.println(cellPhone);

        // Crear una constante con la palabra reservada final

        final int POSITION = 3;

        System.out.println(POSITION);

        // Otro ejemplo de Lower Camel Case

        String fullName = "Fernando Jose Melendez Orellana";
        System.out.println(fullName);
    }
}
