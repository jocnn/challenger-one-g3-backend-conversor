import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
	public double ConversorDeTemperatura(
			double valorAConvertir,
			String temperaturaInicial,
			String temperaturaEsperada) {
		
		double temperatura = 0;

		String grados = " Grados ";
		String gC = "Celcius";
		String gF = "Farenheit";
		String gK = "Kelvin";

		if (temperaturaInicial == gC && temperaturaEsperada == gF) {
			temperatura = valorAConvertir * 1.8 + 32;
		} else if (temperaturaInicial == gC && temperaturaEsperada == gK) {
			temperatura = valorAConvertir + 273.15;
		} else if (temperaturaInicial == gF && temperaturaEsperada == gC) {
			temperatura = (valorAConvertir - 32) * 5 / 9;
		} else if (temperaturaInicial == gF && temperaturaEsperada == gK) {
			temperatura = (valorAConvertir - 32) * 5 / 9 + 273.15;
		} else if (temperaturaInicial == gK && temperaturaEsperada == gF) {
			temperatura = (valorAConvertir - 273.15) * 9/ 5 + 32;
		} else if (temperaturaInicial == gK && temperaturaEsperada == gC) {
			temperatura = valorAConvertir - 273.15;
		}
		
		temperatura = (double) Math.round(temperatura * 100d) / 100;
		
		JOptionPane.showMessageDialog(null, + valorAConvertir + grados + temperaturaInicial + " son " + temperatura + " " + grados + temperaturaEsperada);
		
		return temperatura;
	}

}
