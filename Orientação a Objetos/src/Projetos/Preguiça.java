package Projetos;

public class Preguiça extends Animal{

	public Preguiça(String nome,String emetirSom,int idade) {
		super(nome,emetirSom,idade);
		
	}
	
	public void deveCorrer() {
		System.out.println("Esta correndo");
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do bicho preguica: " +getNome()+"\nIdade do bicho preguica: "+getIdade());
		
	}

}
