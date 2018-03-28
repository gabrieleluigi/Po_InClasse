package javabase;

public class Studente {
	
	int matricola;
	String nome;
	String cognome;
	
	/*public Studente() {
		matricola = 0;
		nome = "";
		cognome = "";
	}*/
	
	// Per creare il costruttore si puo' utilizzare il wizard di Eclipse 
	
	public Studente(int matricola, String nome, String cognome) {
		//this. mi permette di fare riferimento agli attributi della classe
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
	}
	
	
}
