  package collezioni;

public class Impiegato {

	String nome;
	double paga;
	
	public Impiegato(String nome, double paga) {
		this.nome=nome;
		this.paga=paga;
	}
	
	// Se voglio che il mio oggetto si "stampi" (delega) vado a 
	// ridefinire il metodo toString() di Object
	
	public String toString() {
		return nome+" "+paga;
	}

	// Se voglio confrontare due oggetti in maniera diversa da 
	// == devo andare a ridefinire nella classe che descrive l'oggetto
	// il metodo "standard" per il confronto ereditato da Object, 
	// ovvero equals()
	
	public boolean equals(Object obj) {

		// Devo scrivere il mio algoritmo di confronto

		Impiegato altro = (Impiegato) obj;
		
		// Se per me due oggetti Impiegato sono uguali se stesso nome e paga
		
		if(altro.nome.compareTo(nome)==0 && altro.paga == paga)
			return true; // Uguali
		else
			return false;	
	}
	
	
}
