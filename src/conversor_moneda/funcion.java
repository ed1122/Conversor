package conversor_moneda;

import javax.swing.JOptionPane;

public class funcion {
	
	ConvertirMonedas moneda = new ConvertirMonedas();
	
	public void ConvertirMonedas(double Minput) {
		String opcion = (JOptionPane.showInputDialog(null,
				
				"Moneda a convertir","Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
						{"De pesos colombianos a Dolar", "De pesos colombianos a Euros"},
						"Seleccion")).toString();
		switch(opcion) {
		case "De pesos colombianos a Dolar":
			moneda.ConvertirCopAdolar(Minput);
			break;
		case "De pesos colombianos a Euros":
			moneda.ConvertirCopAEuros(Minput);
			break;
		}
						
			
	}

}
