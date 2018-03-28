package collezioni;

public class CollezioneLista extends Collezione{

	// Altra implementazione, basata su una struttura dati di tipo lista (linkata)

	int num = 0;
	ElementoLista testa = null; // Inizialmente lista vuota, testa a null
	
	public void aggiungi(Object daAggiungere) {
		// 1) Devo creare il nuovo ElementoLista da inserire nella lista
		//    scrivendogli "nella pancia" il valore passato come parametro
		
		ElementoLista e = new ElementoLista(daAggiungere);
		
		// 2) Effettuo un inserimento in testa alla lista
		
		e.prossimo = testa; // Successore del nuovo elemento posto uguale a quanto attualmente "puntato" dala testa
		testa = e; // Testa fatta puntare al nuovo elemento 
		
		num++;

	}
	
	public String descriviti() {

		String risultato = "";

		// Scandisco tutti gli elementi a partire dalla testa, concatenando in risultato

		ElementoLista corrente = testa; // Elemento corrente, posto uguale alla testa
		while(corrente!=null) {
			risultato += corrente.valore.toString()+"\n"; // Stampo "la pancia" dell'elemento corrente
			corrente = corrente.prossimo; // Mi sposto sull'elemento seguente
		}
		
		return risultato;
		
	}
	
	public int dimensione() {
		return num;
	}
	
	// Potrei anche andare a ridefinire il metodo contiene() se mi serve

	public boolean contiene(Object daCercare) {
		// Aggiungere tutto il codice necessario ...
		return false;
	}
}
