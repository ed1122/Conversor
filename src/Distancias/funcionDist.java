package Distancias;

import javax.swing.JOptionPane;

public class funcionDist {
	
	ConvertirDistancia  distancia = new ConvertirDistancia();
	
	public void ConvertirDistancia(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Distancia", JOptionPane.PLAIN_MESSAGE, null,
    														new Object[] {"Kilometros a millas", "Metros a yardas"}, "Seleccion")).toString();
        switch(opcion) {
        case "Kilometros a millas":
        	distancia.ConvertirKmAmilla(Minput);;
        	break;
        case "Metros a yardas":
            distancia.ConvertirMetroAyarda(Minput);
            break;
        
        }
	}

}
