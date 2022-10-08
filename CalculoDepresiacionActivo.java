package Test;

import java.util.Scanner;

public class CalculoDepresiacionActivo {

	public static void main(String[] args) {
		
		Scanner en = new Scanner(System.in);
		//se declaran todas las variables a utilizar
		int op,tipoBienADepreciar, vidaUtil=0,cont=0;
		double industriales=10,comerciales=5,depAnual,residenciaPropietario=10,instalacionFAgropecuarias=20,edificiosAlquiler=1;
		double colectivoCarga = 20,otros=12.5,cuotaAmortizacion;
		double fijaBienInmovil = 10,noAdheridoPerma=15,otrosMaqEquipo=20,equiEmpresaAgro=20,agricolas=20;
		double mobiliarioEquiOficina=20,equipoComunicacion=20,ascensoresUnidadesAcondicionado=10,noComprendidos=20;
		double dep[] = new double[vidaUtil];
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
						System.out.println(name + " que tipo de bien desea depreciar por este metodo?");
						System.out.println("Edificios -------------------------- \n"
								+ "1) Industriales \n"
								+ "2) Comerciales \n"
								+ "3) Recidencia del propietario \n"
								+ "4) Instalaciones fijas \n"
								+ "5) Edificios para alquilar \n"
								+ "Equipo de Transporte -------------------------- \n"
								+ "6) Colectivo o de Carga \n"
								+ "7) Otros \n"
								+ "Maquinaria y Equipo -------------------------- \n"
								+ "8) Fija ebn un bien inmovil \n"
								+ "9) No adherido permanentemente a la planta \n"
								+ "10) Otros \n"
								+ "11) Equipo de empresas agroindustriales \n"
								+ "12) Agricolas \n"
								+ "13) Mobiliarios y equipos de oficina \n"
								+ "14) Equipos de comunicación \n"
								+ "15) Ascensores, elevadores y unidades centrales de aire acondicionado \n"
								+ " Los demás, no comprendidos en los literales anteriores");
						tipoBienADepreciar = en.nextInt();
										switch(tipoBienADepreciar) {
										case 1:
											System.out.println(name + ", ha elegido Edificios/Industriales");
											System.out.print("Escriba el costo del activo: ");
											costoActivo = en.nextDouble();
											System.out.print("Escriba el valor de desecho: ");
											valorDesecho = en.nextDouble();
											System.out.print("Escriba la vida util: ");
											vidaUtil = en.nextInt();
											cuotaAmortizacion = (costoActivo/vidaUtil);
											depAnual = (costoActivo-valorDesecho)/vidaUtil;
											for (int i = 1; i <= vidaUtil; i++) {
												double suma=depAnual,aux=0;
												aux = aux += suma; 
												System.out.println((suma+aux));
											}
											
											System.out.println("La cuota de amortizacion es de: " + cuotaAmortizacion + " anual");
											System.out.println("La cuota de amortizacion es de: " + (cuotaAmortizacion/12) + " mensual");
											System.out.println("La depreciacion anual es de: " + (costoActivo-valorDesecho)/vidaUtil);
											

										case 2:
										case 3:
										case 4:
										case 5:
										case 6:
										case 7:
										case 8:
										case 9:
										case 10:
										case 11:
										case 12:
										case 13:
										case 14:
										case 15:
											
											
										}
						
						
						
						
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
