package Projetos;

public class Aviao {

	 private String nome,modelo,cor,anoFabricado;
	 private double quantAssen,veloMax,veloMin;
	 
	public Aviao(String nome, String modelo, String cor, String anoFabricado, double quantAssen, double veloMax,
			double veloMin) {
		
		this.nome = nome;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFabricado = anoFabricado;
		this.quantAssen = quantAssen;
		this.veloMax = veloMax;
		this.veloMin = veloMin;
	}

	public void exibirAviao() {
		
		System.out.println("\nNome "+this.nome+"\nModelo " + this.modelo+"\nCor "+this.cor+"\nAno de Fabricação "
		+this.anoFabricado+"\nQuantidade de assentos : "+quantAssen+"\nVelocidade Maxima : "+veloMax+"\nVelocidade Minina: "+veloMin);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAnoFabricado() {
		return anoFabricado;
	}

	public void setAnoFabricado(String anoFabricado) {
		this.anoFabricado = anoFabricado;
	}

	public double getQuantAssen() {
		return quantAssen;
	}

	public void setQuantAssen(double quantAssen) {
		this.quantAssen = quantAssen;
	}

	public double getVeloMax() {
		return veloMax;
	}

	public void setVeloMax(double veloMax) {
		this.veloMax = veloMax;
	}

	public double getVeloMin() {
		return veloMin;
	}

	public void setVeloMin(double veloMin) {
		this.veloMin = veloMin;
	}
	
	
	
	}


