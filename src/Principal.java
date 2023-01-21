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
                
                if (ValidarInput(ingresarMonto) == true) {
                    double montoDouble = Double.parseDouble(ingresarMonto);
                    
                    monedas.ConvertirMonedas(montoDouble);
                    
                    resp = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                    if (JOptionPane.OK_OPTION == resp) {
                        System.out.println("Selecciono opción afirmativa");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa terminado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Valor invalido");
                }
                break;
            case "Conversor de Temperatura":
                String temperaturaAConvertir = JOptionPane
                        .showInputDialog("Ingresa el valor de la temperatura que deseas convertir");
                
                if (ValidarInput(temperaturaAConvertir) == true) {
                    double temperaturaDouble = Double.parseDouble(temperaturaAConvertir);
                    
                    temperatura.ConvertirTemperatura(temperaturaDouble);
                    
                    resp = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                    if (JOptionPane.OK_OPTION == resp) {
                        System.out.println("Selecciono opción afirmativa");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa terminado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Valor invalido");
                }
                break;
        }
    }

    public static boolean ValidarInput(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0) {
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }
}
