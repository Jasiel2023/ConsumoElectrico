import javax.xml.crypto.Data;
import java.util.Date;

public class Informe {
    private float cantidadConsumo = 0;
    private Date fechaAnalisis;
    private String infoUsuario;
    private String resultadosAlmacenados;

    public float getCantidadConsumo() {
        return cantidadConsumo;
    }

    public void setFechaAnalisis(Date fechaAnalisis) {
        this.fechaAnalisis = new Date();
    }

    public void setInfoUsuario(String infoUsuario) {
        this.infoUsuario = usuario.nombre + " " + usuario.apellido + " " + usuario.cedula;
    }


    


    @Override
    public String toString() {
        return "Informe [cantidadConsumo=" + cantidadConsumo + ", fechaAnalisis=" + fechaAnalisis + ", infoUsuario="
                + infoUsuario + ", resultadosAlmacenados=" + resultadosAlmacenados + "]";
    }



    public void generarInforme(){
        System.out.println("Generando informe..."
                + "\nCantidad de consumo: " + cantidadConsumo
                + "\nFecha de análisis: " + fechaAnalisis
                + "\nInformación del usuario: " + infoUsuario
                + "\nResultados almacenados: " + resultadosAlmacenados);
                if ((MedidorDeConsumo.analizarDatos() == true)){
                    System.out.println("Alerta de consumo excesivo");
                }
    }

    Usuario usuario = new Usuario("Cajas", "0705765628", "Av. 6 de Diciembre", "Richar");
    MedidorDeConsumo medidorDeConsumo;
}
