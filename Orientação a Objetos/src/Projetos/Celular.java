package Projetos;

public class Celular extends Telefone { //criando herança com a classe Telefone

	public Celular()//crição do construtor
	{
		super("Telefone Celular");//passagem de parâmetro para a Superclasse
	}
	
	@Override  //indica uma assinatura de referência para a sobrescrita do método polimorfico
	public void toca(int codigoToque)//implementando o método abstrato da superclasse
	{
		switch(codigoToque)
		{
		case 1:
			System.out.println("\nTantanãnãnan...");
			break;
		case 2:
			System.out.println("\nTrililinn...Trililinn...");
			break;
		default:
			System.out.println("\nTaranranrannnn...");
		}
	}
	@Override
	public void disca(String numero)//implementando o método abstrato da superclasse
	{
		System.out.println("\nO número: "+numero+" é um celular...");
	}
}


