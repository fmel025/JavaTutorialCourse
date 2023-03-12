package org.example;

public class UpdatingVariables {
    public static void main(String[] args){
        int salary = 1000;

        // añadiendo un bono de $200

        salary += 200;

        System.out.println("El salario nuevo es: $" + salary);

        // Reduciendole 50 dolares
        salary -= 50;

        System.out.println(salary);

        // 2 horas extra $30 c/u
        // Comida: $45

        salary = salary + (30*2) - 45;

        System.out.println(salary);

        // Actualizando Strings

        String employeeName = "José Meléndez";
        // Usando concatenacion
        employeeName = employeeName + " Orellana";
        System.out.println(employeeName);

        employeeName = "Fernando " + employeeName;
        System.out.println(employeeName);
    }
}
