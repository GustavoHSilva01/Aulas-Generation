package Projetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque2 {

	public static void main(String[] args) {
		
		
		int op;
        Scanner leia = new Scanner(System.in);
        ArrayList <String> estoque = new ArrayList();
        
        do
        {
            System.out.println("\n\t\tLista do Produtos");
            System.out.println("\n(1) Deseja adicionar algum produto ao estoque?");
            System.out.println("\n(2) Deseja remover algum produto do estoque?");
            System.out.println("\n(3) Deseja atualizar algum produto do estoque?");
            System.out.println("\n(4) Apresentar os produtos do estoque");
            System.out.println("\n(0) Encerrar o programa?");
            System.out.println("\nQual a sua op��o?");
            op = leia.nextInt();
            
            switch(op)
            {
            case 1:
                leia.nextLine();
                System.out.println("\nDigite o produto para adicionar ao estoque: ");
                String produto = leia.nextLine();
                estoque.add(produto);
                break;
            case 2:
                leia.nextLine();
                System.out.println("\nDigite o produto para remover do estoque: ");
                String produtor = leia.nextLine();
                if(estoque.contains(produtor))
                {
                    estoque.remove(produtor);
                }
                else
                {
                    System.out.println("\nProduto n�o existe!!!");
                }
                System.out.println(estoque);
                break;
            case 3:
                leia.nextLine();
                System.out.println("\nDigite o produto que quer atualizar: ");
                String verifica = leia.nextLine();
                System.out.println("\nDgite o nome do produto que entrar� no lugar do produto: "+verifica+": ");
                String novo = leia.nextLine();
                
                if(estoque.contains(verifica))
                {
                    estoque.remove(verifica);
                    estoque.add(novo);
                }
                else
                {
                    System.out.println("\nProduto n�o existe!");
                }
                System.out.println(estoque);
                break;
            case 4:
                System.out.println("\nOs produtos do estoque s�o: ");
                System.out.println(estoque);
                break;
                default:
                    System.out.println("\nOp��o inv�lida!");
            }
        }while(op!=0);
    }


	}


