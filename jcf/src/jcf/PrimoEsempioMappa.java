package jcf;
import java.util.*;

public class PrimoEsempioMappa {

	public static void main(String[] args) {
		
		// Vantaggio della TreeMap rispetto a HashMap, è ordinata per chiave
		
		    // Parametrizzazione, due tipi < , > per chiavi e valori
		Map<String, Automobile> m = new TreeMap<String, Automobile>();
		//HashMap m = new HashMap();
		//TreeMap m = new TreeMap();
		
		m.put("AB123CD", new Automobile("AB123CD","Alfa","147",1900));
		m.put("CD567VG", new Automobile("CD567VG","Fiat","Panda",1000));
		m.put("BB000BB", new Automobile("BB000BB","Banda","Bassotti",666));
		
		System.out.println("Numero di automobili: "+m.size());
		
		// Ricerca / verifica presenza per chiave è facilitata
		
		if(m.containsKey("AB123CD"))
			System.out.println("Auto presente");
		else
			System.out.println("Auto assente");

		// Per stampare un elenco di automobili ...
		
		//System.out.println("Elenco automobili: \n"+m.toString());
		
		// ... occorre accedere alla colonna che contiene i valori tramite
		// il metodo values(), che restituisce una Collection di oggetti Automobile
		
		// La Collection può essere scandita con un for-each ...
		
		for(Automobile a : m.values())
			System.out.println(a);
		
		// ... oppure con un for (ma devo prima ottenere una lista per
		// poter accedere agli elementi per indice)
		
		/*Collection<Automobile> c = m.values();
		
		LinkedList<Automobile> l = new LinkedList<Automobile>( c );
		
		for(int i=0;i<l.size();i++) {
			Automobile a = l.get(i);
			System.out.println(a);
		}*/
		
	}

}
