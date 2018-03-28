package inheritance;

public class Applicazione {

	public static void main(String args[]) {
		
		// Dichiaro alcuni oggetto di classe Impiegato
		
		Impiegato i = new Impiegato("M. Rossi", 25000);
		
		System.out.println("Impiegato i:");
		System.out.println(i.toString());
		
		Impiegato i2 = new Impiegato("A. Verdi", 30000);
		
		System.out.println("Impiegato i2:");
		System.out.println(i2);
		
		// Li inserisco in una struttura dati (array)
		
		Impiegato impiegati[] = new Impiegato[10];
		impiegati[0] = i;
		impiegati[1] = i2;
		
		// Stampo l'array
		
		System.out.println("\nStampo l'array di impiegati:");
		for(int j=0;j<impiegati.length;j++)
			if(impiegati[j]!=null)
				System.out.println(impiegati[j].toString());
		
		System.out.println("\nManager: ");
		Manager m = new Manager("B.Boss",800000,"Contabilita'");
		System.out.println(m.toString());

		// Cosa succede quando si scrive l'istruzione seguente?

		// i = m;

		// Nella variabile i di tipo Impiegato, più generale, viene inserito un 
		// riferimento ad un oggetto di tipo Manager (si può fare, è più specifico, 
		// un Manager è anche "un po' Impiegato", vd. approccio "a cipolla")
		
		// Se invoco il metodo toString() sulla variabile di tipo Impiegato
		// viene invocato il metodo più specifico disponibile, di Manager,
		// se (ri)definito, oppure di Impiegato (ereditato)
		
		// System.out.println("\nStampo l'oggetto i");

		// In questo caso viene stampato un Manager
		
		System.out.println(i.toString()); // Oppure solo i

		// Cosi' come una variabile di tipo piu' generale puo' fare
		// riferimento ad un oggetto piu' specifico, allo stesso modo
		// le celle di un array di tipo piu' generale possono fare riferimento
		// ad oggetti piu' specifici
		
		System.out.println("\nStampo l'array di impiegati e manager");
		
		impiegati[0] = i;
		impiegati[1] = i2;
		impiegati[2] = m;
		
		// Verranno stampati Impiegati e Manager, in base a ciò che si trova
		// effettivamente in quella cella a runtime
		
		for(int j=0;j<impiegati.length;j++)
			if(impiegati[j]!=null)
				System.out.println(impiegati[j].toString());
		
	}
	
}










