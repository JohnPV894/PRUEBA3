import java.util.ArrayList;

public class Usuario {

    //contador para ids
    private static int contador =99;
    /* Un usuario tiene atributos de: nombre, apellido, teléfono, email y libros pendientes de devolver. */
    private int id_usuario;
    
    private String nombre;
    private String apellido;
    private int telefono;
    private String email;
    private ArrayList<String> librosDevolverArray = new ArrayList<>();


    public Usuario(String nombre, String apellido, int telefono, String email) {
        this.id_usuario=contador++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.librosDevolverArray = new ArrayList<>();
 
    }
    public Usuario(int id_usuario) {
        this.id_usuario = id_usuario;
        this.librosDevolverArray = new ArrayList<>();
    }
    public int getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<String> getLibrosDevolverArray() {
        return librosDevolverArray;
    }
    public void setLibrosDevolverArray(ArrayList<String> librosDevolverArray) {
        this.librosDevolverArray = librosDevolverArray;
    }
    

    
    
}