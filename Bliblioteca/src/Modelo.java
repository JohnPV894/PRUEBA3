import java.util.ArrayList;

public class Modelo {
    private static Modelo instance;
    private static ArrayList<Libro> arrayLibros;
    private static ArrayList<Usuario> arrayUsuarios;



    public static Modelo getInstance(){
        if (instance==null) {
            instance = new Modelo();
        }
        return instance;
    }
    
    //constructor
    public void devolverLibro(String nameLibro){
        for(Libro libro:arrayLibros){
            if (libro.getTitulo().equals(nameLibro)) {
                libro.setLibroDisponible(true);
                
            }
        }
    }
    

    

    public Modelo() {
        Modelo.arrayLibros =  librosIniciales();
        Modelo.arrayUsuarios=new ArrayList<>();

        agregarUsuario("santiago","arenales",616111666,"santiago@gmail.com",1234);
        //agregarUsuario(2);
        //agregarUsuario(3);
    }

    public ArrayList<Libro> librosIniciales(){
        ArrayList<Libro> arrayLibros= new ArrayList<>();

        arrayLibros.add(new Libro("Divina Comedia","Dante Alighieri",1000));
        arrayLibros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes",1001));
        arrayLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1002));
        arrayLibros.add(new Libro("El señor de los anillos", "J.R.R. Tolkien", 1003));
        arrayLibros.add(new Libro("Orgullo y prejuicio", "Jane Austen", 1004));
        arrayLibros.add(new Libro("Matar a un ruiseñor", "Harper Lee", 1005));
        arrayLibros.add(new Libro("Crónica de una muerte anunciada", "Gabriel García Márquez", 1006));
        arrayLibros.add(new Libro("El Arte de la Guerra", "Sun Tzu", 1007));
        arrayLibros.add(new Libro("Las 48 Leyes del Poder", "Robert Greene", 1008));

        return arrayLibros;
    }

    public String mostrarLibros(){
        StringBuilder listaLibros_posicion = new StringBuilder();
        for(int i=0; i < arrayLibros.size() ;i ++){
            String nameLibros = arrayLibros.get(i).getTitulo();
            listaLibros_posicion.append(i+1).append(":").append(nameLibros).append("\n");
        }
        return listaLibros_posicion.toString();
    }
    public void agregarUsuario(String nombre,String apellido,int telefono,String email,int contraseña) {
        Usuario usuario = new Usuario(nombre, apellido, telefono, email,contraseña);
        arrayUsuarios.add(usuario);
        System.out.println("Usuario creado con éxito. ID de usuario asignado: " + usuario.getId_usuario());
    }
    public static Usuario buscUsuarioPorId(int id){
        for(Usuario usuario:arrayUsuarios){
            if (usuario.getId_usuario()==id) {
                return usuario;
            }
        }
        return null;
    }
    public static ArrayList<String> librosDelUsuario(int id){
        for(Usuario usuario:arrayUsuarios){
            if (usuario.getId_usuario()==id) {
                return usuario.getLibrosDevolverArray();
            }
        }
       return new ArrayList<String>();
    }
     
    

    public ArrayList<Libro> sgetArrayLibros() {
        return arrayLibros;
    }
    

    public static ArrayList<Libro> getArrayLibros() {
        return arrayLibros;
    }

    public void setArrayLibros(ArrayList<Libro> arrayLibros) {
        Modelo.arrayLibros = arrayLibros;
    }

    public ArrayList<Usuario> getArrayUsuarios() {
        return arrayUsuarios;
    }

    public void setArrayUsuarios(ArrayList<Usuario> arrayUsuarios) {
        Modelo.arrayUsuarios = arrayUsuarios;
    }
    
}
