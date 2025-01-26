package edu.chris.sanabra.actividades.act2.data;


public class Number {
    /**
     * 
     * @return Arreglo de los numeros pares del 1 al 100
     */
    public static int[] generarNumerosPares() {
        int[] numerosPares = new int[50]; 
        int index = 0;

        
        for (int i = 2; i <= 100; i += 2) {
            numerosPares[index] = i;
            index++;
        }
        return numerosPares;
    }
}

