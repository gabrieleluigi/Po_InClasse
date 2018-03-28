package collezioni;

public class CollezioneArray extends Collezione {

	// Una possibile implementazione della collezione, con una
	// struttura dati di tipo array di Object (generico)
	
	// Rispetto a Collezione, la classe CollezioneArray
	//  aggiunge l'array
	//  eredita tutti i metodi di Collezione
	//  e li modifica (in override), fornendone una implementazione adatta per l'array
	
	Object array[]; // Dichiaro la struttura dati
	int num;
	
	public CollezioneArray() {
		array = new Object[300]; // Dimensione fissa !!!
		num=0;
	}

	// In override rispetto alla definizione piu' generale di aggiungi() 
	// fornita nella classe padre Collezione, ora che so come è fatta
	// la struttura dati (un array, in questo caso) posso definire il corpo
	
	public void aggiungi(Object daAggiungere) {
		for(int i=0;i<array.length;i++)
			if(array[i]==null) { // cella a null, è ancora vuota
				array[i]=daAggiungere;
				num++;
				break; // return;
			}	
	}

	// In override rispetto al metodo di Collezione

	public String descriviti() {
		String risultato = "";
		for(int i=0;i<array.length;i++)
			if(array[i]!=null) // Non è vuota
				risultato += array[i].toString()+"\n"; // .toString();
		return risultato;
	}

	// In override rispetto al metodo di Collezione

	public int dimensione() {
		return num;
	}

	// In override rispetto al metodo di Collezione

	public boolean contiene(Object daCercare) {
		for(int i=0;i<num;i++)
			if(array[i].equals(daCercare)  ) // MAI CONFRONTARE DUE OGGETTI CON ==
				return true; // Appena trovo un match, esco restituendo true
		return false;
	}
	
	
	
}
