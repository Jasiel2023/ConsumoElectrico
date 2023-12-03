import java.util.ArrayList;

public class MedidorDeConsumo {
    private static float consumoTotal;
    Registro registro;
    public static float getConsumoTotal() {
        return consumoTotal;
    }

    public static boolean analizarDatos(){
        if (MedidorDeConsumo.consumoTotal>400) {
            return true;
        } else {
            return false;
        }
    }

    public float consumoIndividual(){
        return 0;
    }
    
    public void CalcularConsumoTotal(){
        this.consumoTotal = 0;
    }
}
