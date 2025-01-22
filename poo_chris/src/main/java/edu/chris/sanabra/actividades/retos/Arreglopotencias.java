package edu.chris.sanabra.actividades.retos;

public class Arreglopotencias {
    public static void main(String[] args) {
        int[] numeros = {-6, -1, 4, 5, 6};
        int[] potencias = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            potencias[i] = (int) Math.pow(numeros[i], 2);
        }
        for (int i = 0; i < potencias.length; i++) {
            System.out.println("El cuadrado de " + numeros[i] + " es: " + potencias[i]);
        }
    }
}
