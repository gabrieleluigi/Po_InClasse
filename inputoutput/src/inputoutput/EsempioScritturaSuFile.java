package inputoutput;

import java.io.*;

public class EsempioScritturaSuFile {

	public static void main(String[] args) {

		try {
			
			FileWriter w = new FileWriter("output.txt");

			w.write("La mia prima stringa\nscritta su file!"); // Per andare a capo o altro, car. speciali come \n
			
			w.flush(); // Forza la scrittura su file prima della chiusura dello stesso
			
			w.close();
		
		} catch (Exception e) { // IOException
			System.out.println("Eccezione");
		} 
		
		
	}

}
