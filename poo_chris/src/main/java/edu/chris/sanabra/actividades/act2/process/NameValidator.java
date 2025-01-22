package edu.chris.sanabra.actividades.act2.process;

public class NameValidator {
    public static boolean validateName(String name) {
    boolean valid = false;
    int index = 0;
        while(!valid && index <nombres.length){
            if(nombres[index].equals(name)){
                valid = true;
            }
        }
    }
}
