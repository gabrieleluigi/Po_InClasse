package exceptions;

public class Conteggio {

	public static void main(String[] args) throws StringaCheNonVaBeneException {

		// Programma che somma un certo numero di valori
		// numerici memorizzati in altrettante stringhe
		
		// Convertire una stringa nell'intero corrispondente

		// String s = "123";
		
		// Il codice che segue funziona se la stringa contiene un intero...
		
		// ... se pero' contiene caratteri diversi NumberFormatException
		
		/* String s ="ABCD";
		
		int i = Integer.parseInt(s);
		
		System.out.println(i);*/

		String numeri[] = {"1","2","5","trentaquattro","16","9"}; //34
		
		// Posso scegliere di mettere il blocco try-catch intorno a tutto 
		// il codice funzionale (approccio di tipo "tutto o niente") oppure 
		// intorno alle istruzioni "critiche" che so in anticipo possono 
		// scatenare eccezioni (approccio di tipo "ignoro gli errori puntuali", o
		// "chirurgico")

		/*try {
			int somma = 0;
			for(String s : numeri) {
				int i = Integer.parseInt(s);
				somma = somma + i;
			}
			System.out.println(somma);
		}
		catch(NumberFormatException e) {
			System.out.println("Guarda che si è verificata una eccezione!!!");
		}*/
		
		int somma = 0;
		for(String s : numeri) {
			int i=0;
			try {
				i = Integer.parseInt(s);
			}
			catch(NumberFormatException e) {
				// In caso di anomalie nel blocco try, viene eseguito il codice 
				// nel blocco catch: questo codice puo' essere utilizzato per 
				// gestire l'anomalia, oppure limitarsi a stampare un messaggio d'errore

				System.out.println("Si è verificata una eccezione!!!");
				
				// E' anche possibile scatenare una nuova eccezione (es. definita dal programmatore)
				
				// throw new StringaCheNonVaBeneException();
			}
			
			somma = somma + i;
		}
		System.out.println(somma);
		
	}

}









