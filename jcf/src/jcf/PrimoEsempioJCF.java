package jcf;

import java.util.*; // Per importare classi/int. del JCF

public class PrimoEsempioJCF {

	public static void main(String[] args) {

		// Non è possibile istanziare l'interfaccia Collection
		
		//Collection c = new Collection();
		
		// Ma, posso usare una Collection come variabile riferimento
		// all'interno della quale memorizzare un oggetto (classe) che
		// implementi quella interfaccia (oppure List, ecc.)

		// Le interfacce/classi del Java Collection Framework sono "raw",
		// posso (forse, dovrei) "parametrizzarle" indicando dopo il nome 
		// di ciascuna occorrenza dell'interfaccia/classe, tra <>, il tipo
		// di dato che intendero' memorizzare all'interno della struttura dati
		
		Collection<Automobile> c = new ArrayList<Automobile>(); // Posso farlo
		
		// Nella collezione posso memorizzare oggetti di tipo diverso...
		// ... ma, oggetti !!! Quindi, per mem. un int occorre usare il tipo wrapper Integer

		// Integer i = new Integer(45);
		// lista.add(i);
		
		// Anche studenti, ecc., eventualmente parametrizzando con <> (buona norma)
		
		
		Automobile a1 = new Automobile("XX567AB","Ferrari","GT",4000);
		c.add(a1);

		// Anche senza definire prima la variabile riferimento

		c.add(new Automobile("FF123AB","Audi","A4",2000)); // Oggetti "anonimi"
		c.add(new Automobile("FB234CC","Opel","Astra",1700));

		// Il metodo size() restituisce la dimensione effettiva (num. di el. memorizzati)

		int dimensione = c.size(); 
		
		System.out.println("Numero di auto: "+dimensione);

		// Posso stampare il contenuto usando toString(), formato [ , , ]

		System.out.println("Elenco automobili:");
		System.out.println(c.toString());
		
		// Posso anche cercare un particolare elemento
		
		System.out.println("Cerco l'automobile con targa FF123AB");
		if(c.contains(new Automobile("FF123AB","Audi!!!!!","A8",8000)))
			System.out.println(" Trovata");
		else
			System.out.println(" Non trovata");
		
		// L'interfaccia Collection mette a disposizione il metodo add()

		// Con l'interfaccia collection si ha la possibilità di inserire in pos. 

		ArrayList<Automobile> l = (ArrayList<Automobile>) c;
		
		// Proviamo ad inserire un elemento in posizione 0
		
		l.set(0,new Automobile("BB000BB","Bat","Mobile",100000));
		
		// Per una stampa personalizzata si può scandire la collezione (lista) 
		// un elemento alla volta, con un ciclo for ...
		
		System.out.println("Proviamo a stampare con il costrutto for");

		for(int i=0;i<l.size();i++) {
			Automobile a = l.get(i); // Prendo l'automobile nella pos. i
			System.out.println("Riga "+i+": "+a); // a.toString();
		}
		
		// ... oppure con il costrutto for-each ...
		
		System.out.println("Proviamo a stampare con il costrutto for-each");
		
		for(Automobile a : l) // Per ogni Automobile a appartenente alla collezione l
			System.out.println(a); // Qui nel ciclo posso usare la var. riferimento a
		
		// ... oppure ancora con un interatore
		
		System.out.println("Proviamo infine con un iteratore");
		
		Iterator<Automobile> it = l.iterator(); // Ottengo un iteratore sulla lista l
		
		do {
			Automobile a = it.next(); // L'iteratore creato si trova prima del primo elemento della collezione
			System.out.println(a);    // ... lo sposto in avanti utilizzando next()
		} while(it.hasNext()); // ... fino a quando mi dice che ci sono ancora elementi dopo di lui
		
	}

}

