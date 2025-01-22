package edu.chris.sanabra.actividades.retos;

import java.util.Scanner;

public class Inversor {
    public static void main(String[] args) {
        String palabra="";
        int i;
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese una palabra: ");

            palabra = leer.nextLine();
        }

        System.out.println("La palabra original es: " + palabra);
        System.out.println("La palabra invertida es: ");

        for (i = palabra.length() - 1; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
                }
            }
        }
