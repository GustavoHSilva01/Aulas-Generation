package Familia32;

import java.util.Scanner;

public class Ex4WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,g,fp,x=0,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(x<=5) 
		{
			
			System.out.println("\nEntre com a sua idade: ");
			i = leia.nextInt();
			while(i<1 || i>120)
			{
				System.out.println("\nEntre com uma nova idade: ");
				i = leia.nextInt();
				
			}
			System.out.println("\nEntre com o seu genero: \n1- Feminino\n2- Masculino\n3- Outros ");
			g = leia.nextInt();
			while(g<1 || g>3)
			{
				System.out.println("\nEntre com um novo genero: \n1- Feminino\n2- Masculino\n3- Outros ");
				g = leia.nextInt();
				
			}
			System.out.println("\nEntre com a seu fator psicológico : \n1- Calma\n2- Nervosa\n3- Agressiva ");
			fp = leia.nextInt();
			while(fp<1 || fp>3)
			{
				System.out.println("\nEntre com um novo fator psicológico : \\n1- Calma\\n2- Nervosa\\n3- Agressiva ");
				fp = leia.nextInt();
				
			}
			
			if(fp==1) 
			{
				contpc++;
				
			}
			
			if(g==1 && fp==2) 
			{
				
				contmn++;
			}
			if(g==2 && fp==3) 
			{
				
				contha++;
			}
			if(g==3 && fp==1) 
			{
				
				contoc++;
			}
			if(fp==2 && i>40) 
			{
				
				contpn40++;
			}
			if(fp==1 && i<18) 
			{
				
				contpc18++;
			}
			x++;
		}
		System.out.println("\nQuantidade de pessoas calmas : " + contpc);
		System.out.println("\nQuantidade de mulheres nervosas : " + contmn);
		System.out.println("\nQuantidade de homens agressivos : " + contha);
		System.out.println("\nQuantidade de outros calmos : " + contoc);
		System.out.println("\nQuantidade de pessoas nervosas com mais de 40 anos : " + contpn40);
		System.out.println("\nQuantidade de pessoas calmas com menos de 18 anos : " + contpc18);
	}

}
