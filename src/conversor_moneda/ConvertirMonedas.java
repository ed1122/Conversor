package conversor_moneda;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConvertirCopAdolar(double val) {
		
		double dolar = val / 3963.75;
		dolar = (double) Math.round(dolar * 100)/100;
		
		JOptionPane.showMessageDialog(null,"Tienes"+dolar+" dolares");
	}
	
	
	public void ConvertirCopAEuros(double valor) {
		double euro = valor / 4343.6508;
		euro = (double) Math.round(euro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +euro+ " Euros");
	}

}
