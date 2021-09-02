package Familia32;

import java.util.Scanner;

public class Ex5DOWHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero,soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um valor : ");
		numero = leia.nextInt();
		
		
		
		while(numero != 0) 
		{
			soma += numero;
			
			System.out.println("\nEntre com um valor : ");
			numero = leia.nextInt();
			
			
		}
		
		
			System.out.println("\nO resultado da soma é : " + soma);		
		
	}
	


}
