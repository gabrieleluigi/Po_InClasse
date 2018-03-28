package vectors;

public class Vector {

	protected int array[];
	private final static int DIM = 20;
	protected int num;
	
	public Vector() {
		array = new int[DIM];
		num = 0;
	}
	
	// Un commento in formato JavaDoc
	
	/**
	 * Questo metodo permette di aggiungere un valore alla struttura dati
	 * @value Questo è il valore da aggiungere
	 */
	
	public void add(int value) {      // Con un metodo add() per aggiungere il valore 
		if(num >= DIM)				 // 1) evito l'accesso diretto (delega, limit. dipendenze, no spaghetti code)
			return; 					 // 2) posso aggiungere istruzioni, es. per controllo errori
		array[num] = value;
		num++;
	}
	
	/**
	 * Questo è il metodo di stampa
	 */
	
	public void print() {
		for(int i=0;i<num;i++)
			System.out.print(array[i]+" ");
	}
	
	
	
	
	
}
