package Distancias;

import javax.swing.JOptionPane;

public class ConvertirDistancia {
	public void ConvertirKmAmilla(double valor) {
		double milla = valor * 0.621371192;
    	milla = (double) Math.round(milla *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Kilometros ->" +milla+ " millas ");
		
	}
	
	public void ConvertirMetroAyarda(double valor){
		double yarda = valor * 1.0936133;
        yarda = (double) Math.round(yarda *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " metros ->" +yarda+ " yardas");
	}

}
