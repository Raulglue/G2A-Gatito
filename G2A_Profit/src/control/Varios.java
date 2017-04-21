package control;

public class Varios {
	public static void main(String[] args) {
		if(ValidarCasilla("pene")==false){
			System.out.println("moco");
		}
		
	}
	public static boolean ValidarCasilla(String texto) {
		boolean respuesta = false;
		try {
			float precio = Float.parseFloat(texto);
			if(precio>=0){
				respuesta = true;
				}else{
					respuesta=false;
				}
		} catch (NumberFormatException e) {
			
		}
		
		
		return respuesta;
	}
}
