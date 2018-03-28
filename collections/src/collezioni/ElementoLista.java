package collezioni;

public class ElementoLista {

	// Ogni elemento della lista possiede due attributi
	//  valore: che "contiene", "ospita" il valore da memorizzare, generico
	//  prossimo: "puntatore" (riferimento) all'elemento successivo della lista

	// Potrei / dovrei (regola d'oro) definirli private ...
	
	Object valore; // Sufficientemente generico
	ElementoLista prossimo; // Sempre di tipo ElementoLista

	public ElementoLista(Object valore) {
		this.valore=valore;
		prossimo = null;
	}
	
	// ... definendo poi i necesasri metodi getter / setter
}
