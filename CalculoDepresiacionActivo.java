package Test;

import java.util.Scanner;

public class CalculoDepresiacionActivo {

	public static void main(String[] args) {
		
		Scanner en = new Scanner(System.in);
		//se declaran todas las variables a utilizar
		int op,tipoBienADepreciar,cont=0, vidaUtil=0;
		double industriales=10,comerciales=5,depAnual,residenciaPropietario=10,instalacionFAgropecuarias=20,edificiosAlquiler=1;
		double colectivoCarga = 20,otros=12.5,cuotaAmortizacion;
		double fijaBienInmovil = 10,noAdheridoPerma=15,otrosMaqEquipo=20,equiEmpresaAgro=20,agricolas=20;
		double mobiliarioEquiOficina=20,equipoComunicacion=20,ascensoresUnidadesAcondicionado=10,noComprendidos=20;

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
								+ "16) Los demás, no comprendidos en los literales anteriores");
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
											//dep acumulada
											double suma=0;
											System.out.println("-----------------------");
											System.out.println("Depreciacion Anual");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
												System.out.println((depAnual));
											}
											System.out.println("Fin Depreciacion Anual");
											System.out.println("-----------------------");
											System.out.println("Depreciacion Acumulada");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
											
												suma = suma+depAnual;
												System.out.println((suma));
											}
											System.out.println("Fin Depreciacion Acumulada");
											System.out.println("-----------------------");
											System.out.println("Valor en libros");
											System.out.println("-----------------------");
											double libros =0;
											System.out.println(costoActivo);
											for (int i = 0; i < vidaUtil; i++) {
												 libros = (costoActivo-depAnual);
												 costoActivo = libros;
												System.out.println(costoActivo);
											}
											System.out.println("Fin Valor en libros");
											System.out.println("-----------------------");
											System.out.println("La cuota de amortizacion anual es de: " + cuotaAmortizacion + " Cordobas");
											System.out.println("La cuota de amortizacion mensual es de: " + (cuotaAmortizacion/12) + " Cordobas");
											System.out.println("La depreciacion anual es de: " + (depAnual));
											System.out.println("La cuota anual a deducir es de " + (costoActivo*industriales)/100);
											break;

										case 2:
											System.out.println(name + ", ha elegido Edificios/Comerciales");
											System.out.print("Escriba el costo del activo: ");
											costoActivo = en.nextDouble();
											System.out.print("Escriba el valor de desecho: ");
											valorDesecho = en.nextDouble();
											System.out.print("Escriba la vida util: ");
											vidaUtil = en.nextInt();
											cuotaAmortizacion = (costoActivo/vidaUtil);
											depAnual = (costoActivo-valorDesecho)/vidaUtil;
											//dep acumulada
											double suma2=0;
											System.out.println("-----------------------");
											System.out.println("Depreciacion Anual");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
												System.out.println((depAnual));
											}
											System.out.println("Fin Depreciacion Anual");
											System.out.println("-----------------------");
											System.out.println("Depreciacion Acumulada");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
											
												suma2 = suma2+depAnual;
												System.out.println((suma2));
											}
											System.out.println("Fin Depreciacion Acumulada");
											System.out.println("-----------------------");
											System.out.println("Valor en libros");
											System.out.println("-----------------------");
											double libros2 =0;
											System.out.println(costoActivo);
											for (int i = 0; i < vidaUtil; i++) {
												 libros2 = (costoActivo-depAnual);
												 costoActivo = libros2;
												System.out.println(costoActivo);
											}
											System.out.println("Fin Valor en libros");
											System.out.println("-----------------------");
											System.out.println("La cuota de amortizacion anual es de: " + cuotaAmortizacion + " Cordobas");
											System.out.println("La cuota de amortizacion mensual es de: " + (cuotaAmortizacion/12) + " Cordobas");
											System.out.println("La depreciacion anual es de: " + (depAnual));
											System.out.println("La cuota anual a deducir es de 5% = " + (costoActivo*comerciales)/100);
											break;
										case 3:
											System.out.println(name + ", ha elegido Edificios/Residencia");
											System.out.print("Escriba el costo del activo: ");
											costoActivo = en.nextDouble();
											System.out.print("Escriba el valor de desecho: ");
											valorDesecho = en.nextDouble();
											System.out.print("Escriba la vida util: ");
											vidaUtil = en.nextInt();
											cuotaAmortizacion = (costoActivo/vidaUtil);
											depAnual = (costoActivo-valorDesecho)/vidaUtil;
											//dep acumulada
											double suma3=0;
											System.out.println("-----------------------");
											System.out.println("Depreciacion Anual");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
												System.out.println((depAnual));
											}
											System.out.println("Fin Depreciacion Anual");
											System.out.println("-----------------------");
											System.out.println("Depreciacion Acumulada");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
											
												suma3 = suma3+depAnual;
												System.out.println((suma3));
											}
											System.out.println("Fin Depreciacion Acumulada");
											System.out.println("-----------------------");
											System.out.println("Valor en libros");
											System.out.println("-----------------------");
											double libros3 =0;
											System.out.println(costoActivo);
											for (int i = 0; i < vidaUtil; i++) {
												 libros3 = (costoActivo-depAnual);
												 costoActivo = libros3;
												System.out.println(costoActivo);
											}
											System.out.println("Fin Valor en libros");
											System.out.println("-----------------------");
											System.out.println("La cuota de amortizacion anual es de: " + cuotaAmortizacion + " Cordobas");
											System.out.println("La cuota de amortizacion mensual es de: " + (cuotaAmortizacion/12) + " Cordobas");
											System.out.println("La depreciacion anual es de: " + (depAnual));
											System.out.println("La cuota anual a deducir es de 10% = " + (costoActivo*residenciaPropietario)/100);
											break;
										case 4:
											System.out.println(name + ", ha elegido Edificios/ Instalaciones fijas en explotaciones agropecuarias");
											System.out.print("Escriba el costo del activo: ");
											costoActivo = en.nextDouble();
											System.out.print("Escriba el valor de desecho: ");
											valorDesecho = en.nextDouble();
											System.out.print("Escriba la vida util: ");
											vidaUtil = en.nextInt();
											cuotaAmortizacion = (costoActivo/vidaUtil);
											depAnual = (costoActivo-valorDesecho)/vidaUtil;
											//dep acumulada
											double suma4=0;
											System.out.println("-----------------------");
											System.out.println("Depreciacion Anual");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
												System.out.println((depAnual));
											}
											System.out.println("Fin Depreciacion Anual");
											System.out.println("-----------------------");
											System.out.println("Depreciacion Acumulada");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
											
												suma4 = suma4+depAnual;
												System.out.println((suma4));
											}
											System.out.println("Fin Depreciacion Acumulada");
											System.out.println("-----------------------");
											System.out.println("Valor en libros");
											System.out.println("-----------------------");
											double libros4 =0;
											System.out.println(costoActivo);
											for (int i = 0; i < vidaUtil; i++) {
												 libros4 = (costoActivo-depAnual);
												 costoActivo = libros4;
												System.out.println(costoActivo);
											}
											System.out.println("Fin Valor en libros");
											System.out.println("-----------------------");
											System.out.println("La cuota de amortizacion anual es de: " + cuotaAmortizacion + " Cordobas");
											System.out.println("La cuota de amortizacion mensual es de: " + (cuotaAmortizacion/12) + " Cordobas");
											System.out.println("La depreciacion anual es de: " + (depAnual));
											System.out.println("La cuota anual a deducir es de 20% = " + (costoActivo*instalacionFAgropecuarias)/100);
											break;
										case 5:
											System.out.println(name + ", ha elegido Edificios/Edificios para alquiler, 1% sobre su valor catastral");
											System.out.print("Escriba el costo del activo: ");
											costoActivo = en.nextDouble();
											System.out.print("Escriba el valor de desecho: ");
											valorDesecho = en.nextDouble();
											System.out.print("Escriba la vida util: ");
											vidaUtil = en.nextInt();
											cuotaAmortizacion = (costoActivo/vidaUtil);
											depAnual = (costoActivo-valorDesecho)/vidaUtil;
											//dep acumulada
											double suma5=0;
											System.out.println("-----------------------");
											System.out.println("Depreciacion Anual");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
												System.out.println((depAnual));
											}
											System.out.println("Fin Depreciacion Anual");
											System.out.println("-----------------------");
											System.out.println("Depreciacion Acumulada");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
											
												suma5 = suma5+depAnual;
												System.out.println((suma5));
											}
											System.out.println("Fin Depreciacion Acumulada");
											System.out.println("-----------------------");
											System.out.println("Valor en libros");
											System.out.println("-----------------------");
											double libros5 =0;
											System.out.println(costoActivo);
											for (int i = 0; i < vidaUtil; i++) {
												 libros5 = (costoActivo-depAnual);
												 costoActivo = libros5;
												System.out.println(costoActivo);
											}
											System.out.println("Fin Valor en libros");
											System.out.println("-----------------------");
											System.out.println("La cuota de amortizacion anual es de: " + cuotaAmortizacion + " Cordobas");
											System.out.println("La cuota de amortizacion mensual es de: " + (cuotaAmortizacion/12) + " Cordobas");
											System.out.println("La depreciacion anual es de: " + (depAnual));
											System.out.println("La cuota anual a deducir es de 1% = " + (costoActivo*edificiosAlquiler)/100);
											break;
										case 6:
											System.out.println(name + ", ha elegido Equipo de Transporte/ Colectivo o de carga");
											System.out.print("Escriba el costo del activo: ");
											costoActivo = en.nextDouble();
											System.out.print("Escriba el valor de desecho: ");
											valorDesecho = en.nextDouble();
											System.out.print("Escriba la vida util: ");
											vidaUtil = en.nextInt();
											cuotaAmortizacion = (costoActivo/vidaUtil);
											depAnual = (costoActivo-valorDesecho)/vidaUtil;
											//dep acumulada
											double suma6=0;
											System.out.println("-----------------------");
											System.out.println("Depreciacion Anual");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
												System.out.println((depAnual));
											}
											System.out.println("Fin Depreciacion Anual");
											System.out.println("-----------------------");
											System.out.println("Depreciacion Acumulada");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
											
												suma6 = suma6+depAnual;
												System.out.println((suma6));
											}
											System.out.println("Fin Depreciacion Acumulada");
											System.out.println("-----------------------");
											System.out.println("Valor en libros");
											System.out.println("-----------------------");
											double libros6 =0;
											System.out.println(costoActivo);
											for (int i = 0; i < vidaUtil; i++) {
												 libros6 = (costoActivo-depAnual);
												 costoActivo = libros6;
												System.out.println(costoActivo);
											}
											System.out.println("Fin Valor en libros");
											System.out.println("-----------------------");
											System.out.println("La cuota de amortizacion anual es de: " + cuotaAmortizacion + " Cordobas");
											System.out.println("La cuota de amortizacion mensual es de: " + (cuotaAmortizacion/12) + " Cordobas");
											System.out.println("La depreciacion anual es de: " + (depAnual));
											System.out.println("La cuota anual a deducir es de 20% = " + (costoActivo*comerciales)/100);
											break;
										case 7:
											System.out.println(name + ", ha elegido Equipo de Transporte/Otros");
											System.out.print("Escriba el costo del activo: ");
											costoActivo = en.nextDouble();
											System.out.print("Escriba el valor de desecho: ");
											valorDesecho = en.nextDouble();
											System.out.print("Escriba la vida util: ");
											vidaUtil = en.nextInt();
											cuotaAmortizacion = (costoActivo/vidaUtil);
											depAnual = (costoActivo-valorDesecho)/vidaUtil;
											//dep acumulada
											double suma7=0;
											System.out.println("-----------------------");
											System.out.println("Depreciacion Anual");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
												System.out.println((depAnual));
											}
											System.out.println("Fin Depreciacion Anual");
											System.out.println("-----------------------");
											System.out.println("Depreciacion Acumulada");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
											
												suma7 = suma7+depAnual;
												System.out.println((suma7));
											}
											System.out.println("Fin Depreciacion Acumulada");
											System.out.println("-----------------------");
											System.out.println("Valor en libros");
											System.out.println("-----------------------");
											double libros7 =0;
											System.out.println(costoActivo);
											for (int i = 0; i < vidaUtil; i++) {
												 libros7 = (costoActivo-depAnual);
												 costoActivo = libros7;
												System.out.println(costoActivo);
											}
											System.out.println("Fin Valor en libros");
											System.out.println("-----------------------");
											System.out.println("La cuota de amortizacion anual es de: " + cuotaAmortizacion + " Cordobas");
											System.out.println("La cuota de amortizacion mensual es de: " + (cuotaAmortizacion/12) + " Cordobas");
											System.out.println("La depreciacion anual es de: " + (depAnual));
											System.out.println("La cuota anual a deducir es de 12.5% = " + (costoActivo*otros)/100);
											break;
										case 8:
											System.out.println(name + ", ha elegido Maquinaria y Equipo/Fija en un bien inmovil");
											System.out.print("Escriba el costo del activo: ");
											costoActivo = en.nextDouble();
											System.out.print("Escriba el valor de desecho: ");
											valorDesecho = en.nextDouble();
											System.out.print("Escriba la vida util: ");
											vidaUtil = en.nextInt();
											cuotaAmortizacion = (costoActivo/vidaUtil);
											depAnual = (costoActivo-valorDesecho)/vidaUtil;
											//dep acumulada
											double suma8=0;
											System.out.println("-----------------------");
											System.out.println("Depreciacion Anual");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
												System.out.println((depAnual));
											}
											System.out.println("Fin Depreciacion Anual");
											System.out.println("-----------------------");
											System.out.println("Depreciacion Acumulada");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
											
												suma8 = suma8+depAnual;
												System.out.println((suma8));
											}
											System.out.println("Fin Depreciacion Acumulada");
											System.out.println("-----------------------");
											System.out.println("Valor en libros");
											System.out.println("-----------------------");
											double libros8 =0;
											System.out.println(costoActivo);
											for (int i = 0; i < vidaUtil; i++) {
												 libros8 = (costoActivo-depAnual);
												 costoActivo = libros8;
												System.out.println(costoActivo);
											}
											System.out.println("Fin Valor en libros");
											System.out.println("-----------------------");
											System.out.println("La cuota de amortizacion anual es de: " + cuotaAmortizacion + " Cordobas");
											System.out.println("La cuota de amortizacion mensual es de: " + (cuotaAmortizacion/12) + " Cordobas");
											System.out.println("La depreciacion anual es de: " + (depAnual));
											System.out.println("La cuota anual a deducir es de 10% = " + (costoActivo*fijaBienInmovil )/100);
											break;
										case 9:
											System.out.println(name + ", ha elegido Maquinaria y Equipo/No adherido permanentemente a la planta");
											System.out.print("Escriba el costo del activo: ");
											costoActivo = en.nextDouble();
											System.out.print("Escriba el valor de desecho: ");
											valorDesecho = en.nextDouble();
											System.out.print("Escriba la vida util: ");
											vidaUtil = en.nextInt();
											cuotaAmortizacion = (costoActivo/vidaUtil);
											depAnual = (costoActivo-valorDesecho)/vidaUtil;
											//dep acumulada
											double suma9=0;
											System.out.println("-----------------------");
											System.out.println("Depreciacion Anual");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
												System.out.println((depAnual));
											}
											System.out.println("Fin Depreciacion Anual");
											System.out.println("-----------------------");
											System.out.println("Depreciacion Acumulada");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
											
												suma9 = suma9+depAnual;
												System.out.println((suma9));
											}
											System.out.println("Fin Depreciacion Acumulada");
											System.out.println("-----------------------");
											System.out.println("Valor en libros");
											System.out.println("-----------------------");
											double libros9 =0;
											System.out.println(costoActivo);
											for (int i = 0; i < vidaUtil; i++) {
												 libros9 = (costoActivo-depAnual);
												 costoActivo = libros9;
												System.out.println(costoActivo);
											}
											System.out.println("Fin Valor en libros");
											System.out.println("-----------------------");
											System.out.println("La cuota de amortizacion anual es de: " + cuotaAmortizacion + " Cordobas");
											System.out.println("La cuota de amortizacion mensual es de: " + (cuotaAmortizacion/12) + " Cordobas");
											System.out.println("La depreciacion anual es de: " + (depAnual));
											System.out.println("La cuota anual a deducir es de 15% = " + (costoActivo*noAdheridoPerma)/100);
											break;
										case 10:
											System.out.println(name + ", ha elegido Maquinaria y Equipo/Otros");
											System.out.print("Escriba el costo del activo: ");
											costoActivo = en.nextDouble();
											System.out.print("Escriba el valor de desecho: ");
											valorDesecho = en.nextDouble();
											System.out.print("Escriba la vida util: ");
											vidaUtil = en.nextInt();
											cuotaAmortizacion = (costoActivo/vidaUtil);
											depAnual = (costoActivo-valorDesecho)/vidaUtil;
											//dep acumulada
											double suma10=0;
											System.out.println("-----------------------");
											System.out.println("Depreciacion Anual");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
												System.out.println((depAnual));
											}
											System.out.println("Fin Depreciacion Anual");
											System.out.println("-----------------------");
											System.out.println("Depreciacion Acumulada");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
											
												suma10 = suma10+depAnual;
												System.out.println((suma10));
											}
											System.out.println("Fin Depreciacion Acumulada");
											System.out.println("-----------------------");
											System.out.println("Valor en libros");
											System.out.println("-----------------------");
											double libros10 =0;
											System.out.println(costoActivo);
											for (int i = 0; i < vidaUtil; i++) {
												 libros10 = (costoActivo-depAnual);
												 costoActivo = libros10;
												System.out.println(costoActivo);
											}
											System.out.println("Fin Valor en libros");
											System.out.println("-----------------------");
											System.out.println("La cuota de amortizacion anual es de: " + cuotaAmortizacion + " Cordobas");
											System.out.println("La cuota de amortizacion mensual es de: " + (cuotaAmortizacion/12) + " Cordobas");
											System.out.println("La depreciacion anual es de: " + (depAnual));
											System.out.println("La cuota anual a deducir es de 20% = " + (costoActivo*equiEmpresaAgro)/100);
											break;
										case 11:
											System.out.println(name + ", ha elegido Maquinaria y Equipo/) Equipo empresas agroindustriales");
											System.out.print("Escriba el costo del activo: ");
											costoActivo = en.nextDouble();
											System.out.print("Escriba el valor de desecho: ");
											valorDesecho = en.nextDouble();
											System.out.print("Escriba la vida util: ");
											vidaUtil = en.nextInt();
											cuotaAmortizacion = (costoActivo/vidaUtil);
											depAnual = (costoActivo-valorDesecho)/vidaUtil;
											//dep acumulada
											double suma11=0;
											System.out.println("-----------------------");
											System.out.println("Depreciacion Anual");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
												System.out.println((depAnual));
											}
											System.out.println("Fin Depreciacion Anual");
											System.out.println("-----------------------");
											System.out.println("Depreciacion Acumulada");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
											
												suma11 = suma11+depAnual;
												System.out.println((suma11));
											}
											System.out.println("Fin Depreciacion Acumulada");
											System.out.println("-----------------------");
											System.out.println("Valor en libros");
											System.out.println("-----------------------");
											double libros11 =0;
											System.out.println(costoActivo);
											for (int i = 0; i < vidaUtil; i++) {
												 libros11 = (costoActivo-depAnual);
												 costoActivo = libros11;
												System.out.println(costoActivo);
											}
											System.out.println("Fin Valor en libros");
											System.out.println("-----------------------");
											System.out.println("La cuota de amortizacion anual es de: " + cuotaAmortizacion + " Cordobas");
											System.out.println("La cuota de amortizacion mensual es de: " + (cuotaAmortizacion/12) + " Cordobas");
											System.out.println("La depreciacion anual es de: " + (depAnual));
											System.out.println("La cuota anual a deducir es de 20% = " + (costoActivo*otrosMaqEquipo)/100);
											break;
										case 12:
											System.out.println(name + ", ha elegido Edificios/Agrícolas");
											System.out.print("Escriba el costo del activo: ");
											costoActivo = en.nextDouble();
											System.out.print("Escriba el valor de desecho: ");
											valorDesecho = en.nextDouble();
											System.out.print("Escriba la vida util: ");
											vidaUtil = en.nextInt();
											cuotaAmortizacion = (costoActivo/vidaUtil);
											depAnual = (costoActivo-valorDesecho)/vidaUtil;
											//dep acumulada
											double suma12=0;
											System.out.println("-----------------------");
											System.out.println("Depreciacion Anual");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
												System.out.println((depAnual));
											}
											System.out.println("Fin Depreciacion Anual");
											System.out.println("-----------------------");
											System.out.println("Depreciacion Acumulada");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
											
												suma12 = suma12+depAnual;
												System.out.println((suma12));
											}
											System.out.println("Fin Depreciacion Acumulada");
											System.out.println("-----------------------");
											System.out.println("Valor en libros");
											System.out.println("-----------------------");
											double libros12 =0;
											System.out.println(costoActivo);
											for (int i = 0; i < vidaUtil; i++) {
												 libros12 = (costoActivo-depAnual);
												 costoActivo = libros12;
												System.out.println(costoActivo);
											}
											System.out.println("Fin Valor en libros");
											System.out.println("-----------------------");
											System.out.println("La cuota de amortizacion anual es de: " + cuotaAmortizacion + " Cordobas");
											System.out.println("La cuota de amortizacion mensual es de: " + (cuotaAmortizacion/12) + " Cordobas");
											System.out.println("La depreciacion anual es de: " + (depAnual));
											System.out.println("La cuota anual a deducir es de 20% = " + (costoActivo*agricolas)/100);
											break;
										case 13:
											System.out.println(name + ", ha elegido Maquinaria y Equipo/Mobiliarios y equipos de oficina");
											System.out.print("Escriba el costo del activo: ");
											costoActivo = en.nextDouble();
											System.out.print("Escriba el valor de desecho: ");
											valorDesecho = en.nextDouble();
											System.out.print("Escriba la vida util: ");
											vidaUtil = en.nextInt();
											cuotaAmortizacion = (costoActivo/vidaUtil);
											depAnual = (costoActivo-valorDesecho)/vidaUtil;
											//dep acumulada
											double suma13=0;
											System.out.println("-----------------------");
											System.out.println("Depreciacion Anual");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
												System.out.println((depAnual));
											}
											System.out.println("Fin Depreciacion Anual");
											System.out.println("-----------------------");
											System.out.println("Depreciacion Acumulada");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
											
												suma13 = suma13+depAnual;
												System.out.println((suma13));
											}
											System.out.println("Fin Depreciacion Acumulada");
											System.out.println("-----------------------");
											System.out.println("Valor en libros");
											System.out.println("-----------------------");
											double libros13 =0;
											System.out.println(costoActivo);
											for (int i = 0; i < vidaUtil; i++) {
												 libros13 = (costoActivo-depAnual);
												 costoActivo = libros13;
												System.out.println(costoActivo);
											}
											System.out.println("Fin Valor en libros");
											System.out.println("-----------------------");
											System.out.println("La cuota de amortizacion anual es de: " + cuotaAmortizacion + " Cordobas");
											System.out.println("La cuota de amortizacion mensual es de: " + (cuotaAmortizacion/12) + " Cordobas");
											System.out.println("La depreciacion anual es de: " + (depAnual));
											System.out.println("La cuota anual a deducir es de 20% = " + (costoActivo*mobiliarioEquiOficina)/100);
											break;
										case 14:
											System.out.println(name + ", ha elegido Maquinaria y Equipo/ Equipos de comunicación");
											System.out.print("Escriba el costo del activo: ");
											costoActivo = en.nextDouble();
											System.out.print("Escriba el valor de desecho: ");
											valorDesecho = en.nextDouble();
											System.out.print("Escriba la vida util: ");
											vidaUtil = en.nextInt();
											cuotaAmortizacion = (costoActivo/vidaUtil);
											depAnual = (costoActivo-valorDesecho)/vidaUtil;
											//dep acumulada
											double suma14=0;
											System.out.println("-----------------------");
											System.out.println("Depreciacion Anual");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
												System.out.println((depAnual));
											}
											System.out.println("Fin Depreciacion Anual");
											System.out.println("-----------------------");
											System.out.println("Depreciacion Acumulada");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
											
												suma14 = suma14+depAnual;
												System.out.println((suma14));
											}
											System.out.println("Fin Depreciacion Acumulada");
											System.out.println("-----------------------");
											System.out.println("Valor en libros");
											System.out.println("-----------------------");
											double libros14 =0;
											System.out.println(costoActivo);
											for (int i = 0; i < vidaUtil; i++) {
												 libros14 = (costoActivo-depAnual);
												 costoActivo = libros14;
												System.out.println(costoActivo);
											}
											System.out.println("Fin Valor en libros");
											System.out.println("-----------------------");
											System.out.println("La cuota de amortizacion anual es de: " + cuotaAmortizacion + " Cordobas");
											System.out.println("La cuota de amortizacion mensual es de: " + (cuotaAmortizacion/12) + " Cordobas");
											System.out.println("La depreciacion anual es de: " + (depAnual));
											System.out.println("La cuota anual a deducir es de 5% = " + (costoActivo*equipoComunicacion)/100);
											break;
										case 15:
											System.out.println(name + ", ha elegido Maquinaria y Equipo/Ascensores, elevadores y unidades centrales de aire acondicionado");
											System.out.print("Escriba el costo del activo: ");
											costoActivo = en.nextDouble();
											System.out.print("Escriba el valor de desecho: ");
											valorDesecho = en.nextDouble();
											System.out.print("Escriba la vida util: ");
											vidaUtil = en.nextInt();
											cuotaAmortizacion = (costoActivo/vidaUtil);
											depAnual = (costoActivo-valorDesecho)/vidaUtil;
											//dep acumulada
											double suma15=0;
											System.out.println("-----------------------");
											System.out.println("Depreciacion Anual");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
												System.out.println((depAnual));
											}
											System.out.println("Fin Depreciacion Anual");
											System.out.println("-----------------------");
											System.out.println("Depreciacion Acumulada");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
											
												suma15 = suma15+depAnual;
												System.out.println((suma15));
											}
											System.out.println("Fin Depreciacion Acumulada");
											System.out.println("-----------------------");
											System.out.println("Valor en libros");
											System.out.println("-----------------------");
											double libros15 =0;
											System.out.println(costoActivo);
											for (int i = 0; i < vidaUtil; i++) {
												 libros15 = (costoActivo-depAnual);
												 costoActivo = libros15;
												System.out.println(costoActivo);
											}
											System.out.println("Fin Valor en libros");
											System.out.println("-----------------------");
											System.out.println("La cuota de amortizacion anual es de: " + cuotaAmortizacion + " Cordobas");
											System.out.println("La cuota de amortizacion mensual es de: " + (cuotaAmortizacion/12) + " Cordobas");
											System.out.println("La depreciacion anual es de: " + (depAnual));
											System.out.println("La cuota anual a deducir es de 10% = " + (costoActivo*ascensoresUnidadesAcondicionado)/100);
											break;
										case 16:
											System.out.println(name + ", ha elegido Maquinaria y Equipo/Ascensores, elevadores y unidades centrales de aire acondicionado");
											System.out.print("Escriba el costo del activo: ");
											costoActivo = en.nextDouble();
											System.out.print("Escriba el valor de desecho: ");
											valorDesecho = en.nextDouble();
											System.out.print("Escriba la vida util: ");
											vidaUtil = en.nextInt();
											cuotaAmortizacion = (costoActivo/vidaUtil);
											depAnual = (costoActivo-valorDesecho)/vidaUtil;
											//dep acumulada
											double suma16=0;
											System.out.println("-----------------------");
											System.out.println("Depreciacion Anual");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
												System.out.println((depAnual));
											}
											System.out.println("Fin Depreciacion Anual");
											System.out.println("-----------------------");
											System.out.println("Depreciacion Acumulada");
											System.out.println("-----------------------");
											for (int i = 1; i <= vidaUtil; i++) {
											
												suma16 = suma16+depAnual;
												System.out.println((suma16));
											}
											System.out.println("Fin Depreciacion Acumulada");
											System.out.println("-----------------------");
											System.out.println("Valor en libros");
											System.out.println("-----------------------");
											double libros16=0;
											System.out.println(costoActivo);
											for (int i = 0; i < vidaUtil; i++) {
												 libros16 = (costoActivo-depAnual);
												 costoActivo = libros16;
												System.out.println(costoActivo);
											}
											System.out.println("Fin Valor en libros");
											System.out.println("-----------------------");
											System.out.println("La cuota de amortizacion anual es de: " + cuotaAmortizacion + " Cordobas");
											System.out.println("La cuota de amortizacion mensual es de: " + (cuotaAmortizacion/12) + " Cordobas");
											System.out.println("La depreciacion anual es de: " + (depAnual));
											System.out.println("La cuota anual a deducir es de 20% = " + (costoActivo*noComprendidos)/100);
											break;
											
											
										}
						
						
						
						
						break;
					case 2:

						System.out.println(name + " Ha elegido Metodo de unidades Producidas");
						System.out.print("Escriba el costo del activo: ");
						costoActivo = en.nextDouble();
						System.out.print("Escriba el valor de desecho: ");
						valorDesecho = en.nextDouble();
						System.out.print("Escriba la vida util: ");
						vidaUtil = en.nextInt();
						
				
						double dep[] = new double[vidaUtil];
						double aukm =0,km=0;
								double detDeAnual=0;
								double anioda=0;
						for (int i = 0; i < vidaUtil; i++) {
							System.out.print("kms recorridos en el anio " + (i+1) + ": ");
							 dep[i] = en.nextDouble();

							 aukm = aukm + dep[i];
								

							 
						}
						System.out.println("----------------------------");
						for (int i = 0; i < vidaUtil; i++) {
							depAnual = (costoActivo-valorDesecho)/aukm;
							 double result = dep[i] * depAnual;
							 System.out.println(result);
						}
						System.out.println("----------------------------");
						System.out.println("total recorrido: "+ aukm);

						
						break;
					case 3:
						
						break;
					case 4:

						System.out.println(name + ", Ha elegido Metodo de suma de los digitos de los anios");
						do {
							System.out.print("Escriba el costo del activo: ");
							costoActivo = en.nextDouble();
						}while(costoActivo < 1);
						do {
							System.out.print("Escriba el valor de desecho: ");
							valorDesecho = en.nextDouble();
						}while(valorDesecho < 1);
						do {
							System.out.print("Escriba la vida util: ");
							vidaUtil = en.nextInt();
						}while(vidaUtil < 1 || vidaUtil > 200);
						
						double suma=0,denominador=0;
						denominador = (vidaUtil*(1+vidaUtil)/2);
						
						System.out.println(denominador);
						System.out.println("Valores en fracciones------------------");
						for (int i = 0; i < vidaUtil; i++) {
							do {
								System.out.println("Fraccion: "+(i+1)+ ") " + ((vidaUtil-i)/denominador));
								break;
							}while(vidaUtil < 0);
							
						}
						
						System.out.println("Depreciacion------------------");
						for (int i = 0; i < vidaUtil; i++) {
							do {
								System.out.println("Depreciacion: "+(i+1)+ ") " + (costoActivo-valorDesecho)*((vidaUtil-i)/denominador));
								break;
							}while(vidaUtil < 0);
							
						}
						System.out.println("Valor en libros------------------");
						System.out.println(costoActivo);
						for (int i = 0; i < vidaUtil; i++) {
							do {
								System.out.println(costoActivo -((costoActivo-valorDesecho)*((vidaUtil-i)/denominador)));
								break;
							}while(vidaUtil < 0);
							
						}
						
						
						
						
						
					//	depAnual = (((costoActivo-valorDesecho)*vidaUtil)/suma);
						
					//	System.out.println("El costo del activo es: " + costoActivo);
					//	System.out.println("El valor de desecho es: " + valorDesecho);
					//	System.out.println("La depreciacion ANUAL es: " + depAnual);
						
						
						
						
						
						break;
					}
					
					
			
		}while(op < 0);

	}

}
