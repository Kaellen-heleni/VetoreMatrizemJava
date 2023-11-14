package javaInicial;
import java.util.Scanner;

public class ExercicioVetor1 {

	public static void main(String[] args) {
		int vetor[] = new int [10]; 
		int somaVetor=0,x;
		float media;
		Scanner receba = new Scanner(System.in);
		
		for (x=0;x<10;x++) {
			System.out.println("Informe um número: ");
			vetor[x] = receba.nextInt();
			if (x % 2 == 1) {
				System.out.println("Elemento em um índice impar: "+vetor[x]);
			}
			if (vetor[x] % 2 == 0) {
				System.out.println("O número: "+vetor[x]+ " é um elemento par!");	
			}
			somaVetor += vetor[x];			
			}
		media = somaVetor/x;
		System.out.println("O valor da soma de todos os elementos do vetor é: "+somaVetor+".");
		System.out.println("O valor da média de todos os elementos do vetor é: "+media+".");
		System.out.println("Elementos nos índices impares: "+vetor[1]+", "+vetor[3]+", "+vetor[5]+", "+vetor[7]+", "+vetor[9]+".");
		}
	
		
}
		



