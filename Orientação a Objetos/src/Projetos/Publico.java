package Projetos;

public class Publico extends Telefone {

	public Publico()//cri��o do construtor
	{
		super("Telefone Publico");//passagem de par�metro para a Superclasse
	}
	
	@Override
	public void toca(int numToques)
	{
		for(int i=0;i<numToques;i++)
		{
			System.out.println("\nTrililinnnn...");
		}
	}
	
	@Override
	public void disca(String numero)
	{
		if(numero.charAt(0)=='9' || numero.charAt(0)=='8')//vai pegar atrav�s do charAt o primeiro caracter do n�mero
		{
			System.out.println("\nEsse tipo de telefone n�o liga para celular");
		}
		else
		{
			System.out.println("\nDiscando: "+numero);
		}
	}
}

