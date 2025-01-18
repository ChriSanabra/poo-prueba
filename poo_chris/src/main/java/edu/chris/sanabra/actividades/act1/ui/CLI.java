package edu.chris.sanabra.actividades.act1.ui;


import java.util.Scanner;

import edu.chris.sanabra.actividades.act1.process.StockManager;

public class CLI {
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
    public static void showMenu(){
        System.out.println("""
                Menu
                1. agregar Carro al catalogo
                2. mostrar catalogo
                3. Salir
                """);
    }
    public static void ShowMessage(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ShowMessage'");
    }
    public static void ShowError(Object object) {
        //TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ShowError'");
    }
}