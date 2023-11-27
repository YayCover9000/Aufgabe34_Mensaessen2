import java.util.Scanner;
public class Aufgabe34_Mensaessen2 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int eingabe = sc.nextInt();
		String ausgabe = null;
		if(eingabe > 4 || eingabe < 1) {
			System.out.println("Essensangebot-Nr. "+eingabe+" gibt es leider in der Mensa nicht.");
		} else {
			ausgabe = Mensaessen_berechnen(eingabe);
		}
		if(ausgabe != null ) {
			System.out.println("Auswahl: " + ausgabe);
		}
	}
	private static String Mensaessen_berechnen(int eingabe) {
		String[] array = {"Tomatensuppe","Apfelmusslosbrudi","Marzipantorte","Karottenpudding"};
		String ausgabe = null;
		switch(eingabe) {
		case 1 -> ausgabe = array[0];
		case 2 -> ausgabe = array[1];
		case 3 -> ausgabe = array[2];
		case 4 -> ausgabe = array[3];
		
		}
		return ausgabe;
	}
}
