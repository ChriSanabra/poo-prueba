package edu.chris.sanabra.actividades.act2.data;

public class Data {
    private String name;
    /**
     * 
     * @param nombres Arreglo de los nombres en la lista
     */
    public static String[] nombres= {"Christian", "Jose", "Saul", "Humberto", "Sahid", "Victor", "Sebastian"};

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}