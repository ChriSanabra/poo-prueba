package edu.chris.sanabra.actividades.retos;

public class Valormaschico {
    public static void main(String[] args) {
        int[] numeros = {10, 55, 5, 12, 8};
        int min = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        System.out.println("El valor más chico es: " + min);
    }
}
