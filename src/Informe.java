import java.util.Date;

public class Informe {
    private Date fechaAnalisis;
    private String infoUsuario;
    private String resultadosAlmacenados;

    Usuario usuario;
    MedidorDeConsumo medidorDeConsumo;
    public Informe(Usuario usuario, MedidorDeConsumo medidorDeConsumo) {
        this.fechaAnalisis = new Date();
        this.infoUsuario = usuario.nombre + " " + usuario.apellido + " " + usuario.cedula;

    }



    public void generarInforme(){
        System.out.println("----Generando informe----"
                + "\nCantidad de consumo: " + medidorDeConsumo.getConsumoTotal()
                + "\nFecha de análisis: " + fechaAnalisis
                + "\nInformación del usuario: " + infoUsuario + "\n");
                if ((MedidorDeConsumo.analizarDatos() == true)){
                    System.out.println("Alerta de consumo excesivo");
                }
    }


}
