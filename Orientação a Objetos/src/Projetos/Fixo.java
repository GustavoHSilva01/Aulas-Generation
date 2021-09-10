package Projetos;

public class Fixo extends Telefone {

	public Fixo()//crição do construtor
	{
		super("Telefone Fixo");//passagem de parâmetro para a Superclasse
	}
	@Override
	public void toca(int numToques)//implementando um método da minha classe abstrata
	{
		for(int i=0;i<numToques;i++)
		{
			System.out.println("\nTrum...Trum...Trum");
		}
	}
	@Override
	public void disca(String numero)//implementando um método da minha classe abstrata
	{
		System.out.println("\nDiscando...: "+numero);
	}
}
