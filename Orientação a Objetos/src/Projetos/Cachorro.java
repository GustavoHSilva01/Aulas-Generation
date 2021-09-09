package Projetos;

public class Cachorro extends Animal{
	
	public Cachorro(String nome,String emitirSom,int idade) {
		super(nome,emitirSom,idade);	
	}
	
	public void deveCorrer() {
		System.out.println("Esta correndo");
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do cachorro: " +getNome()+"\nIdade do cachorro: "+getIdade());
		
	}

		
	}


