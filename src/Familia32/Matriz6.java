package Familia32;

import java.util.Scanner;

public class Matriz6 {
	public static void main(String[] args) {
		
		int numero[] = new int[6];
		int parSoma=0,imparConta=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 6; i++) {
			
			System.out.println("\nEntre com o valor: " + i);
			numero[i] = leia.nextInt();
			
			if(numero[i] % 2 ==0) {
				
				parSoma += numero[i];
			
				System.out.println("\nNumeros pares: " + numero[i]);
				 
			}
			
			else {
				
				imparConta++;
				
				System.out.println("\nNumeros impares: " + numero[i]);
			}
			
		
		}
		
		System.out.println("\nSomatoria dos pares: " + parSoma);
		System.out.println("\nContagem dos impares: " + imparConta);
	}
}
