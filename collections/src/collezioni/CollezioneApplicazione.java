package collezioni;

public class CollezioneApplicazione {

	public static void main(String[] args) {
		
		// Collezione c = new Collezione();

		// CollezioneArray c = new CollezioneArray();
		
		// Corretto anche
		
		Collezione c = new CollezioneArray(); // new CollezioneLista();
		
		// Proviamo ad inserire degli oggetti String
		
		System.out.println("*** Oggetti String ***");
		
		c.aggiungi("abcd"); // anche new String("abcd") 
		c.aggiungi("efgh");
		c.aggiungi("ijkl");

		System.out.println("Dimensione: "+c.dimensione());
		
		System.out.println("\nContenuto:\n"+c.descriviti());
		
		System.out.println("Cerco efgh:");
		if(c.contiene("efgh"))
			System.out.println(" Trovato");
		else
			System.out.println(" Non trovato");

		// Proviamo ad utilizzare le stesse strutture dati
		// per gestire una collezione di oggetti Impiegato
		
		System.out.println("\n*** Oggetti Impiegato ***");
		
		c.aggiungi(new Impiegato("M.Rossi", 10000)); 
		c.aggiungi(new Impiegato("G.Verdi",20000));
		c.aggiungi(new Impiegato("L.Azzurri",30000));

		System.out.println("Dimensione: "+c.dimensione());
		
		System.out.println("\nContenuto:\n"+c.descriviti());
		
		System.out.println("Cerco G.Verdi:");
		if(c.contiene(new Impiegato("G.Verdi", 800000)))
			System.out.println(" Trovato");
		else
			System.out.println(" Non trovato");
		
	}

}
