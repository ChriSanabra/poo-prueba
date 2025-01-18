package edu.chris.sanabra.actividades.act1.process;

import java.util.ArrayList;
import java.util.List;

import edu.chris.sanabra.actividades.act1.models.Car;
/**
 * Clase que se encarga de gestionar el stock de autos
 */
public class StockManager {
    ArrayList<Car> stock;


    /**
     * Constructor de la clase
     */
    public StockManager() {
        this.stock = new ArrayList<>();
    }

    /**
     *  genera un nuevo objeto con la informacion de un auto y se agrega
     *  al catalogo de la aplicacion
     * @param modelo el año del auto
     * @param marca empresa productora del
     * @param numeroPuertas
     * @param color Blanco y gris
     */
    public void addCar(String modelo, String marca, int numeroPuertas, String color){
        Car car= new Car(modelo,marca,numeroPuertas,color);
        stock.add(car);

    }

    /**
     * 
     * @return lista de autos en el catalogo
     */
   public List<Car> getStock(){
        return stock;
    }
}