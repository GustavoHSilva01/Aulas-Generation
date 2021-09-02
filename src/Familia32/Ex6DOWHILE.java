package Familia32;

import java.util.Scanner;

public class Ex6DOWHILE {

	public static void main(String[] args) {
		
		
		float numero,soma=0,cont=0,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um valor : ");
		numero = leia.nextInt();
		
		while(numero != 0) 
		{
			if(numero % 3 == 0)
			{
				soma += numero;
				cont++;
			}
			System.out.println("\nEntre com um novo valor : ");
			numero = leia.nextInt();
		
				
			}
		if(cont>=1) {
			media = soma/cont;
			System.out.println("\nA media é : " + media);		
			
			
		}
		
		else {
			
			System.out.println("\nNão ha numeros multiplos de 3 portanto a média é 0 : " );
		}
		
		
		}
	
	}


