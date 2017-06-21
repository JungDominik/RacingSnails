import java.math.*;

public class Rennschnecke {
//Attribute	
	private String name;
	private String rasse;
	private double max_speed;
	private double strecke_gelaufen;
	
//Konstruktoren
	public Rennschnecke() {
		this.name = "";
		this.rasse = "";
		this.max_speed = 10;
		this.strecke_gelaufen = 0;
	}
	
	public Rennschnecke(String name_in) {
		this.name = name_in;
		this.rasse = "";
		this.max_speed = 10;
		this.strecke_gelaufen = 0;
	}
	
	public Rennschnecke (String name_in, String rasse_in, double speed_in, double strecke_in){
		this.name = name_in;
		this.rasse = rasse_in;
		this.max_speed = speed_in;
		this.strecke_gelaufen = strecke_in;
	}
	//Getter-Methoden
	public String getName() {
		return this.name;
	}
	
	public double getStrecke() {
		return this.strecke_gelaufen;
	}
	
	
	
	//Verhaltensmethoden
	public String toString() {
		String returnstring = "toString der Schnecke " + (String)(this.name) + " --- Rasse: " + (String)(this.rasse) + " - maxSpeed: " + String.valueOf(this.max_speed) +" -  gelaufene Strecke: " + String.valueOf(this.strecke_gelaufen);
		return returnstring;
		
	}
	
	public void krieche(){
		this.strecke_gelaufen = this.strecke_gelaufen + (this.max_speed * 1 * Math.random() );
		System.out.println("Schnecke " + this.name + ": Bin soweit gekommen: " + this.strecke_gelaufen);
	}

	public static void main(String[] args) {
		Rennschnecke bspschnecke = new Rennschnecke ("Horst", "Scheckers", 33, 0 );
		System.out.println("Testzahl ist" + Math.random());
		bspschnecke.krieche();
		bspschnecke.krieche();
		bspschnecke.krieche();
		System.out.println("tostring der Schnecke: " + bspschnecke.toString());
	}

}