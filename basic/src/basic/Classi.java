package basic;

public class Classi {

	public static void main(String[] args) {

		// Finora, non una vera applicazione dei dettami della programmazione ad oggetti
		// Ora, problema reale, es. creare una applicazione per la gestione di una collezione
		// di studenti, ciascuno con matricola, nome e cognome
		
		// Potrei memorizzare queste informazioni in variabili separate
		
		int matricola1 = 12345;
		String nome1 = "Mario";
		String cognome1 = "Rossi";
		
		// Per il secondo studente

		int matricola2 = 67890;
		String nome2 = "Anna";
		String cognome2 = "Green";
		
		// Copia e incolla per tutti gli studenti? Se fossero tanti, meglio cercare altre strade
		
		// In C, si sarebbe forse definita una struct, meglio perche' le informazioni relative ad uno
		// studente sono mantenute insieme, e si potrebbero poi creare strutture piu' sofisticate,
		// aggregando piu' istanze della struct (es. array, liste, ecc.)

		/*
		struct Studente{
			int matricola;
			char nome[100]; // String nome;
			char cognome[100]; // String cognome;
		}
		*/
		
		// In Java non ci sono le struct, ma l'equivalente concettuale e' rappresentato dalla Classe
		// Contenitore di dati (e operazioni sui dati), da utilizzare per creare eventualmente
		// strutture dati piu' sofisticate (come prima, array, liste, ecc.)

		// Quindi, creazione della classe Studente (processo di astrazione), si definisce la struttura dei dati
		
		// Dopo aver definito la classe, per poterla utilizzare occorre crearne delle istanze
		
		// Parallelismo con le stringhe
		
		//String s;
		//       s = new String();
	
		// Creazione di una istanza della classe Studente 

		Studente s1; // Variabile riferimento, l'oggetto non e' ancora stato creato
		         s1 = new Studente(); // Creazione dell'oggetto in memoria ed inizializzazione (COSTRUTTORE)
		
		s1.matricola = 78943; // Notazione "puntata", nome dell'oggetto, in questo caso s1, seguito da .
		s1.nome = "Alberto";
		s1.cognome = "Neri";
		        
		// Per stampare lo studente?
		
		//System.out.println(s1);         
		      
		// Non funziona, perche' non si sta stampando l'oggetto, ma il contenuto della variabile riferimento
		// ... si vede comparire a video uno strano simbolo, e' lo UID dell'oggetto (sembra un puntatore del C)
		
		// Avendo il riferimento, però, si puo' accedere agli attributi (e metodi) dell'oggetto (notazione puntata)

		System.out.println(s1.matricola);
		System.out.println(s1.nome);
		System.out.println(s1.cognome);
		    
		// Eventualmente concatenandoli in un'unica stringa
		
		System.out.println(s1.matricola+" "+s1.nome+" "+s1.cognome);
		
		// Creazione ed inizializzzione di un secondo studente in maniera analoga (new e notazione puntata)
		
		Studente s2 = new Studente();
		
		s2.matricola = 11111;
		s2.nome = "Luisa";
		s2.cognome = "Azzurri";

		// Se si volesse accedere ad un attributo della classe Studente definito come private (es. laureato)?
		// L'approccio basato sulla notazione puntata, .matricola, .nome, ecc., non funziona piu'

		//s2.laureato = true; // Es., accesso in scrittura all'attributo laureato

		// Ci si rende conto che servirebbe un metodo, pubblico, con il quale 
		// impostare l'attributo (oltre a svolgere eventualmente altre operazioni)
		
		s2.siLaurea(); // Invocazione del metodo, MESSAGE PASSING, DELEGA ed uso dell'INFORMATION HIDING
		
		// Analogamente, per un accesso in scrittura (es., sullo stesso attributo)
		
		System.out.println(s2.matricola+" "+s2.nome+" "+s2.cognome+" "+s2.dimmiSeSeiLaureato());
																	
		// Tornando al problema iniziale, collezione di studenti... 
		
		// ... si può continuare a diochiarare variabili di tipo Studente
		
		Studente s3 = new Studente();
		Studente s5 = new Studente();
		Studente s6 = new Studente();
		//...

		// Oppure un array di oggetti di tipo Studente, seguendo un parallelismo con un array di interi

		int arrayDiInteri[] = {10, 20, 30}; // Per enumerazione

		// Alternativa con new 
		
		/*
		int arrayDiInteri[] = new int[3]; // Non inizializzato
		arrayDiInteri[0] = 10; // Inizializzazione
		arrayDiInteri[1] = 20;
		arrayDiInteri[2] = 30;
		*/

		// Per gli studenti
		
		Studente arrayDiStudenti[] = {s1, s2, s3};
		
		// Alternativa con new
		
		/*
		Studente arrayDiStudenti[] = new Studente[100];
		arrayDiStudenti[0] = s1;
		arrayDiStudenti[1] = s2;
		arrayDiStudenti[2] = s3;
		*/
		
		// Analogamente, per la stampa, parallelismo con array di interi
		
		System.out.println("Stampo l'array di interi");
		for(int i=0; i<arrayDiInteri.length; i++) {
			int temp = arrayDiInteri[i];
			System.out.println(temp);
		}
		
		System.out.println("Stampo l'array di studenti");
		for(int j=0; j<arrayDiStudenti.length;j++) {
			Studente temp = arrayDiStudenti[j];
			System.out.println( temp.matricola +" "+temp.cognome+" "+temp.nome);
		}

	}

}






