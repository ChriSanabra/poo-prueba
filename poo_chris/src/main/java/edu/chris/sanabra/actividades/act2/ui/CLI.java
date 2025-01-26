package edu.chris.sanabra.actividades.act2.ui;

import edu.chris.sanabra.actividades.act2.data.Number;
import edu.chris.sanabra.actividades.act2.process.NameValidator;
import java.util.Scanner;


public class CLI {
    /**
     * Método que ejecuta la aplicación
     */
    public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        int[] numerosPares = Number.generarNumerosPares();
        showMenu();
        int opcion = scanner.nextInt();scanner.nextLine();   
        
        while (opcion !=3) {
            switch (opcion) {
                case 1:
                    
                    System.out.println("╔═════════════════════╗");
                    System.out.println("║ ¿Cuál es tú nombre? ║");
                    System.out.println("╚═════════════════════╝");
                    String name = scanner.nextLine();
                    if (NameValidator.validateName(name)) {
                        System.out.println("╔═══════════════════════════════════════════╗");
                        System.out.println("║ Tu nombre es especial, ¡está en la lista! ║");
                        System.out.println("╚═══════════════════════════════════════════╝");
                    
                    } else {  
                        System.out.println("╔═════════════════════════════════════════╗");
                        System.out.println("║ No está tú nombre, será para la otra :( ║");
                        System.out.println("╚═════════════════════════════════════════╝");
                    }
                    break;
                case 2:
                
                    System.out.println("╔═══════════════════════════════════════════════════════╗");
                    System.out.println("║  Te mostraré los numeros pares que hay hasta el 100 : ║");
                    System.out.println("╚═══════════════════════════════════════════════════════╝");
                    numerosPares = Number.generarNumerosPares();
                    mostrarNumeros(numerosPares);
                    System.out.println();
                    break;
                default:
                   
                    System.out.println("╔═══════════════════════════════════════════════════════════╗");
                    System.out.println("║  Eso no es correcto mi amigo, las opciones son del 1 al 3 ║");
                    System.out.println("╚═══════════════════════════════════════════════════════════╝");
                    break;
            }
            
            showMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
        }
        
        System.out.println("╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║  ¡Bye, bye! ¡Muchas gracias por utilizar el menú de Chris!     ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝");


    } 

   /**
     * Método que muestra los números pares del 2 al 100
     * @param numeros Arreglo de los números pares
     */
    public static void mostrarNumeros(int[] numeros) {
        System.out.println("╔═════════════════════════════╗");
        System.out.println("║ Números pares del 2 al 100: ║");
        System.out.println("╚═════════════════════════════╝");
        for (int i=0; i< numeros.length; i++){ 
            System.out.printf("%6d",numeros[i]);
            if((i+1)%10==0){
                System.out.println();
            }
        }
    }
    /**
     * Método que muestra el menú de la aplicación
     */
    public static void showMenu(){
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║                  MENÚ              ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║     1. Validar Nombres             ║");
        System.out.println("║     2. Generador de números pares  ║");
        System.out.println("║     3. Salir                       ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.print("Seleccione una opción: ");

    }
}