package org.generation.italy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashSet<Integer> insiemeNumeri=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		String risp;
		
		insiemeNumeri.add(334);
		insiemeNumeri.add(5243);
		insiemeNumeri.add(12);
		insiemeNumeri.add(465);
		insiemeNumeri.add(22);
		
		/*for(int n:insiemeNumeri)		//for-each (scorre tutti gli elementi)
			System.out.println(n);*/
		
		Iterator<Integer> iteratore= insiemeNumeri.iterator();
		int n;
		System.out.println("**** HASHSET ****");
		
		do {
			System.out.println("Vuoi estrarre un numero (s/n)?");
			risp=sc.nextLine();
			if (risp.equals("s"))				
				if (iteratore.hasNext())	//c'è qualcosa nell'insieme
				{
					n=iteratore.next();		//prendo il prossimo elemento dall'insieme
					System.out.println("Ho estratto: "+ n);
				}
				else
				{
					System.out.println("Non c'è più niente da estrarre");
					risp="n";
				}
		} while(risp.equals("s") );
		

		System.out.println("**** ARRAYLIST ****");
		ArrayList<Integer> listaNumeri=new ArrayList<>();
		listaNumeri.add(334);
		listaNumeri.add(5243);
		listaNumeri.add(12);
		listaNumeri.add(465);
		listaNumeri.add(22);
		Iterator<Integer> iteratoreLista= listaNumeri.iterator();
		do {
			System.out.println("Vuoi estrarre un numero (s/n)?");
			risp=sc.nextLine();
			if (risp.equals("s"))				
				if (iteratoreLista.hasNext())	//c'è qualcosa nell'insieme
				{
					n=iteratoreLista.next();		//prendo il prossimo elemento dall'insieme
					System.out.println("Ho estratto: "+ n);
				}
				else
				{
					System.out.println("Non c'è più niente da estrarre");
					risp="n";
				}
		} while(risp.equals("s") );
		sc.close();
	}

}
