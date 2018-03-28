package javabase;

public class ControlStatements {

	public static void main(String[] args) {

		// Condizioni, in Java (espressioni, valutate come true/false)
		// Ad esempio, in C si poteva scrivere if(i)
		// In Java deve essere invece if (i!=0), usando uno o piu' operatori
		// Quali operatori?
		//  aritmetici
		//  relazionali
		//  bit a bit
		//  assegnamento, =, +=, ecc., diverso da ==
		//  incremento
		//  logici
		
		int x = 5;

		// Con o senza {}, in base al numero di istruzioni nel blocco 
		// (se una sola, anche senza {}, come nel C)
		
		if(x>5) {
			System.out.println("La variabile è maggiore di 5");
			// Qui si potrebbero annidare altri costrutti if-else
		} 
		else if(x<5)
			System.out.println("La variabile è minore di 5");
		else
			System.out.println("La variabile è uguale a 5");

		// Intervallo > 10 E < 20
			
		int y=0;
		if( (y>5) && (y<10) ) // Prima op. relazionali, poi logici, attenzione alla precedenza
                              // tra gli operatori, nel dubbio usare altre ( )
			System.out.println("La variabile è maggiore di 5 e minore di 10");
		else 
			System.out.println("La variabile è fuori dall'intervallo indicato");
		
		// Costanti, in Java definite mediante final, tipo e nome (oltre a valore)
		
		// Forte orientamento alla tipizzazione, diversamente dal C, solo nome (e valore)
		// come una variabile, ma il valore non potra' piu' essere modificato
		
		final double PI_GRECO = 3.14;

		// Impossibile assegnare un valore ad una costante (Eclise segnala errore)		
		
		// PI_GRECO = 6.28; // Non permesso
		
		final String GIORNO = "Mercoledi";
		
		int intero = 5;
		
		double reale = intero;
		
		// (Type) cast/casting
		
		reale = 6.8;
		
		System.out.println(reale);
		
		intero = (int)reale; // Il contenuto della variabile "reale" viene 
                             // temporaneamente considarata come "intero"
		                     // (la parte frazionaria e' stata temp. buttata via)		


		System.out.println(reale);

		// Passaggio di parametri, sempre per copia (parametri attuali copiati
		// nei parametri formali), Java controlla la corrispondenza dei tipi
		// (in caso di più funzioni/metodi con lo stesso nome (firme diverse), 
		// sceglie la versione idonea in base al contesto / in base ai parametri)
		
        // Si puo' passare un valore, una costante, una variabile, un'espressione, ecc.			

		// stampa(7);
		// stampa("Sette"); 
		
		Studente s = new Studente(12345, "Mary","Red");
		
		// Nell'istruzione che segue si e' passato il riferimento, sempre per copia (quindi 
		// qualcosa di simile ad un puntatore del C, ma in maniera nascosta)

		stampa(s); 

	}

	//static public void stampa(int param) { 
	//static public void stampa(String param) { 
	static public void stampa(Studente param) { 

		// In caso di riferimenti, se per stampare se si usa l'istruzione 
		// seguente viene stampato lo UID dell'oggetto indentificato dal rif.

		System.out.println("Il parametro vale: "+param);
		
		// E' necessario accedere al contenuto dell'oggetto (attributi)
		
		// Accesso un attributo alla volta?
		
		/*System.out.println(param.matricola);
		System.out.println(param.nome);
		System.out.println(param.cognome);*/
		
		// Molto meglio utilizzare il principio di delega
		
		// Chi meglio dell'oggetto studente sa stamparsi?
	}

}
