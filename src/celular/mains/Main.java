package celular.mains;

import java.util.Scanner;

import celular.modelos.Celular;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Celular celulares[] = new Celular[2];

		boolean confirma = false; //
		// ENTRADA DE CELULARES
		for (int i = 0; i < celulares.length; i++) {
			Celular nuevoCelular = new Celular();

			System.out.println("Celular " + (i + 1));
			System.out.println("Que marca es?");
			nuevoCelular.marca = sc.next();
			
			do{
			System.out.println("Cuantas horas de bateria?");
			nuevoCelular.hsBateria = sc.nextDouble() / 100;
			if(nuevoCelular.hsBateria > 0) {
				confirma = true;
			}else {
				System.out.println("La bateria no puede ser cero amiguito");
			}
			}while(!confirma);
			
			confirma = false; //Reiniciamos bandera a falso para iniciar ingreso de brillo y confirmar que no sea 0
			do {
			System.out.println("Que porcentaje de brillo tiene?");
			nuevoCelular.brilloPantalla = sc.nextDouble() / 100;
			if(nuevoCelular.brilloPantalla > 0){
				confirma = true;
			}
			}while(!confirma);
			
			System.out.println("Cuanto saldo tiene?");
			nuevoCelular.saldoDisp = sc.nextInt();

			celulares[i] = nuevoCelular;
		}
		
		Celular celularActual = new Celular();
		
		// SALIDA DE INFORMACION DE CELULARES
		for(int i = 0; i < celulares.length; i++) {
			
			celularActual = celulares[i];
			double duracionRealBat = celularActual.duracionReal();
			celularActual.hsBateria = duracionRealBat;
			
			System.out.println("Celular " + (i + 1));
			System.out.println("Marca: " + celularActual.marca);
			System.out.println("Duracion de la bata: " + (int) celularActual.hsBateria + "hs");
			System.out.println("El brilli brilli: " + (int)(celularActual.brilloPantalla * 100));
			System.out.println("El saldo pa gastar: " + celularActual.saldoDisp + "\n");
		
		}
		
		
		sc.close();
	}

}
