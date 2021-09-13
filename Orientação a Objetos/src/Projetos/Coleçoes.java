package Projetos;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Coleçoes {

	public static void main(String[] args) {
		
		
		 List <Integer> minhaLista = new ArrayList<Integer>();//criação da interface list do tipo ArrayList chamada minhaLista
	        
	        minhaLista.add(2);//adicionando elementos no ArrayList
	        minhaLista.add(1);
	        minhaLista.add(2);
	        minhaLista.add(1);
	        minhaLista.add(3);
	        
	        for(Integer listaElementos:minhaLista)//imprimindo os elementos
	        {
	            System.out.println("Lista Elementos:"+listaElementos);
	        }
	        
	        System.out.println("\nRemovendo um elemento da lista...");
	        
	        System.out.println();
	        
	        minhaLista.remove(0);//remove um elemento da lista a partir do seu índice
	        for(Integer listaElementos:minhaLista)
	        {
	            System.out.println("Lista Elementos:"+listaElementos);
	        }
	        
	        int primeiroElemento = minhaLista.get(0); //pega um elemento da lista a partir do seu índice
	        System.out.println("\nO primeiro elemento é: "+primeiroElemento);
	        System.out.println();
	        
	        for(int i=0;i<minhaLista.size();i++)//size -- tamanho da lista
	        {
	            System.out.println("\nElementos: "+minhaLista.get(i));
	        }
	        
	        Collections.sort(minhaLista);
	        
	        System.out.println("\nDepois de ordenado...");
	        
	        System.out.println(minhaLista);
	        
	        System.out.println();
	        
	        Set <Integer> meuSet = new HashSet<Integer>();
	        
	        meuSet.add(3);
	        meuSet.add(2);
	        meuSet.add(1);
	        meuSet.add(3);
	        meuSet.add(2);
	        
	        Iterator <Integer> iMeuSet = meuSet.iterator();
	        
	        while(iMeuSet.hasNext())
	        {
	            System.out.println(iMeuSet.next());
	        }
	        
	        
	        
	    }


	}


