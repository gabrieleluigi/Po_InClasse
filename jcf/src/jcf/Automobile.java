package jcf;

//Ogni volta che voglio rendere una classe confrontabile
//in modo tale da poterla utilizzare in un algoritmo di ordinamento
//devo implementare l'interfaccia Comparable ...

//... ma non basta scrivere implements Comparable, bisogna anche
//fornire un'implementazione del metodo in essa definito, compareTo()


public class Automobile implements Comparable {

	private String targa;
	private String marca;
	private String modello;
	private int cilindrata;
	
	// Creo il costruttore con il wizard di Eclipse
	
	public Automobile(String targa, String marca, String modello, int cilindrata) {
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
	}

	// Creo i metodi getter/setter con il wizard di Eclipse
	
	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public String toString() {
		return targa+" "+marca+" "+modello+" "+cilindrata+"";
	}

                          // Mai cambiarne il tipo del param., altrimenti non sara' override
	public boolean equals(Object obj) {

		// Prima cosa, mi creo una variabile temporanea di tipo Automobile
		// e ci copio dentro obj

		Automobile altra = (Automobile) obj; // Down casting, io so che sara' un'Automobile

		// Come confronto le automobili? 
		
		// Decido (e scrivo) io l'algoritmo
		
		// Nel caso in cui, per me, due automobili siano da considerarsi uguali 
		// se hanno la stessa targa, l'algoritmo di confronto sarà ...
		
		if(targa.compareTo(altra.targa)==0)
			return true;
		else 
			return false;
		
	}
	
	// Questo e' il metodo di cui devo fornire una implementazione
	// per rendere l'oggetto/la classe Automobile confrontabile (ordinabile)
	
	// <0 se this "precede" o
	// == 0 se this "e' uguale" ad o
	// >0 se this "segue" o

	public int compareTo(Object obj) {
		
		// Sta a me definire l'algortimo di confronto, come per equals()
		
		Automobile altra = (Automobile) obj;
		
		// Ordinamento per cilindrata
		//return -(this.cilindrata-altra.cilindrata);
		
		// Ordinamento per targa
		return this.targa.compareTo(altra.targa);

		// Eventualmente algortimi di ordinamento piu' sofisticati
		// che considerino contemporaneamente (insieme) più attributi 
		// della classe Automobile

	}
	
	
}



