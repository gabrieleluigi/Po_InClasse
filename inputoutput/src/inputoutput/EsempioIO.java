package inputoutput;

import java.io.*;

public class EsempioIO {

	public static void main(String[] args) {
		
		// Obiettivo: leggere un file di testo carattere per 
		// carattere, e stamparlo nella console

		// Reader r = new Reader();
		
		try {
			
			// Checked exception, Eclipse mi obbliga a mettere try-catch o throws

			FileReader r = new FileReader("input.txt");
			
			// Qui posso lavorare sul file, ad esempio leggere carattere 
			// per carattere nella variabile carattere, stampandola
			
			// Oppure con un ciclo

			int c; // char
			while ( (c = r.read()) != -1) // read() restituisce -1 quando non ci sono piu' caratteri
				System.out.print((char)c);

			r.close(); // Sempre opportuno

		}
		catch(IOException e) { // FileNotFoundException fne
			// Gestisco le altre eccezioni (approccio "tutto o niente")
			
			System.out.println("Eccezione di I/O generica");
		}
		

	}

}
