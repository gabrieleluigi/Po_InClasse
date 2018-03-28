package jcf;

import java.util.*; // Importo tutto il package per comodità

public class EsempioOrdinamento {

	public static void main(String[] args) {

		ArrayList<Automobile> lista = new ArrayList<Automobile>();
		lista.add(new Automobile("AB123CD","Fiat","Panda",1000));
		lista.add(new Automobile("ZZ999BB","Volvo","V6",2000));
		lista.add(new Automobile("ZZ999CC","Audi","A8",1500));
		
		//Collections.sort(lista); // Ordina la lista che passate come parametro
		
		// Non ottengo una nuova lista, ma la precedente, ordinata
		
		// Posso ordinare usando il metodo compareTo() in Automobile dell'interfaccia Comparable
		
		// Collections.sort(lista);
		
		// Oppure, se voglio poter ordinare in modi diversi, usare classi dedicate al
		// confronto, dei "comparatori" che implementano l'interfaccia Comparator ed il
		// relativo metodo compare()
		
		//Collections.sort(lista, new ComparatoreDiAutomobiliPerTarga());
		Collections.sort(lista, new ComparatoreDiAutomobiliPerMarca()); // Anche qui, possibile parametrizzazione <>

		// Sampo con un for-each
		
		for(Automobile a : lista)
			System.out.println(a);
		
	}

}
