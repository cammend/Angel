package sesion;

/**
 *
 * @author cammend
 */
public class Sesion {
    private String nombreUsuario;
    private String Asociación;
    
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    
    public boolean haySesion(String nombre){
        if( nombreUsuario == null ){
            return false;
        }
        if( nombre.equals(nombreUsuario) ){
            return true;
        }
        return false;
    }
    
    public boolean comprobarInicioSesion(String nombre, String pass){
        if( nombre.equals("cammend") && pass.equals("cammend") ){
            nombreUsuario = "cammend";
            return true;
        }
        return false;
    }
}
