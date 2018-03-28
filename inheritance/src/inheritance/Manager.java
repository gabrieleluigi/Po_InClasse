package inheritance;

public class Manager extends Impiegato { // Manager (più specifica) extends Impiegato (più generica) 

	//String nome; // Sono ereditati dall'Impiegato, non DEVONO essere ridefiniti
	//double paga;
	String unitaAziendale; // AGGIUSTO, attributo SPECIFICO del Manager

	public Manager(String nome, double paga, String unitaAziendale) {
		
		// Secondo l'approccio "a cipolla" per creare un Manager devo
		
		// 1) Prima creare l' "anima" Impiegato del Manager
		
		// ... = new Impiegato(nome, paga); Non posso farlo così

		// Si utilizza super(), invocando così il costruttore della 
	    // classe padre / superclasse / ... , passando i parametri del caso
		
		super(nome, paga); 
		
		// 2) Poi aggiungere quanto di specifico del Manager
		
		this.unitaAziendale = unitaAziendale; // Inizializzo l'attributo 
		
		/*
		this.nome = nome;
		this.paga = paga;
		this.unitaAziendale = unitaAziendale;
		*/
	}
	
	// La classe derivata puo' anche AGGIUNGERE nuovi metodi
	
	
	
	// Oppure RIDEFINIRE metodi ereditati da Impiegato
	public String toString() {
		return nome + " "+ paga +" "+ unitaAziendale;
	}
	
	
}




