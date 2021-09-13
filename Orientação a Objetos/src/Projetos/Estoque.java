package Projetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Estoque {

	public static void main(String[] args) {
		
		 List <Integer> minhaLista = new ArrayList<Integer>();
	        
	        minhaLista.add(0);
	        minhaLista.add(1);
	        minhaLista.add(2);
	        minhaLista.add(3);
	        minhaLista.add(4);
	        
	        for(Integer listaProdutos:minhaLista)
	        {
	            System.out.println("Lista Produtos: "+listaProdutos);
	        }
	        
	        System.out.println("\nRemovendo um produto da lista...");
	        
	        System.out.println();
	        
	        minhaLista.remove(0);
	        for(Integer listaProdutos:minhaLista)
	        {
	            System.out.println("Lista Produtos:"+listaProdutos);
	        }
	        
	        int primeiroProduto= minhaLista.get(0); //pega um elemento da lista a partir do seu índice
	        System.out.println("\nO primeiro produto é: "+primeiroProduto);
	        System.out.println();
	        
	        for(int i=0;i<minhaLista.size();i++)//size -- tamanho da lista
	        {
	            System.out.println("\nProdutos: "+minhaLista.get(i));
	        }
	        
	        Collections.sort(minhaLista);
	        
	        System.out.println("\nDepois de ordenado...");
	        
	        System.out.println(minhaLista);
	        
	        System.out.println();
	        
	        Set <Integer> meuSet = new HashSet<Integer>();
	        
	        meuSet.add(0);
	        meuSet.add(1);
	        meuSet.add(2);
	        meuSet.add(3);
	        meuSet.add(4);
	        
	        Iterator <Integer> iMeuSet = meuSet.iterator();
	        
	        while(iMeuSet.hasNext())
	        {
	            System.out.println(iMeuSet.next());
	        }
	        
	        
	        
	    }

	}


