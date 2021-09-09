package Projetos;

public class Cliente {
	
	private String nome,cpf,local,idade,celular;

	public Cliente(String nome, String cpf, String local, String idade, String celular) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.local = local;
		this.idade = idade;
		this.celular = celular;
	}
	
	public void exibirCliente() {
		
	System.out.println("\nNome : "+this.nome+"\nCpf : " + this.cpf+"\nLocal : "
	+this.local+"\nIdade : "+idade+"\nCelular : "+celular);
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	
	}
