import java.util.ArrayList;

public class Registro {
    ArrayList<Dispositivos> dispositivoList;
    Registro registro;
    ArrayList<registroDispositivos> registroDispositivos;

    public Registro(ArrayList<Dispositivos> dispositivoList, Registro registro, ArrayList<registroDispositivos> registroDispositivos) {
        this.dispositivoList = new ArrayList<>();
        this.registro = registro;
        this.registroDispositivos = new ArrayList<>();
    }

    public void registrarDispositivos(){
    }
    public void modificarRegistro(){
    }

    MedidorDeConsumo medidorDeConsumo;
}
