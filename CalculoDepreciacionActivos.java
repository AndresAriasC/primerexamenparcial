package FoldTest;

import java.util.Scanner;

public class CalculoDepreciacionActivos {

	public static void main(String[] args) {
	
		Scanner en = new Scanner(System.in);
		//se declaran todas las variables a utilizar
		int op, vidaUtil;
		double costoActivo,valorDesecho;
		String name = "";
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Hola, soy Quiubo, experto en el calculo de depreciasion. \n ---- Dime cual es tu nombre por favor");
		name = en.nextLine();
		System.out.println("---------------------------------------------------------");

		do {
			
			System.out.println("---------------- Bienvenido " + name + "----------------------- \n");
			System.out.println("Elige un metodo por el cual deseas trabajar ------------- \n");
			System.out.println("1) Metodo de linea recta");
			System.out.println("2) Metodo unidades producidas");
			System.out.println("3) Metodo de saldos decrecientes");
			System.out.println("4) Metodo de suma de los digitos de los anios");
			System.out.println("0) salir");
			System.out.println("---------------------------------------------------------");	
			
			op = en.nextInt();
			
					switch(op) {
					case 1:
						System.out.print("Escriba el costo del activo: ");
						costoActivo = en.nextDouble();
						System.out.print("Escriba el valor de desecho: ");
						valorDesecho = en.nextDouble();
						System.out.print("Escriba la vida util: ");
						vidaUtil = en.nextInt();
						
						double depAnual = (costoActivo-valorDesecho)/vidaUtil;
						System.out.println("La depreciacion anual es: " + depAnual);
						System.out.println("La depresiacion acumiada es: " + (depAnual * vidaUtil));
						break;
					case 2:
						
						
						break;
					case 3:
						
						
						break;
					case 4:
						
						
						break;
					}
					
					
			
		}while(op < 0);
	
	}

}
