// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Cajas", "0705765628", "Av. 6 de Diciembre", "Richard");
        Informe informe1 = new Informe(usuario1);
        informe1.generarInforme();
    }
}