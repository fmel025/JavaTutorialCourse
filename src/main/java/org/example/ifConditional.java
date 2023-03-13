package org.example;

public class ifConditional {
    public static void main(String[] args) {
        // Just a class for testing if else

        // Scope casi global
        boolean isFlagTrue = false;
        String text;
        text = "We are true";

        if (!isFlagTrue) {
            System.out.println("The flag is false");
            text = "it went to false";
        } else {
            System.out.println("The flag is true");
            int i = 2;
            System.out.println(i);
        }

        System.out.println(text);
    }
}
