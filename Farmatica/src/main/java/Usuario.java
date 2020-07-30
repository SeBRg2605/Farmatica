
import javax.swing.JOptionPane;

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


//Metodos
public void verificarLogin(String user , String pass){

    int option = 0;
    do{
    String username = JOptionPane.showInputDialog("Escriba nobre de ususario");
    String password = JOptionPane.showInputDialog("Por favor digite su contraseña");
    if (username.equals(user) && password.equals(pass)){
       JOptionPane.showMessageDialog(null,"Bienvenido " + getNombre());
       option = 1;
    } else {
        JOptionPane.showMessageDialog(null,"Error de autentificacion, intente de nuevo por favor");
    }    
  
    }while (option !=1);


}//Fin del metodo verificarLogin



}// Fin de la clase Usuario 
