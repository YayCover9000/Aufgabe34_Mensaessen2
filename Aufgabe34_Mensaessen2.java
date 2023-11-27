import java.util.Scanner;
public class Aufgabe34_Mensaessen2 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int eingabe = sc.nextInt();
		String ausgabe = null;
		if(eingabe > 4 || eingabe < 1) {
			System.out.println("auswahl nur zwichen 1 und 4 erlaubt");
		} else {
			ausgabe = Mensaessen_berechnen(eingabe);
		}
	}
	private static String Mensaessen_berechnen(int eingabe) {
		System.out.println("Test");
		return null;
	}
}
