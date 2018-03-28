package basic; // Sempre nella prima riga
//include <stdio.h>
import java.awt.*;

//Una classe un po' particolare, non un vero contenitore di dati 
//ed operazioni sui dati, pero' possiede il main, puo' essere eseguita 
//(applicazione, almeno una classe dotata di main)

public class Variabili {

	public static void main(String[] args) {
		// Questo è un commento su una riga

		/*
		 * Questo è un commento su più righe
		 */
		
		int x; // Dichiarazione di una variabile intera
		x = 5; // Assegnazione di un valore alla variabile (inizial.)
		
		// Eventualmente su un'unica riga
		int y = 5;

		// Stampa a video (nella console) della variabile
		
		// In linguaggio C
		
		// #include <stdio.h>
		// printf("%d");
		
		// Eventuali altri modificatori, %d %lf %s %c

		// In linguaggio Java, System.out.print(...); 
		// Ed import al posto di include (non necessario per funzionalita' base)

		// Quindi, in linguaggio C
		// printf("Ciao mondo!");
		// printf("%d", x);

		// In linguaggio Java	
		// System.out.print("Ciao mondo!");
		// System.out.print(x);
		
		// Altri tipi di dato primitivi, come in C
		
		short sh;
		long l;
		
		float f;
		double d;
		
		// Altri tipi di dato, con differenze rispetto al C

		char c; // In C era su 8 bit con codifica ASCII
        			// In Java su 16 bit con codifica UNICODE
		
		byte b; // Un ottetto, su 8 bit con segno, tra -128 e +127
		
		boolean binario;
		binario = true; // Oppure false
		
		// Sempre con print() si possono stampare altri tipi di dato
		
		System.out.print(binario); // POLIMORFORMISMO, Java si adatta al contesto 
								  // e chiama la versione giusta		
		
		// CONCATENAZIONE (DI STRINGHE, ECC.)
		
		double valore = 6.8;

		// Per stampare una stringa ed il valore della variabile, in linguaggio C
		
		//printf("Il valore della variabile e' %lf", valore);
		
		// In linguaggio Java
		
		System.out.println("Il valore della variabile è "+valore+"\n !!!"); // + OPERATORE DI CONCATENAZIONE

		// Si possono usare \n, \t, ecc., oppure ...
		
		// ... variante della funzione di stampa, con a capo 
		System.out.println(binario);

		// Stringhe, altro tipo di dato, gestito in C tramite array di caratteri, es.
		
		//char s[100];
		
		// Lo si potrebbe fare anche in Java, ma si preferisce utilizzare un altro
		// tipo di dato, specifico per questo tipo di informazioni, ovvero la classe String
		
		String s; // Dichiarata una variabile che può fare riferimento ad un  
		          // oggetto tipo String (String è una CLASSE di Java)
		
		// Per creare un oggetto/istanza della classe String: operatore new e costruttore
		
		s = new String("La mia prima stringa in Java");
		
		// Equivalente a
		       
		s = "La mia prima stringa in Java"; // Scorciatoia, semplificazione per il programmatore
		                                    // "stranezze" di un linguaggio ad oggetti "non puro"
		
		// Dalla struttura dei dati ai dati: s è un OGGETTO di tipo String
		
		// La funzione di stampa print() continua a poter essere utilizzata

		System.out.println(s);
		
		// Confrontando le istruzioni int x = 5; con String s = new String("..."); si puo'
		// dire che in entrambi i casi si definisce una variabile, i oppure s, ma nel caso
		// della stringa si parla di VARIABILE RIFERIMENTO, o semplicemente RIFERIMENTO
		// (si dice che s "fa riferimento" all'oggetto di tipo String creato in memoria
		// (ed inizializzato) dall'operatore new e dal costruttore String()

		// Java, linguaggio fortemente tipizzato (TIPIZZAZIONE, viene verificata la corrispondenza tra i tipi)
		
		// Ad esempio, due istruzioni con errore di tipo "type mismatch" segnalato da Eclipse
		
	    // String ss = 1;
	    // int ii = 3.7;
		
	}

}






