package Projetos;

public class AviaoTeste {

	public static void main(String[] args) {
		Aviao boeing = new Aviao("boeing","777","cinza","1911",300,840,2);
		boeing.exibirAviao();
		boeing.setQuantAssen(300);
		boeing.exibirAviao();
	}

}
