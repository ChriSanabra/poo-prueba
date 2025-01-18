package edu.chris.sanabra.actividades.act1.ui;


import java.util.Scanner;

import edu.chris.sanabra.actividades.act1.process.StockManager;

/**
 * Clase que se encarga de la interfaz de usuario
 */
public class CLI {
    /**
     * Metodo que se encarga de correr la aplicacion
     */
    public static void runApp(){
        try (Scanner scanner = new Scanner(System.in)) {
            StockManager stockManager = new StockManager();
            showMenu();
            int opcion = scanner.nextInt();scanner.nextLine();

            while (opcion!=3){
                switch (opcion){
                    case 1:

                        System.out.println("Introduce el numero de puertas");
                        int numPuertas = scanner.nextInt();scanner.nextLine();
                        System.out.println("Introduce el color");
                        String color = scanner.nextLine();
                        System.out.println("Introduce el modelo");
                        String modelo = scanner.nextLine();
                        System.out.println("Introduce el marca");
                        String marca = scanner.nextLine();
                        stockManager.addCar(modelo,marca,numPuertas,color);
                        break;
                    case 2:
                    System.out.println("Catalogo de autos");
                    System.out.println(stockManager.getStock());

                        break;
                    default:
                        System.out.println("opcion no valida");
                }
                showMenu();
                opcion = scanner.nextInt();
            }
        }
    }
    /**Se encarga de imprimir el menú */
    public static void showMenu() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║          SISTEMA DE INVENTARIO         ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║          Seleccione una opción:        ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║  1. Agregar carro                      ║");
        System.out.println("║  2. Ver stock                          ║");
        System.out.println("║  3. Salir                              ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.print("╔═> Opción: ");
    }
    
}