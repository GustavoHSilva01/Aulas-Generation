package Projetos;

public abstract class Telefone {

	private String tipo; //cria��o do atributo
	abstract public void disca(String numero);//cria��o dos m�todos abstratos
	abstract public void toca(int numToques);
	
	//inicializa��o do construtor
	public Telefone(String tipo)
	{
		this.tipo = tipo;
	}
	
	//cria��o dos m�todos da classe
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}



