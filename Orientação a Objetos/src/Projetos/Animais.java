package Projetos;

public abstract class Animais {
	
	private String idade,nome;
	
	

	public Animais(String idade, String nome) {
		this.idade = idade;
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void emetirSom(String som);

}
