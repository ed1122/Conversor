package conversor_moneda;

import javax.swing.JOptionPane;
import Distancias.funcionDist;
import conversor_moneda.funcion;



public class Principal {
	
	public static void main(String[] args) {
		
		funcion monedas = new funcion();
		funcionDist distania = new funcionDist();
		
		while(true) {
			String opciones = (JOptionPane.showInputDialog(
					
					null,"Seleccione una opción de conversión ", 
							"Menu", JOptionPane.QUESTION_MESSAGE,
							null, new Object[] {"Conversor de Moneda COP",
												"Distancias"}, "Seleccion")).toString();
			
			switch(opciones) {
			case "Conversor de Moneda":
       		 String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
             if(ValidarNumero(input) == true) {
                 double Minput = Double.parseDouble(input);
                 monedas.ConvertirMonedas(Minput);

                 int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                 if (JOptionPane.OK_OPTION == respuesta){
                 	System.out.println("Selecciona opción Afirmativa");
                 }else{
                    	JOptionPane.showMessageDialog(null, "Programa terminado");                         
                 }

                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");                
                }
                 	break;
			case "Distancias":
				input = JOptionPane.showInputDialog("Ingresa el valor de longitud que deseas convertir ");
	             if(ValidarNumero(input) == true) {
	                 double Minput = Double.parseDouble(input);
	                 distania.ConvertirDistancia(Minput);

	                 int respuesta = 0;
	                 respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
	                 if((respuesta == 0) && (ValidarNumero(input) == true)) { 
	                 } else {
	                     JOptionPane.showMessageDialog(null, "Programa terminado");                     
	                 }

	             } else {
	                 JOptionPane.showMessageDialog(null, "Valor inválido");                
	             }
	             break;
				}
				
			
			
			
			
			}
			
			

	}
	
	
	public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }

}