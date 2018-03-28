package basic;

import java.lang.reflect.Array;

public class Metodi {

	// Funzione/metodo essenziale per avere una applicazione, in C int argc, char** argv
	public static void main(String args[]) {

		// Metodi, o funzioni, procedure, ecc. strumenti per 
		// fattorizzare codice (MODULARITA')

		// Es., calcolare la media di tre variabili/numeri interi
		
		int a = 3;
		int b = 8;
		int c = 4;
		
		// Si potrebbe scrivere

		double media = (a + b + c) / 3.0;

		System.out.println("La media vale "+media);

		// Ora, se si dovesse calcolare la media di altri tre valori, poi altri tre, ecc.?
		// Copia e incolla, oppure... rendersi conto che puo' convenire fattorizzare quelle istruzioni
		// in un modulo richiamabile piu' volte all'occorrenza, es. calcolaMedia(...);

		// Chiamata la funzione/invocato il metodo, parametri attuali COPIATI nei parametri formali

		                     // PARAMETRI ATTUALI
		media = calcolaMedia(7, 35, 21); 
		System.out.println("La nuova media vale "+media);
		
		// Ora, volendo calcolare la media di un array di interi

		int array[] = {34, 67, 90, 1, 75, 87};	
		
		// Si puo' definire un altra funzione, es. calcolaMediaSuArray(...);
		
		// Java capisce quale sia la versione del metodo piu' adatta, DYNAMIC BINDING
		// Gia' visto con print()/println(), in base al parametro passato viene invocata 
		// la versione che lavora su int, double, char, ecc.

		System.out.println("La media dell'array vale "+calcolaMedia(array));
		
	} // Qui finisce il main

	// Notazione CAMELBACK, e, per convenzione, metodi con iniziali minusc.
	                          
	                           // PARAMETRI FORMALI
	static double calcolaMedia(int primo, int secondo, int terzo) {
		return (primo+secondo+terzo)/3.0; // La stessa istruzione, gia' vista, solo spostata nel modulo
	}
	
	// FIRMA DI UN METODO: nome del metodo, tipo/ordine dei parametri
	
	// Non possono esistere in una classe due metodi con la stessa firma (ma stesso nome si), POLIMORFISMO
	
	// Metodo con lo stesso nome, Java si sta adattando al contesto, POLIMORFISMO

	static double calcolaMedia( int arr[]) { // Inialmente, calcolaMediaSuArray(int arr[])

		double somma = 0;
		for(int i=0; i<arr.length; i++) // 4
			somma+=arr[i];
		double media = somma / arr.length;
		return media;
	} // Meglio se con meno righe di codice, ottimizzazioni
	
	
	
	
}






