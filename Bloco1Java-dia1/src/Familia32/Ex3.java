package Familia32;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		

		int a,b,c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de a: ");
		a = leia.nextInt();
		System.out.println("\nEntre com o valor de b: ");
		b = leia.nextInt();
		System.out.println("\nEntre com o valor de c: ");
		c = leia.nextInt();
		
		if(a<=b && b<=c) {
			
			System.out.println("\nOrdem Crescente : "+a+", "+b+" e "+c);
		}
		
		else if(a<=c && c<=b) {
			
			System.out.println("\nOrdem Crescente : "+a+", "+c+" e "+b);
		}
		
		else if(b<=a && a<=c) {
		
			System.out.println("\nOrdem Crescente : "+b+", "+a+" e "+c);
		}
		
		else if(b<=c && c<=a) {
			
			System.out.println("\nOrdem Crescente : "+b+", "+c+" e "+a);
		}
		
		else if(c<=a && a<=b) {
			
			System.out.println("\nOrdem Crescente : "+c+", "+a+" e "+b);
		}
		
		else {
			
			System.out.println("\nOrdem Crescente : "+c+", "+b+" e "+a);
		}
		
	}

}
