package edu.chris.sanabra.actividades.proyectoFinal.models;


/**
 * Clase que se encarga de gestionar los libros del sistema
*/
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    private int year;
    private String genre;

   /**
    * Constructor de la clase Book que inicializa los atributos de la clase 
    * @param title
    * @param author
    * @param isbn
    * @param available
    * @param year
    * @param genre
   */
    
    public Book(String title, String author, String isbn, boolean available, int year, String genre) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setAvailable(available);
        setYear(year);
        setGenre(genre);
    }

    /**
        * Método que comprueba si el libro está disponible
        * @return available
        */
    public boolean available(){
        if(!available){
            available=false;
            return false;
        }
        return true;
    }
    
    /**
     * Método que commprueba si el libro está disponible o si sigue prestado.
    */

    public boolean returnBook(){
        if (available) {
            available= true;
            return true;
        }
        return false;
    }

 /**
  * Método que devuelve el título del libro
  * @return title
 */

    public String getTitle() {
        return title;
    }
    
   /**
    * Método que lanza una expeción si el título está vacío
    * @param title
   */

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío.");
        }
        this.title = title;
    }

    /**
     * Método que toma el autor del libro y lo devuelve
     * @return author
    */

    public String getAuthor() {
        return author;
    }

    /**
     * Método que lanza una expeción si el autor está vacío
     * @param author
    */

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacío.");
        }
        this.author = author;
    }

    /**
     * Método que toma el isbn del libro y lo devuelve
     * @return isbn
    */

    public String getIsbn() {
        return isbn;
    }

    /**
     * Método que lanza una expeción si el isbn está vacío
     * @param isbn
    */

    public void setIsbn(String isbn) {
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new IllegalArgumentException("El ISBN no puede estar vacío.");
        }
        this.isbn = isbn;
    }

    /**
     * Método que toma el año del libro y lo devuelve
     * @return available
    */

    public boolean getAvailable() {
        return available;
    }

    /**
     * Método que lanza una expeción si el libro no está disponible
     * @param available
    */

    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Método que toma el año del libro y lo devuelve
     * @return year
    */

    public int getYear() {
        return year;
    }

    /**
     * Método que lanza una expeción si el año no  concuerda con los años de vida que llevamos
     * @param year
    */

    public void setYear(int year) {
        if (year < 0 && year > 2025) {
            throw new IllegalArgumentException("El año no puede ser negativo ni mayor a nuestro año actual, 2025.");            
        }
        this.year = year;
    }

    /**
     * Método que toma el género del libro y lo devuelve
     * @return genre
    */

    public String getGenre() {
        return genre;
    }

    /**
     * Método que lanza una expeción si el género está vacío
     * @param genre
    */

    public void setGenre(String genre) {
        if (genre == null || genre.trim().isEmpty()) {
            throw new IllegalArgumentException("El género no puede estar vacío.");
        }
        this.genre = genre;
    }


}