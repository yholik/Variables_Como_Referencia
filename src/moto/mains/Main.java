package moto.mains;
import moto.modelos.*;
import java.util.Scanner;
/*
 * Los cálculos de tiempo (distancia / velocidad) y el aumento del kilometraje 
 * se hacen en el Main porque en esta guía no se usarán cosas llamadas “parámetros”.
*/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Moto motos[] = new Moto[2];

		System.out.println("Sistema de registro de Motos");

		// CARGA DE DATOS
		for (int i = 0; i < motos.length; i++) {
			Moto motoNueva = new Moto();

			System.out.println("Ingrese la marca de moto " + (i + 1));
			motoNueva.marca = sc.next();
			System.out.println("Ingresa el modelo de moto " + (i + 1));
			motoNueva.modelo = sc.next();
			System.out.println("Ingresa el kilometraje actual " + (i + 1));
			motoNueva.kilometrajeActual = sc.nextDouble();
			System.out.println("Ingresa la velocidad promedio " + (i + 1));
			motoNueva.velocidadPromedio = sc.nextDouble();

			motos[i] = motoNueva;
		}

		for (int i = 0; i < motos.length; i++) {
			System.out.println("Moto Nº" + (i + 1));
			System.out.println("Modelo: " + motos[i].modelo + (i + 1));
			System.out.println("Km Actual: " + motos[i].kilometrajeActual + (i + 1));
			System.out.println("Velocidad promedio: " + motos[i].velocidadPromedio + (i + 1));
		}

		double max = 0;
		Moto moto_mas_usada = new Moto();

		for (int i = 0; i < motos.length; i++) {
			if (motos[i].kilometrajeActual > max) {
				moto_mas_usada = motos[i];
				max = motos[i].kilometrajeActual;
			}
		}

		System.out.println("Moto mas baketa" + moto_mas_usada.marca);
		System.out.println("Modelo" + moto_mas_usada.modelo);
		System.out.println("Kilometraje" + moto_mas_usada.kilometrajeActual);
		
		double primerViajeKm = 0;
		double segundoViajeKm = 0;
		System.out.println("¿Cuanto kilometros va a recorrer en un primer viaje?");
		primerViajeKm = sc.nextDouble();
		moto_mas_usada.kilometrajeActual = primerViajeKm;
		double horasRecorridas = moto_mas_usada.kilometrajeActual / moto_mas_usada.velocidadPromedio;
		System.out.println("A esa velocidad, tardaria " + horasRecorridas + "hs");
		
		System.out.println("¿Cuanto kilometros va a recorrer en un segundo viaje?");
		segundoViajeKm = sc.nextDouble();
		moto_mas_usada.kilometrajeActual = segundoViajeKm;
		horasRecorridas = moto_mas_usada.kilometrajeActual / moto_mas_usada.velocidadPromedio;
		System.out.println("A esa velocidad, en un segundo viaje tardaria " + horasRecorridas + "hs");
		
		System.out.println("Moto baketa");
		System.out.println("Marca: " + moto_mas_usada.marca);
		System.out.println("Modelo: " + moto_mas_usada.modelo);
		System.out.println("Kilometraje total: " + (moto_mas_usada.kilometrajeActual+primerViajeKm));
	
	sc.close();
	}

}
