// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Cajas", "0705765628", "Av. 6 de Diciembre", "Richar");
        Informe informe1 = new Informe();
       // System.out.println("Usuario: " + usuario1.getNombre() + " " + usuario1.getApellido() + " " + usuario1.getCedula());
        informe1.setInfoUsuario(usuario1.getNombre() + usuario1.getApellido() + usuario1.getCedula());
        System.out.println(informe1);
    }
}