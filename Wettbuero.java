import java.util.*;

//Macht folgendes
//a) Setzt Rennen auf
//b) Nimmt Wetten an
//c) Führt Rennen aus

public class Wettbuero {

	Rennen rennen_heute;
	public List <Wette> wetten_angenommen = new ArrayList<Wette>();
	public static final int WETTFAKTOR = 3;


	//Methoden
	public Wette wetteAnnehmen (String in_schneckenName, String in_spieler, int in_wettEinsatz) {
			Wette neueWette = new Wette(in_schneckenName, in_spieler, in_wettEinsatz);
			return neueWette;
	}

	public String toString() {
		String returnstring = "Rennen toString: " + rennen_heute.toString();
		for (Wette wettegrade : wetten_angenommen) {
			returnstring = returnstring + "Naechste Wette - toString: " + wettegrade.toString();
		}
		
		return returnstring;
	}
	
	public Rennen rennenSetup(){
		Rennen rennengrade = new Rennen();
		return rennengrade;
	}
	
	public ArrayList<Wette> wettenSetup(int zahlWetter) {
		ArrayList<Wette> returnlist = new ArrayList<Wette>();
		
		for (int i = 0; i< zahlWetter; i++)
			{Wette wettegrad = wetteAnnehmen("test","test",3);
			returnlist.add(wettegrad);
				}
		return returnlist;
	}
	
	public void rennenDurchfuehren() {
		rennen_heute = this.rennenSetup();
		wetten_angenommen = wettenSetup(rennen_heute.anzahl_teilnehmer);
		rennen_heute.durchfuehren();

	}
}	



