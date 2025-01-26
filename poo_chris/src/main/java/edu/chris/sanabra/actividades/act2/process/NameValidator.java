package edu.chris.sanabra.actividades.act2.process;
import  edu.chris.sanabra.actividades.act2.data.Data;

public class NameValidator {
    /**
     * 
     * @param name Nombre a validar
     * @return true si el nombre esta en la lista, false si no
     */
    public static boolean validateName(String name){
        String storedName = name.toLowerCase();
        boolean isValid = false;
        for(String nameToValidate: Data.nombres){
            if(nameToValidate.toLowerCase().equals(storedName)){
                isValid = true;
                break;
            }
        }
        return isValid;
    }

}
