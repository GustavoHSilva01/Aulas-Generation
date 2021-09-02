package Familia32;

import java.util.Scanner;

public class Dia1Java {

	public static void main(String[] args) {
		
		int a,b,c,Maior=0;
		Scanner leia = new Scanner(System.in);
		
	System.out.println("\nReceba o valor de a: ");
	a = leia.nextInt();
	System.out.println("\nReceba o valor de b: ");
	b= leia.nextInt();
	System.out.println("\nReceba o valor de c: ");
	c = leia.nextInt();
	
	if(a>Maior) {
		Maior = a;					
	}
	
	if(b>Maior) {
		Maior = b;					
	}
	
	if(c>Maior) {
		Maior = c;					
	}
		
	System.out.print("\nO maior numero é: " + Maior);

	}

}
