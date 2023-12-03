import java.util.ArrayList;
public class Usuario {
    protected String apellido;
    protected String cedula;
    protected String direccion;
    protected String nombre;
    ArrayList<Informe> informeList;
    public Usuario(String apellido, String cedula, String direccion, String nombre) {
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.nombre = nombre;
        informeList = new ArrayList<>();
    }
    public String getApellido() {return apellido;}
    public String getCedula() {return cedula;}
    public String getNombre() {return nombre;}
    public boolean identificarUsuario(){return true;}
}
