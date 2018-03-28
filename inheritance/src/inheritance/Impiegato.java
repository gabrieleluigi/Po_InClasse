package inheritance;

public class Impiegato {
	String nome;
	double paga;
	
	public Impiegato(String nome, double paga) {
		this.nome = nome;
		this.paga = paga;
	}
	
	public String toString() {
		return nome+" "+paga;
	}
	
	public void incrementaPaga() {
		paga = paga + 1000;
	}
	
}
