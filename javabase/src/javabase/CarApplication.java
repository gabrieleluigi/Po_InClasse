package javabase;

public class CarApplication {

	public static void main(String[] args) {

		// Se voglio utilizzare la classe Car devo, in un'altra
		// classe (es. questa), creare degli oggetti
		
		// Potrei inizializzare i diversi attributi dell'oggetto dopo averlo creato
		
		/*
		Car c1 = new Car(); // Il costruttore di default viene
		                    // "aggiunto" automaticamente da Java
		                    // se non ci sono altri costruttori
		
		c1.brand="Ferrari";
		c1.color="Red";
		c1.turnedOn=false;
		*/
		
		// Oppure utilizzare un costruttore con gli opportuni parametri

		Car c1 = new Car("Ferrari","Red",false);
		    c1 = new Car();
		    c1 = new Car("Ferrari","Red"); 

		// DYNAMIC BINDING, Java sceglie la versione "corretta" del costruttore
        // in base ai parametri passati
		    
		// Poi posso stampare l'oggetto, accedendo ai singoli attributi 

		// Se gli attributi non sono visibili (private), occorre usare metodi pubblici, es. getter 
		    
		/*
		System.out.println("Car c1");
		System.out.println("Brand: "+c1.readBrand());
		System.out.println("Color: "+c1.readColor());
		System.out.println("TurnedOn: "+c1.readTurnedOn());
		*/
		
		// Meglio ancora, utilizzando la DELEGA, attraverso opportuni metodi che l'oggetto mette
		// a disposizione, chi meglio della Car sa stamparsi/descriversi sotto forma di String?
		
		System.out.println(c1.descriviti());
		
		Car c2 = new Car("Fiat","White",false);
		
		System.out.println(c2.descriviti());
		
		// Cosa succede se scrivo? 
		
		c2 = c1; // ALIASING, ora il primo oggetto Car creato ha due nomi, due modi 
		         // per farvi riferimento. Il secondo, pero', non e' piu' raggiungibile, la 
		         // memoria verra' liberata dalla Garbage Collection
		
		// Confronto tra oggetti, mai attraverso == (anche se, per comodita', su String funziona comunque)
		
		if( c1 == c2 ){ // == confronta gli UID nella "scatolina", non il contenuto 
			            // dei due oggetti/istanze nella "scatolona"
		}
		
	}

}



