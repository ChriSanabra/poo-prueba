package edu.chris.sanabra.actividades.act1.models;

/**
 * Clase que se encarga de gestionar los autos
 */
public class Car {
    private String modelo;
    private String marca;
    private int numeroPuertas;
    private String color;

    @Override
    /**
     * 
     * @return una cadena de texto con la informacion del auto
     */
    public String toString() {
        return "Car{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", numeroPuertas=" + numeroPuertas +
                ", color='" + color + '\'' +
                '}';
    }
    /**
     * 
     * @param modelo el año del auto
     * @param marca empresa del auto
     * @param numeroPuertas numero de puertas del auto
     * @param color Blanco y gris por dar algun ejemplo
     */
    public Car(String modelo, String marca, int numeroPuertas, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
        this.color = color;
        this.setNumeroPuertas(numeroPuertas);
    }
    /**
     * 
     * @return el numero de puertas del auto
     */
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /**
     * 
     * @param numeroPuertas pone un limite de 2 a 5 puertas, asertando que el numero de puertas sea valido
     */

    public void setNumeroPuertas(int numeroPuertas) {
        if(numeroPuertas<2 || numeroPuertas>5){
            throw new IllegalArgumentException("numero de puertas valido esta entre 2 y 5");
        }

        this.numeroPuertas = numeroPuertas;
    }
    /**
     * 
     * @return el modelo del auto
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * 
     * @param modelo pone el modelo del auto
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * 
     * @return la marca del auto
     */
    public String getMarca() {
        return marca;
    }
    /**
     * 
     * @param marca pone la marca del auto
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * 
     * @return el color del auto
     */
    public String getColor() {
        return color;
    }
    /**
     * 
     * @param color pone el color del auto
     */
    public void setColor(String color) {
        this.color = color;
    }



}
