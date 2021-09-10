package Projetos;

public class Celular extends Telefone { //criando heran�a com a classe Telefone

	public Celular()//cri��o do construtor
	{
		super("Telefone Celular");//passagem de par�metro para a Superclasse
	}
	
	@Override  //indica uma assinatura de refer�ncia para a sobrescrita do m�todo polimorfico
	public void toca(int codigoToque)//implementando o m�todo abstrato da superclasse
	{
		switch(codigoToque)
		{
		case 1:
			System.out.println("\nTantan�n�nan...");
			break;
		case 2:
			System.out.println("\nTrililinn...Trililinn...");
			break;
		default:
			System.out.println("\nTaranranrannnn...");
		}
	}
	@Override
	public void disca(String numero)//implementando o m�todo abstrato da superclasse
	{
		System.out.println("\nO n�mero: "+numero+" � um celular...");
	}
}


