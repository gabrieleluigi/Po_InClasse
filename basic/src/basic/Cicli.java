package basic;

public class Cicli {

	public static void main(String[] args) {
		
		// Costrutti di iterazione: obiettivo, ripetere un certo numero 
		// di istruzioni, es. contenute in un blocco di parentesi { }

		// Costrutti disponibili in Java, quelli del C: for, while, do-while
		// Equivalenti, ma, alcuni più adatti di altri in base alla
		// particolare situazione considerata
		
		// Scrivere una iterazione per stampare i numeri int. da 1 a 10 (es., con un for)
		
		System.out.println("Stampo i numeri interi da 1 a 10 con un ciclo FOR");
		
		// Tre "fasi"
		
		// int i;
		// 1) Inizializzazione
                       // 3) Aggiornamento della condizione
		for(int i=1; i<=10; i=i+1) { // Parentesi non necessarie con una sola istruzione nel blocco
			     // 2) Verifica di una condizione (permanenza nel ciclo)
			
			System.out.println(i); // Istr. da ripetere (una sola, in questo caso)
		}	
		
		System.out.println("Ora provo con un ciclo WHILE");
		
		// 1) Inizializzazione
		int j=1;    
		     // 2) Verifica 
		while( j<=10 ) {
			
			System.out.println(j); // Istr. da ripetere
			
			// 3) Aggiornamento 
			j++; //++j; // j=j+2;
		}
		
		System.out.println("Infine, proviamo con un DO-WHILE");

		// 1) Inizializzazione
		int k=1;
		do { // Prima si entra nel ciclo, poi si verifica la condizione, ciclo eseguito almeno una volta
			System.out.println(k);
			// 3) Aggiornamento
			k++;
		} while(k<=10); // 2) Verifica
		
		// Ora, utilizzo tipico dei cicli, scansione di array (cicli ed array insieme)
		
		int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90}; 
		
		System.out.println("Contenuto dell'array");
		
		// Si potrebbe stampare cella per cella, con un copia e incolla di
		// System.out.println(array[0]);
		// System.out.println(array[1]);
        // ...
		
		// Oppure con un ciclo (variabile contatore)
		
		for(int i=0;i< array.length ;i++) // Con Java, si puo' chiedere direttamente all'array la lunghezza 
			System.out.println(array[i]);
		
		// Java tratta gli array come se fossero degli oggetti (un po' particolari, in 
		// effetti) che, come tali, seguono i principi della OOP: INCAPSULAMENTO/INFORMATION 
		// HIDING quindi dati piu' operazioni sui dati (celle dell'array piu', es., dimensione)
		// e DELEGA (non e' il programmatore a doversi preoccupare della sua dimensione, quando 
		// serve lo chiede direttamente all'array stesso con la notazione puntata, .length, il
		// codice si ADATTA)

	}
}







