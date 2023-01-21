import javax.swing.JOptionPane;

public class FuncionTemperatura {

	String gC = "Celcius";
	String gF = "Farenheit";
	String gK = "Kelvin";

	ConvertirTemperatura temperatura = new ConvertirTemperatura();

	public void ConvertirTemperatura(double valor) {
		String opcion = (JOptionPane.showInputDialog(
				null,
				"Elija una opción para convertir",
				"Temperatura",
				JOptionPane.PLAIN_MESSAGE,
				null,
				new Object[] {
					"Grados Celcius a Grados Farenheit",
					"Grados Celcius a Grados Kelvin",
					"Grados Farenheit a Grados Celcius",
					"Grados Farenheit a Grados Kelvin",
					"Grados Kelvin a Grados Farenheit",
					"Grados Kelvin a Grados Celcius"
				}, "Seleccion")).toString();
		
		switch (opcion) {
			case "Grados Celcius a Grados Farenheit":
				temperatura.ConversorDeTemperatura(valor, gC, gF);
				break;
			case "Grados Celcius a Grados Kelvin":
				temperatura.ConversorDeTemperatura(valor, gC, gK);
				break;
			case "Grados Farenheit a Grados Celcius":
				temperatura.ConversorDeTemperatura(valor, gF, gC);
				break;
			case "Grados Farenheit a Grados Kelvin":
				temperatura.ConversorDeTemperatura(valor, gF, gK);
				break;
			case "Grados Kelvin a Grados Farenheit":
				temperatura.ConversorDeTemperatura(valor, gK, gF);				
				break;
			case "Grados Kelvin a Grados Celcius":
				temperatura.ConversorDeTemperatura(valor, gK, gC);
				break;
		}
	}

}
