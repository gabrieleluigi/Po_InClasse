package basic;

public class Array {

	public static void main(String[] args) {
		
		// Dichiarazione di un array di interi in C
		// int array[100];
		
		// In Java, diverse alternative
		
		// Dichiarazione array per ENUMERAZIONE 
		
		// Tre celle, indici
		//              0   1   2 (ovvero, dim-1)

		int array[] = {10, 20, 30}; // (dimensione e contenuto insieme, inizializzazione)
		
		// Accesso con notazione [ ] ed indici, come in C

		int primo = array[0]; // Contenuto della prima cella, 0-esima
		
		// Stampa del contenuto della prima cella

		System.out.println("Il valore della prima cella è "+primo);
		
		// Anche senza passare per la variabile, direttamente array[indice]

		System.out.println("Seconda cella "+array[1]); 
		
		// Che succede se si cerca di accedere ad una cella al di fuori dell'array?
		
		// L'istruzione che segue genera una eccezione (di tipo ArrayIndexOutOfBoundsException
		// Imparare a leggere questo tipo di situazioni/messagg in rosso, errore alla riga ..., 
		// e dettagli, es. indice cella acceduta

		System.out.println("Terza cella "+array[3]); // array[2]
		
		// Altro modo di dichiarare un array
		
		// int array[] = {10, 20, 30, 40};
		
		int altroArray[] = new int[4]; // In linguaggio C, int array[4];
		
		// Poi, inizializzazione

		altroArray[0] = 10;
		altroArray[1] = 20;
		altroArray[2] = 30;
		// ...
		
		String s;
		
	}

}







