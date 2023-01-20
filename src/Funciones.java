import javax.swing.JOptionPane;

public class Funciones {
	ConvertirMonedas monedas = new ConvertirMonedas();

	public void ConvertirMonedas(double dato) {
		String opcion = (JOptionPane.showInputDialog(
			null, 
			"Elije la moneda a la que desea convertir el monto", 
			"Monedas", 
			JOptionPane.PLAIN_MESSAGE,
			null,
			new Object[] {
				"De peso argentino a Dólar",
				"De peso argentino a Peso Chileno",
				"De peso argentino a Real"
				}, "Seleccion")).toString();
		
		switch (opcion) {
			case "De peso argentino a Dólar":
				monedas.ConversorPesosArgentinosAOtraMoneda(dato, 183.45, " Dolares");
				break;
			case "De peso argentino a Peso Chileno":
				monedas.ConversorPesosArgentinosAOtraMoneda(dato, 0.23, " Pesos chilenos");
				break;
			case "De peso argentino a Real":
				monedas.ConversorPesosArgentinosAOtraMoneda(dato, 35.23, " Reales");
				break;
		}
	}
}
