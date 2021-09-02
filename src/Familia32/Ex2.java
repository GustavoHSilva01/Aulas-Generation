package Familia32;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nReceba uma idade ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14){
			
			System.out.print("\nInfantil " + idade);
		
		}
		
		if(idade>=15 && idade<=17){
			
			System.out.print("\nJuvenil " + idade);
		
	
		}
		
		else if(idade>=18 && idade<=25){
			
			System.out.print("\nAdulto " + idade);
		
	
		}
		
		
	}
	
	
	
	

}
