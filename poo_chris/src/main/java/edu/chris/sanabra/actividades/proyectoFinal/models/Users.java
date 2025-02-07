package edu.chris.sanabra.actividades.proyectoFinal.models;

import java.util.ArrayList;

/**
 * Clase que se encarga de gestionar los usuarios del sistema
 */

public class Users {

    public ArrayList<String> borrowedBooks;
    private String username;
    private String password;

    /**
     * Se crea un usuario por defecto con el nombre de usuario "admin" y la contraseña "admin"
     */
    public Users(String username, String password) {
        setUsername(username);
        setPassword(password);
        borrowedBooks= new ArrayList<>();
    }

    /**
     * Método que añade un usuario a la lista de usuarios
     * @param book
     * Se añade el libro a la lista de libros prestados
    */

    public void lendBook(String book){
        borrowedBooks.add(book);
    }

    /**
     * Método que devuelve la lista de libros prestados
     * @return borrowedBooks
    */

    public void returnBook(String book){
        borrowedBooks.remove(book);
    }

  

    public ArrayList<String> getBorrowedBooks(){
        return(borrowedBooks);
    }

  

    public String getUsername() {
        return username;
    }

    /**
     * Método que devuelve el nombre de usuario
     * @param username
    */
    
    public void setUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de usuario no puede estar vacío.");
        }
        this.username = username;
    }

 

    public String getPassword() {
        return password;
    }

    /**
     * En caso de que la contraseña esté vacía se lanza una excepción
     * @param password
    */

    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("La contraseña no puede estar vacía.");
        }
        this.password = password;
    }


}