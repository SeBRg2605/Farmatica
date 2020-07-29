/**
 *
 * @author Sebastián Rojas Guzmán
 */
public class Usuario {
    
   //Atributos de la clase Usuario 
    
   private String username;
   private String password;
   private String nombre;
   private String apellidos; 

   


//Contructor
   
public Usuario(String username, String password, String nombre, String apellidos) {
    this.username = username;
    this.password = password;
    this.nombre = nombre;
    this.apellidos = apellidos;
   
 }//Fin del Coonstructor
 


//Get y Set  

public String getUsername() {
        return username;
    }

public void setUsername(String username) {
        this.username = username;
    }
public String getPassword() {
    return password;
    }

public void setPassword(String password) {
    this.password = password;
    }

public String getNombre() {
    return nombre;
    }

public void setNombre(String nombre) {
    this.nombre = nombre;
    }

public String getApellidos() {
    return apellidos;
    }

public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
    
} // Fin de los Get y Set





}// Fin de la clase Usuario 
