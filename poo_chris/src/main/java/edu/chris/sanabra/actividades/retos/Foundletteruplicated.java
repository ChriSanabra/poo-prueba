package edu.chris.sanabra.actividades.retos;

public class Foundletteruplicated {
    public static void main(String[] args) {
        String palabra = "ayuda";
        char[] letras = palabra.toCharArray();
        boolean found = false;
        for (int i = 0; i < letras.length; i++) {
            for (int j = i + 1; j < letras.length; j++) {
                if (letras[i] == letras[j]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (found) {
            System.out.println("Se encontró una letra duplicada");
            for (int i = 0; i < letras.length; i++) {
                if (letras[0] == letras[i]) {
                    System.out.println("La letra duplicada es: " + letras[i]);
                    System.out.println("La posicion de la letra duplicada es: " + i);
                }
            }
            
        } else {
            System.out.println("No se encontró ninguna letra duplicada");
        }
    }
}