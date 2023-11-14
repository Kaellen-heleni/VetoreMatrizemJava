package javaInicial;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		float matriz[][]= new float[3][3],somaDP,somaDS;
		int x,y;
		Scanner receba = new Scanner(System.in);
		
		for(x=0;x<3;x++) {
			for(y=0;y<3;y++) {
				System.out.println("Informe um número: ");
				matriz[x][y] = receba.nextFloat();
			}
		}
		somaDP = matriz[0][0]+ matriz[1][1]+matriz[2][2];
		somaDS = matriz[0][2]+ matriz[1][1]+matriz[2][0];

				
	System.out.println("Elementos da diagonal principal: "+matriz[0][0]+", "+matriz[1][1]+", "+matriz[2][2]+".");
	System.out.println("Elementos da diagonal principal: "+matriz[0][2]+", "+matriz[1][1]+", "+matriz[2][0]+".");
	System.out.println("A soma dos elementos na Diagonal Principal é: "+somaDP+".");
    System.out.println("A soma dos elementos na Diagonal Secundárioa é: "+somaDS+".");		

	}

}