
public class Wette {
	
	private String wette_auf;
	private String spieler;
	private int einsatz;

//Konstruktor
	
	public Wette(String in_schneckenname, String in_Spieler, int in_einsatz) {
		this.wette_auf = in_schneckenname;
		this.spieler = in_Spieler;
		this.einsatz = in_einsatz;
	}
	
//Methoden
	public String toString () {
		String returnstring = "Wette auf: " + this.wette_auf +" , von Spieler " + this.spieler + " mit dem Einsatz " + String.valueOf(this.einsatz);
		return returnstring;
	}

}
