package Familia32;

import java.util.Scanner;

public class Ex3ARRAYS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero[][] = new int[3][3];
		
		int maiorDez = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {

			for(int j = 0; j < 3; j++) {
				
				System.out.println("\nEntre com o valor: " + numero[i][j]);
				 numero[i][j] = leia.nextInt();
				 
				 if(numero[i][j] > 10) {
					 
					 maiorDez++;
					 		 
				 }
			}
		}
		
				System.out.println("\nValores maior que dez: " + maiorDez);
	
	}

}
