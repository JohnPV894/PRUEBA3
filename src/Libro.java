public class Libro {
    /*Un libro tiene atributos de: título, autor y isbn. */
    private String titulo;
    private String autor;
    private int isbn;
    private boolean libroDisponible;

    
    public Libro(String titulo, String autor, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.libroDisponible=true;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getIsbn() {
        return isbn;
    }


    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }


    public boolean isLibroDisponible() {
        return libroDisponible;
    }


    public void setLibroDisponible(boolean libroDisponible) {
        this.libroDisponible = libroDisponible;
    }

    
}
