import java.util.*;

//Verwaltet das Rennen und die Schnecken darin

public class Rennen {

	String name;
	int anzahl_teilnehmer;
	List<Rennschnecke> teilnehmer = new ArrayList<Rennschnecke>();
	int streckenlaenge;
	
	
	
	
	//Konstruktoren
	public Rennen(){
		Scanner konstruktorscanner = new Scanner(System.in);
		System.out.println("Bitte Rennnamen eingeben");
		name = konstruktorscanner.next();
		System.out.println("Bitte Anzahl Teilnehmer eingeben");
		anzahl_teilnehmer = Integer.valueOf(konstruktorscanner.next());
		System.out.println("Bitte Streckenlaenge eingeben");
		streckenlaenge = Integer.valueOf(konstruktorscanner.next()) ;
		
		for (int i=0; i<anzahl_teilnehmer; i++) {
			System.out.println("Teilnehmer no. " + (i+1) +" : Bitte Schneckennamen eingeben");
			String schneckenname = konstruktorscanner.next();
			Rennschnecke schneckers = new Rennschnecke(schneckenname);
			teilnehmer.add(schneckers);
		}
		
		//Zum Testen
		//System.out.println("Rennen fertig gebaut, hier ist die toString");
		//System.out.println(toString());
		
		
	}
	
	public Rennen(String name_in, int anzahl_in, int laenge_in) {
		name = name_in;
		anzahl_teilnehmer = anzahl_in;
		streckenlaenge = laenge_in;
	}
	
	
	//Methoden
	public void addSchnecke(Rennschnecke neueSchnecke){
		teilnehmer.add(neueSchnecke);
	}
	public void entferneSchnecke(Rennschnecke zuEntfernen) {
		teilnehmer.remove(zuEntfernen);
	}
	
	public String toString() {
		String returnstring = "Rennen: " + this.name + " ---Teilnehmerzahl: "  + (String.valueOf(this.anzahl_teilnehmer) + " --- Streckenlaenge:" + String.valueOf(this.streckenlaenge) + "Teilnehmerliste: "); 
		for (Rennschnecke schnecke : this.teilnehmer) {
			returnstring = returnstring + schnecke.toString();
		}
		return returnstring;
	}
	
	public Rennschnecke ermittleGewinner(){
		Rennschnecke schneckenkopie = new Rennschnecke();
		for (Rennschnecke schneckegrade: this.teilnehmer) {
			if (schneckegrade.getStrecke()> schneckenkopie.getStrecke()) {
				schneckenkopie = schneckegrade;
			}
		}
		if (schneckenkopie.getStrecke() < this.streckenlaenge) {
			return null;
		}
		else return schneckenkopie;
	}
	
	public void lasseKriechen(){
		for (Rennschnecke schneckegrade : teilnehmer) {
			schneckegrade.krieche();
		}
	}
	

	
	public void durchfuehren() {
		System.out.println("OK - Vorbereitungen sind abgeschlossen. Alle auf die Plaetze! Bitte [Enter] druecken um loszulegen!");
		Scanner durchfuehrscanner = new Scanner(System.in);
		durchfuehrscanner.next();
		System.out.println("Wir fangen an! \n");
		int i = 1;
		while (this.ermittleGewinner() == null) {
			System.out.println("Runde Nummer " + i +" - Wie weit kommt ihr, Schnecken?");
			lasseKriechen();
			System.out.println("Runde beendet! \n");
			i++;
		}
		System.out.println("\n\nRennen beeendet! Gewinner des Rennens ist Schnecke namens : " + this.ermittleGewinner().getName());
	}
	
	
	// Ausprobieren
//	public static void main (String[] args) {
//		//Testanweisungen
//		Rennen beispielrennen = new Rennen("Beispiel1", 5 , 25);
//		
//		for (int i=0; i<5; i++){
//			Rennschnecke grade = new Rennschnecke( String.valueOf(i));
//			beispielrennen.addSchnecke(grade);
//		}
//		
//		System.out.println ("Hier die toString der 5 Teilnehmer");
//		for (Rennschnecke schnecke: beispielrennen.teilnehmer) {
//			System.out.println(schnecke.toString());
//		}
//}		


	
}


