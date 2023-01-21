import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) throws Exception {
        
        int resp = 0;
        FuncionCotizacion monedas = new FuncionCotizacion();
        FuncionTemperatura temperatura = new FuncionTemperatura();
        
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

        switch (opciones) {
            case "Conversor de Moneda":
                String ingresarMonto = JOptionPane.showInputDialog("Ingrese la cantidad de dinero para convertir: ");
                double montoDouble = Double.parseDouble(ingresarMonto);
                
                monedas.ConvertirMonedas(montoDouble);
                
                resp = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                if (JOptionPane.OK_OPTION == resp) {
                    System.out.println("Selecciono opción afirmativa");
                } else {
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                }
                break;
            case "Conversor de Temperatura":
                String temperaturaAConvertir = JOptionPane
                        .showInputDialog("Ingresa el valor de la temperatura que deseas convertir");
                double temperaturaDouble = Double.parseDouble(temperaturaAConvertir);
                
                temperatura.ConvertirTemperatura(temperaturaDouble);
                
                resp = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                if (JOptionPane.OK_OPTION == resp) {
                    System.out.println("Selecciono opción afirmativa");
                } else {
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                }
                break;
        }
    }
}
