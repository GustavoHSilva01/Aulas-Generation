package Projetos;

public class ExibirAnimais {

	public static void main(String[] args) {
		
		
		Cachorros cachorros = new Cachorros("12","Astolfo");
		Cavalos cavalos = new Cavalos("15","Paloma");
		BixosPregui�a bixospregui�a = new BixosPregui�a("12","Astolfo");
		
		
		System.out.println("Cachorro: "+cachorros.getNome()+"\nIdade: "+cachorros.getIdade());
		cachorros.emetirSom("auauauau");
		System.out.println("Cavalos: "+cavalos.getNome()+"\nIdade: "+cavalos.getIdade());
		cachorros.emetirSom("Hin Hin Hin");
		System.out.println("BixosPregui�a: "+bixospregui�a.getNome()+"\nIdade: "+bixospregui�a.getIdade());
		bixospregui�a.emetirSom("zZzZZzZz");


	
	}

}
