package exceptions;

public class Automobile implements Comparable {

	private String targa;
	private String marca;
	private String modello;
	private int cilindrata;
	
	public Automobile(String targa, String marca, String modello, int cilindrata) {
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public String toString() {
		return targa+" "+marca+" "+modello+" "+cilindrata+"";
	}

	public boolean equals(Object obj) {

		Automobile altra = (Automobile) obj;

		if(targa.compareTo(altra.targa)==0)
			return true;
		else 
			return false;
		
	}
	
	public int compareTo(Object obj) {
		
		Automobile altra = (Automobile) obj;

		return this.targa.compareTo(altra.targa);
		
	}
	
}



