import java.util.ArrayList;

public class Usuario {
    //comit 2
    //contador para ids
    private static int contador =99;
    /* Un usuario tiene atributos de: nombre, apellido, teléfono, email y libros pendientes de devolver. */
    private int id_usuario;
    
    private String nombre;
    private String apellido;
    private int telefono;
    private String email;
    private static ArrayList<String> librosDevolverArray = new ArrayList<>();
    private int contraseña;


    public Usuario(String nombre, String apellido, int telefono, String email,int contraseña) {
        this.id_usuario=contador++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        Usuario.librosDevolverArray = new ArrayList<>();
        this.contraseña=contraseña;

 
    }
    public Usuario(int id_usuario) {
        this.id_usuario = id_usuario;
        //this.librosDevolverArray = new ArrayList<>();
    }
    public static void pedirUnLibro(Libro libro){
 
        librosDevolverArray.add(libro.getTitulo());
        libro.setLibroDisponible(false);
        System.out.println("Libro "+libro.getTitulo()+"ah sido alquilado correctamente ahora se encuentra en su poder");
    }
    
    public static String mostrarLibrosUsuario(){
        StringBuilder listaLibros = new StringBuilder();
        if (librosDevolverArray.isEmpty()) {
            listaLibros.append("No tienes libros pendientes por devolver.");
        } else {
            listaLibros.append("Estos son tus libros pendientes por devolver:\n");
            for (int i = 0; i < librosDevolverArray.size(); i++) {
                listaLibros.append((i + 1)).append(": ").append(librosDevolverArray.get(i)).append("\n");
            }
        }
        return listaLibros.toString();
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
    public static ArrayList<String> getLibrosDevolverArray() {
        return librosDevolverArray;
    }
    public void setLibrosDevolverArray(ArrayList<String> librosDevolverArray) {
        this.librosDevolverArray = librosDevolverArray;
    }
    

    
    
}