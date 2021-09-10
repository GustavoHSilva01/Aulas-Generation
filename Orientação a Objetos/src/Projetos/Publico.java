package Projetos;

public class Publico extends Telefone {

	public Publico()//crição do construtor
	{
		super("Telefone Publico");//passagem de parâmetro para a Superclasse
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
		if(numero.charAt(0)=='9' || numero.charAt(0)=='8')//vai pegar através do charAt o primeiro caracter do número
		{
			System.out.println("\nEsse tipo de telefone não liga para celular");
		}
		else
		{
			System.out.println("\nDiscando: "+numero);
		}
	}
}

