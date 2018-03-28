package exceptions;

public class EsempioEccezioni {

	public static void main(String[] args) {

		// Provo a generare diversi tipi di eccezioni...
		
		String array[] = new String[3];
		array[0] = "abc";
		array[1] = "def";
		
		// Cerco, ad esempio, di scatenare una eccezione di tipo 
		// ArrayIndexOutOfBoundsException leggendo al di fuori dell'array

		// Altro esempio di eccezione, di tipo NullPointerException, 
		// invocando un metodo, es. toString(), su un riferimento (cella) a null
		
		// Si tratta di situazioni "prevedibili", che posso evitare, ad esempio,
		// con un if (se non verificassi, eccezione), ma questo e' l'approccio "boring"

		for(int i=0;i<4;i++) //array.length
			if(array[i]!=null)
			System.out.println(array[i]); // toString()

		// Usando le eccezioni, invece
		
		try{
			// Istruzioni che rappresentano il codice funzionale nel blocco try
			for (int i=0;i<4; i++)
				System.out.println(array[i].toString());  
		}
		catch( NullPointerException npe ){
			// Nel blocco catch, invece, codice per la gestione dell'anomalia
			System.out.println("Eccezione!"); // Posso scegliere se informare o meno l'utente
		}
		
		// Ancora, eccezione di tipo NumberFormatException
		
		String numero ="tredici"; // 13
		int i = Integer.parseInt(numero);


	}

}
