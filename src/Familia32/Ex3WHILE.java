package Familia32;

import java.util.Scanner;

public class Ex3WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade,conti21=0,conti50=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com uma idade : ");
		idade = leia.nextInt();
		
		while(idade != -99) {
			
			if(idade < 21) {
				
				conti21++;
		}
			if(idade > 50) {
				
				conti50++;
			}
				
			
		System.out.println("\nEntre com uma nova idade : ");
		idade = leia.nextInt();		
			}
			
		System.out.println("\nHá "+conti21+" Pessoas com menos de 21 anos e "+conti50+" com mais de 50 ");
		

	}

}
