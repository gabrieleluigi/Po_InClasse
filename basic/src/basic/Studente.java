package basic;

public class Studente {

	// Stesse informazioni della struct del C, ma con approccio OOP
	
	// DATI (ATTRIBUTI), IN GENERE PRIVATI
	int matricola; // La regola d'oro direbbe private 
	String nome;
	String cognome;
	private boolean laureato;
	
	// OPERAZIONI SUI DATI (METODI), IN GENERE PUBBLICI
	
	// Ogni classe Java viene automaticamente dotata di un costruttore 
	// chiamato "di default", senza parametri, pensato (come tutti i 
	// costruttori) per costruire l'oggetto ed inizializzarlo (anche se non
	// si vede, e' come se ci fosse)
	
	// ENCAPSULATION (INFORMATION HIDING)

	public Studente() { // Valore di ritorno implicito, crea uno Studente
		matricola=-1; // Esempio di inizializzazione
		nome = "";
		cognome = "";		
		laureato = false; // Forzo un'inizializzazione specifica, tutti non laureati all'inizio
	} // Fine del costruttore
	
	// Metodo (pubblico) che imposta l'attributo laureato (privato) a true
	
	public void siLaurea() {
		// Eventualmente, tante altre operazioni da eseguire quando lo studente si deve laureare
		// ...
		laureato = true;
	}
	
	// Qui si potrebbero aggiungere altri metodi (non necessariamente tutti 
	// pubblici, es. se non devono essere acceduti dal di fuori della classe)
	
	public boolean dimmiSeSeiLaureato() {
		return laureato;
	}
	
} 
// Per poter utilizzare la classe definita, occorre crearne delle istanze
// (oggetti), ma non qui, in un'altra classe (nel caso specifico, nel file Classi, 
// dove c'e' il main, applicazione)




