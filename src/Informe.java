import javax.xml.crypto.Data;
import java.util.Date;

public class Informe {
    private float cantidadConsumo = 0;
    private Date fechaAnalisis;
    private String infoUsuario;
    private String resultadosAlmacenados;


    public Informe(Usuario usuario) {
        this.fechaAnalisis = new Date();
        this.infoUsuario = usuario.nombre + " " + usuario.apellido + " " + usuario.cedula;

    }

    public float getCantidadConsumo() {
        return cantidadConsumo;
    }

    public void setFechaAnalisis(Date fechaAnalisis) {
        this.fechaAnalisis = new Date();
    }


    public void generarInforme(){
        System.out.println("Generando informe..."
                + "\nCantidad de consumo: " + cantidadConsumo
                + "\nFecha de análisis: " + fechaAnalisis
                + "\nInformación del usuario: " + infoUsuario + "\n");
                if ((MedidorDeConsumo.analizarDatos() == true)){
                    System.out.println("Alerta de consumo excesivo");
                }
    }

    Usuario usuario;
    MedidorDeConsumo medidorDeConsumo;
}
