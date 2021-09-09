package Projetos;

public class Cavalo extends Animal{
	
	public Cavalo(String nome,String emetirSom,int idade) {
		super(nome,emetirSom,idade);
		
	}
	
	public void deveCorrer() {
		System.out.println("Esta correndo");
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do cavalo: " +getNome()+"\nIdade do Cavalo: "+getIdade());
		
	}


}
