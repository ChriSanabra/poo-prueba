package edu.chris.sanabra.actividades.act1.ui;

public class CLI {
    public static void ShowMenu() {
        System.out.println("Sea bienvenido al consesionario run run");
        System.out.println("1. Agrega un carrito");
        System.out.println("2. Mostrar fecha del coche"); 
        System.out.println("3. Salir"); 
    }

    public static void ShowMessage(String message) {
        System.out.println(message);
    }

    public static void ShowError(String message) {
        System.out.println("Error: " + message);
    }

    public static void ShowCarrito(String marca, String modelo, String color, String fecha) {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Fecha: " + fecha);
    }
}
