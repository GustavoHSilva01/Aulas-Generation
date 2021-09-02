package Familia32;
import java.lang.Math;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		
		double n1;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um numero qualquer: ");
		n1 = leia.nextInt();
		
		if(n1 % 2 == 0) {
			n1 = Math.sqrt(n1);
			
			System.out.print("\nO numero é par, e sua raiz é " + n1);
			
		}
		
		else {
			n1 = Math.pow(n1,2);
			
			System.out.print("\nO numero é impar, e seu quadrado é " + n1);
			
		}
			
	}

}
