import java.util.Scanner;

public class NewFahrkartenAutomat {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char Mehr = 'y';
		int Auswahl = 0, Tickets = 0;
		double Preis = 0.0, eingezahlt = 0.0, tmpPreis = 0.0;
		
		// Fahrkartenauswahl
		while (Mehr == 'y') {
			Mehr = 'k';
			Auswahl = 0;
			tmpPreis = 0.0;
			Tickets = 0;

			System.out.println("Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:\n"
					+ "  Kurzstrecke AB [2,00 EUR] (1)\n"
					+ "  Einzelfahrschein AB [3,00 EUR] (2)\n"
					+ "  Tageskarte AB [8,80 EUR] (3)\n"
					+ "  4-Fahrten-Karte AB [9,40 EUR] (4)");
			
			while (Auswahl <= 0 || Auswahl >= 5) {
				System.out.printf("%nWählen sie eine gültige Fahrkarte: ");
				Auswahl = scan.nextInt();
			}
			switch (Auswahl) {
			case 1:
				tmpPreis = 2.0;
				break;
			case 2:
				tmpPreis = 3.0;
				break;
			case 3:
				tmpPreis = 8.8;
				break;
			default:
				tmpPreis = 9.4;
			}
			
			// Ticket mengen auswahl
			while (Tickets <= 0 || Tickets > 10) {
				System.out.printf("%nWie viele Tickets brauchen Sie (min 1 max 10)?: ");
				Tickets = scan.nextInt();
			}
			Preis += Tickets * tmpPreis;
			System.out.printf("%nZwischenpreis ist: %.2f", Preis);
			
			while (true) {
				System.out.printf("%nWollen sie noch eine Fahrkarte auswählen? (y/n): ");
				Mehr = scan.next().charAt(0);
				if (Mehr == 'y' || Mehr == 'n') {
					break;
				}
			}
		}
				
		// Geld einzahlen
		while (Preis > 0.0) {
			System.out.printf("\nBitte bezahlen sie noch %.2f: ", Preis);
			eingezahlt = scan.nextDouble();
			Preis = Preis - eingezahlt;
		}
		
		// Rückgeld
		if (Preis < 0.0) {
			System.out.println("Der Rückgabebetrag in Höhe von " + Preis + " Euro");
			System.out.println("wird in folgenden Münzen ausgezahlt:");

			while (Preis <= -20.0) { // 2-Euro-Münzen
				System.out.println("20 Euro");
				Preis = Preis + 20.0;
			}
			while (Preis <= -10.0) { // 2-Euro-Münzen
				System.out.println("10 Euro");
				Preis = Preis + 10.0;
			}
			while (Preis <= -5.0) { // 2-Euro-Münzen
				System.out.println("5 Euro");
				Preis = Preis + 5.0;
			}
			while (Preis <= -2.0) { // 2-Euro-Münzen
				System.out.println("2 Euro");
				Preis = Preis + 2.0;
			}
			while (Preis <= -1.0) { // 1-Euro-Münzen
				System.out.println("1 Euro");
				Preis = Preis + 1.0;
			}
			while (Preis <= -0.5) { // 50-Cent-Münzen
				System.out.println("50 Cent");
				Preis = Preis + 0.5;
			}
			while (Preis <= -0.2) { // 20-Cent-Münzen
				System.out.println("20 Cent");
				Preis = Preis + 0.2;
			}
			while (Preis <= -0.1) { // 10-Cent-Münzen
				System.out.println("10 Cent");
				Preis = Preis + 0.1;
			}
			while (Preis <= -0.05) { // 5-Cent-Münzen
				System.out.println("5 Cent");
				Preis = Preis + 0.05;
			}
			if (Preis < 0.048) {
				System.out.println("5 Cent");
				Preis = Preis + 0.05;
//				System.out.println("Rest " + Preis);
			}
		}

		System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir wünschen Ihnen eine gute Fahrt.");

		scan.close();
	}
}