package javabase;

public class Car {

	// DATI
	
	// Se si aggiunge private, l'attributo non sara' piu' visibile 
	// (accesso tramite metodi pubblici)
	private String brand;
	private String color;
	private boolean turnedOn; 

	// COSTRUTTORI / OPERAZIONI SUI DAI

	// COSTRUTTORE: "metodo" un po' particolare, stesso nome della classe, nessun valore di ritorno
	//              che si occupa di allocare la memoria per l'oggetto (creare lo "scatolone") ed inizializzarlo

	// Inizializzarlo come?
	 
	// Costruttore di default (vuoto), senza parametri, c'e' e a volte non si vede
	// Puo' essere ridefinito per effettuare le inizializzazioni del caso
	// Qui, inizializzazione con tutte automobili senza colore, senza marca e spente
	
	// Tre costruttori in overloading (stesso nome, firme diverse)

	public Car() {
		this.brand = ""; // Uso di this (questo oggetto) per risolvere casi di omonimia nei nomi dei parametri/attributi
		this.color="";
		this.turnedOn=false;
	}
	
	 // Costruttore pensato per inizializzare ad esempio con parametri. Quali/Quanti parametri?
	 // Quelli che servono, non e' necessario passare parametri per inizializzare tutti gli attributi
	
	public Car(String brand, String color, boolean turnedOn) {
		this.brand = brand;
		this.color = color;
		this.turnedOn = turnedOn;
	}
	
	 // E' pero' consigliabile inizializzare in qualche modo tutti gli attributi
	 
	 // Costruttore in OVERLOADING, stesso nome ma diversi parametri (diversa firma)

	public Car(String brand, String color) {
		this.brand=brand;
		this.color=color;
		this.turnedOn = false;
	}

	public String readBrand() {
		return brand;
	}
	
	public String readColor() {
		return color;
	}
	
	public boolean readTurnedOn() {
		return turnedOn;
	}

	// Delega: l'ooggetto Car si descrive sotto forma di stringa

	// Manutenibilita'/evoluzione del codice piu' semplice (ad esempio, 
	// per gestire un nuovo attributo o correggere un errore nella stampa 
	// sara' sufficiente modificare questo punto del codice)
	
	public String descriviti() { // stampati()
		String s;
		s  = "Brand: "+brand+"\n"; // Può liberamente accedere ai propri attributi, anche se privati
		s += "Color: "+color+"\n";
		s += "TurnedOn: "+turnedOn;
		
		return s;
	}
	
}
