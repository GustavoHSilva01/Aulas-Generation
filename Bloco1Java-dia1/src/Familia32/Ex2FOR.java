package Familia32;

import java.util.Scanner;

public class Ex2FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n,x,contPar=0,contImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++) 
		{
			System.out.println("\nEntre com um numero: ");
			n = leia.nextInt();
					
				if(n % 2 == 0) 
				{
					contPar++;
				}
				
				else 
				{
					contImpar++;
				}
		}
		
			System.out.println("\nQuantidade de pares: " + contPar);
			System.out.println("\nQuantidade de Impares: " + contImpar);
	} 

}
