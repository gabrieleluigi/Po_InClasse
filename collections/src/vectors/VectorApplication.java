package vectors;

public class VectorApplication {

	public static void main(String[] args) {

		// Vector v = new Vector();
		   
		// OrderedVector ov = new OrderedVector();		

		Vector v = new OrderedVector(); 	// Variabile riferimento di tipo piu' generale
        								   	// per memorizz. oggetto piu' specifico
		
                   						// A run time Java capira' che l'oggetto e' di tipo
                  						// OrderedVector e chiamera' l'implementazione piu'
                    						// specifica di add() (che in questo caso esiste)
        									// effettuando un inserimento in ordine
		
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(250);
		
		v.print();
	}

}
