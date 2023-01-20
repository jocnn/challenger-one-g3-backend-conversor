import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConversorPesosArgentinosAOtraMoneda(double cantidadAConvertir, double cotizacion, String moneda) {
		double monedaDolar = cantidadAConvertir / cotizacion;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + moneda);
	}
	
}
