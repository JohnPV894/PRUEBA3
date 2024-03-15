import java.util.ArrayList;
import java.util.Scanner;
public class App {
    
    /*Actividad Biblioteca

    Hacer biblioteca con usuarios y libros que simule el alquiler de libros por parte de los usuarios.
    Un usuario tiene atributos de: nombre, apellido, teléfono, email y libros pendientes de devolver.
    Un libro tiene atributos de: título, autor y isbn.
    Debe mostrar un menú que permita las opciones de: acceder a un usuario, ver libros disponibles, 
    ver libros pendientes de devolver(por el usuario), pedir un libro y devolver un libro.
    Todo esto se debe subir a un repositorio del cual me compartiréis el enlace. */
    public static void main(String[] args) throws Exception {
        

        
        Scanner sc = new Scanner(System.in);
        int option=0;
    
        //Biblioteca biblioteca1.getInstance()= new Biblioteca();
        
        
        while (option!=4) {
            System.out.println(
                "introduca el numero de opcion que desea \n"+
                "(0): Crear usuario \n"+
                "(1): Acceder a un usuario \n"+//\3
                "(2): Ver libros disponibles \n"+
                "(3): Devolver un libro \n"+
                "(4): Salir/Exit"
            
            );
            option=sc.nextInt();
            switch (option) {
                case 0:
                    //crear nuevo user
                    System.out.println("Introduzca el nombre del usuario:");
                    String nombre = sc.next();

                    System.out.println("Introduzca el apellido del usuario:");
                    String apellido = sc.next();

                    System.out.println("Introduzca el teléfono del usuario:");
                    int telefono = sc.nextInt();

                    System.out.println("Introduzca el email del usuario:");
                    String email = sc.next();

                    System.out.println("Digite una contraseña(solo y EXCLUSIVAMENTE numerica)");
                    int contraseña = sc.nextInt();
                    
                    //construir user
                    Modelo.getInstance().agregarUsuario(nombre,apellido,telefono,email,contraseña);
                    break;
                case 1:
                    System.out.println("Introduzca su id de usuario para acceder ");
                    int LaID =sc.nextInt();

                    System.out.println("Introduzca su contraseña para acceder");
                    int IDdelUsuarioActual=LaID;
                    Usuario usuario1 = Modelo.buscUsuarioPorId(LaID);
                    if (usuario1 != null) {
                        System.out.println("¡Usuario encontrado!");
                        
                    } else {
                        System.out.println("Usuario no encontrado. Verifica el ID.");
                    }
                    break;
                    
                case 2:
                    System.out.println("Introduzca el NUMERO de libro que desea pedir o reservar");
                    System.out.println(Modelo.getInstance().mostrarLibros());

                    int libroSolicitado=sc.nextInt();
                    if (libroSolicitado >0 && libroSolicitado<=Modelo.getInstance().sgetArrayLibros().size()) {
                        
                        Libro libroPedido=Modelo.getArrayLibros().get(libroSolicitado-1);
                        if (libroPedido.isLibroDisponible()) {
                            Usuario.pedirUnLibro(libroPedido);
                        }else{
                            System.out.println("libro no disponible si lo desea puede reservar");
                        }
                        
                    }else{
                        System.out.println("Número de libro no válido. Por favor, introduzca un número válido.");
                    
                    }
                    break;

                case 3:
                    System.out.println("Que libro desea devolver");
                    Usuario.mostrarLibrosUsuario();
                    int libroADevolver = sc.nextInt();
                    if (libroADevolver > 0 && libroADevolver <= Usuario.getLibrosDevolverArray().size()) {
                    String libroDevuelto = Usuario.getLibrosDevolverArray().remove(libroADevolver - 1);
                     Modelo.getInstance().devolverLibro(libroDevuelto);
                     System.out.println("¡El libro '" + libroDevuelto + "' ha sido devuelto con éxito!");
                    } else {
                    System.out.println("Número de libro no válido. Por favor, introduzca un número válido.");
                    }   
        
    
                    break;

                case 4:
                    System.out.println("Porfavor recuerde devolver sus libros Gracias");
                    System.out.println("buen dia y vuelva pronto");
                    break;
                default:
                    System.out.println("Digito invalido, Porfavor introduzca un numero valido de accion");
                    break;
            }
        }
        sc.close();
    }
}
