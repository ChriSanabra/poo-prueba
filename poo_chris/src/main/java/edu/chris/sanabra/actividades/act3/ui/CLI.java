package edu.chris.sanabra.actividades.act3.ui;

import edu.chris.sanabra.actividades.act3.models.Product;
import edu.chris.sanabra.actividades.act3.process.StoreStockManager;
import edu.chris.sanabra.actividades.act3.process.ProductPriceCalculator;

import java.util.Scanner;


/**
 * CLI es la clase que se encarga de la interfaz de línea de comandos para nuestra aplicación de gestión de stock de una tienda.
 */
public class CLI {

    static StoreStockManager storeManager = new StoreStockManager();

    /**
     * Método que se encarga de correr la aplicación y mostrar el menú principal.
     */
    public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 5) {
            showMenu();
            while (true) {
                System.out.print("\u001B[36mIngrese una opción: \u001B[0m");
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    System.out.println("\u001B[31m[Error] La entrada no puede estar vacía.\u001B[0m");
                    continue;
                }
                try {
                    opcion = Integer.parseInt(input);
                    if (opcion < 1 || opcion > 5) {
                        System.out.println("\u001B[33m[Advertencia] Seleccione un número válido del menú.\u001B[0m");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\u001B[31m[Error] Solo se permiten números.\u001B[0m");
                }
            }

            switch (opcion) {
                case 1:
                    consultarPrecioRecomendado(scanner);
                    break;
                case 2:
                    agregarProducto(scanner);
                    break;
                case 3:
                    mostrarStock();
                    break;
                case 4:
                    compararProductos();
                    break;
                case 5:
                    System.out.println("\u001B[32mGracias por usar la aplicación.");
                    break;
            }
        }
    }
    /**
     * Método que se encarga de solicitar al usuario el precio del producto y el porcentaje de utilidad.
     * @param scanner el objeto de tipo Scanner que se utiliza para leer la entrada del usuario.
     * @return el precio final del producto con el impuesto incluido.
     */
    private static void consultarPrecioRecomendado(Scanner scanner) {
        System.out.println("\u001B[34m[Consulta Precio]\u001B[0m Introduce el precio del producto:");
        double price = solicitarNumeroPositivo(scanner, "Precio: ");

        System.out.println("\u001B[34mIntroduce el porcentaje de utilidad:\u001B[0m");
        double utility = solicitarNumeroPositivo(scanner, "Utilidad (%): ");

        double finalPrice = ProductPriceCalculator.getPrice(price, utility);
        System.out.printf("\u001B[32mPrecio sugerido: %.2f pesos para una utilidad del %.2f%%\u001B[0m\n", finalPrice, utility);
    }
    /**
     * Método que se encarga de solicitar al usuario los datos del producto a agregar.  
     * @param scanner el objeto de tipo Scanner que se utiliza para leer la entrada del usuario.
     * @return void 
     */
    private static void agregarProducto(Scanner scanner) {
        System.out.println("\u001B[34m[Agregar Producto]\u001B[0m");

        double cost = solicitarNumeroPositivo(scanner, "Costo: ");

        System.out.print("Descripción: ");
        String description = solicitarTextoNoVacio(scanner);

        System.out.print("Código: ");
        String code = solicitarTextoNoVacio(scanner);

        System.out.print("Tipo de producto: ");
        String type = solicitarTextoNoVacio(scanner);

        double tax = cost * 0.16;

        storeManager.addProduct(description, cost, code, type, tax);
        System.out.println("\u001B[32mProducto agregado con éxito! \u2714\u001B[0m");
    }
    /**
     * Método que se encarga de mostrar el stock de la tienda.
     * @return void
     */
    private static void mostrarStock() {
        if (storeManager.getProducts().isEmpty()) {
            System.out.println("\u001B[33m[Catálogo Vacío] No hay productos disponibles.\u001B[0m");
        } else {
            System.out.println("\u001B[34m[Stock Disponible]\u001B[0m");
            storeManager.getProducts().forEach(CLI::showProduct);
        }
    }
    /**
     * Método que se encarga de comparar los productos almacenados en la tienda.
     * @return void
     */
    private static void compararProductos() {
        if (storeManager.getProducts().size() < 2) {
            System.out.println("\u001B[31m[Error] No hay suficientes productos para comparar.\u001B[0m");
        } else {
            System.out.println("\u001B[34mComparando productos...\u001B[0m");
            String resultado = compareProducts(storeManager.getProducts().get(0), storeManager.getProducts().get(1));
            System.out.println(resultado);
        }
    }
    /**
     * Método que se encarga de solicitar al usuario un número positivo.
     * @param scanner el objeto de tipo Scanner que se utiliza para leer la entrada del usuario.
     * @param mensaje el mensaje que se mostrará al usuario.
     * @return el número ingresado por el usuario.
     */
    private static double solicitarNumeroPositivo(Scanner scanner, String mensaje) {
        double numero = -1;
        while (numero < 0) {
            try {
                System.out.print(mensaje);
                numero = Double.parseDouble(scanner.nextLine().trim());
                if (numero < 0) {
                    System.out.println("\u001B[31m[Error] El número no puede ser negativo.\u001B[0m");
                }
            } catch (NumberFormatException e) {
                System.out.println("\u001B[31m[Error] Solo se permiten números.\u001B[0m");
            }
        }
        return numero;
    }
    /**
     * Método que se encarga de solicitar al usuario un texto no vacío.
     * @param scanner el objeto de tipo Scanner que se utiliza para leer la entrada del usuario.
     * @return el texto ingresado por el usuario.
     */
    private static String solicitarTextoNoVacio(Scanner scanner) {
        String texto;
        while (true) {
            texto = scanner.nextLine().trim();
            if (!texto.isEmpty()) {
                break;
            }
            System.out.println("\u001B[31m[Error] La entrada no puede estar vacía.\u001B[0m");
        }
        return texto;
    }
    /**
     * Método que se encarga de comparar dos productos y determinar cuál es más caro.
     * @param producto1 el primer producto a comparar.
     * @param producto2 el segundo producto a comparar.
     * @return un mensaje indicando cuál de los dos productos es más caro.
     */
    public static String compareProducts(Product producto1, Product producto2) {
        if (producto1.getPrice() > producto2.getPrice()) {
            return "\u001B[34mEl producto 1 es más caro que el producto 2\u001B[0m";
        } else if (producto1.getPrice() < producto2.getPrice()) {
            return "\u001B[34mEl producto 2 es más caro que el producto 1\u001B[0m";
        } else {
            return "\u001B[34mLos productos tienen el mismo precio\u001B[0m";
        }
    }
    /**
     * Método que se encarga de mostrar la información de un producto.
     * @param producto el producto a mostrar.
     * @return void
     */
    public static void showProduct(Product product) {
        System.out.println("\u001B[32m-----------------------------\u001B[0m");
        System.out.printf("Descripción: %s\n", product.getDescription());
        System.out.printf("Precio: %.2f\n", product.getPrice());
        System.out.printf("Código: %s\n", product.getCode());
        System.out.printf("Tipo: %s\n", product.getType());
        System.out.printf("Impuesto: %.2f%%\n", product.getTax());
        System.out.println("\u001B[32m-----------------------------\u001B[0m");
    }
    /**
     * Método que se encarga de mostrar el menú principal de la aplicación.
     * @return void
     */
    public static void showMenu() {
        System.out.println("\u001B[35m====================================\u001B[0m");
        System.out.println("         MENÚ PRINCIPAL         ");
        System.out.println("\u001B[35m====================================\u001B[0m");
        System.out.println("  1. Consultar precio recomendado  ");
        System.out.println("  2. Agregar producto al stock     ");
        if (storeManager.getProducts().size() >= 1) {
            System.out.println("  3. Mostrar stock de la tienda    ");
        }
        if (storeManager.getProducts().size() >= 2) {
            System.out.println("  4. Comparar productos almacenados");
        }
        System.out.println("  5. Salir                         ");
        System.out.println("\u001B[35m====================================\u001B[0m");
    }
}  
