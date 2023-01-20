import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) throws Exception {
        String opciones = (JOptionPane.showInputDialog(
                null,
                "Seleccione una opcion de conversión",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[] {
                        "Conversor de Moneda",
                        "Conversor de Temperatura"
                }, "Seleccion")).toString();
    }
}
