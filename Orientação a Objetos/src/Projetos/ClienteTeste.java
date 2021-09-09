package Projetos;

public class ClienteTeste {

	public static void main(String[] args) {
		Cliente Gustavo = new Cliente("nome","cpf","local","idade","celular");
		Gustavo.setCelular("11996640383");
		Gustavo.setIdade("20");
		Gustavo.setLocal("Santo André");
		Gustavo.setCpf("09125855");
		Gustavo.exibirCliente();
	}

}
