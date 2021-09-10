package Projetos;

public abstract class Telefone {

	private String tipo; //criação do atributo
	abstract public void disca(String numero);//criação dos métodos abstratos
	abstract public void toca(int numToques);
	
	//inicialização do construtor
	public Telefone(String tipo)
	{
		this.tipo = tipo;
	}
	
	//criação dos métodos da classe
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}



