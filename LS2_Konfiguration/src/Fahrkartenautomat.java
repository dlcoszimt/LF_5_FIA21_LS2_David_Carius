import java.text.DecimalFormat;
import java.util.Scanner;

class Fahrkartenautomat {
	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		double zuZahlenderBetrag;
		double eingezahlterGesamtbetrag;
		double eingeworfeneMuenze;
		double rueckgabebetrag;
		double nochZuZahlen, karteneinzelpreis;
		int Ticketmenge = 0;
		
		// Geldbetrag eingeben
//		System.out.print("Zu zahlender Betrag (Euro): ");
//		zuZahlenderBetrag = tastatur.nextDouble();

		System.out.print("Ticketpreis (Euro): ");
		karteneinzelpreis = tastatur.nextDouble();
		
		while (Ticketmenge > 10 || Ticketmenge <= 0) {
			System.out.print("Anzahl der Tickets: ");
			Ticketmenge = tastatur.nextInt();
			System.out.println("Da keine Zahl zwischen 1 und 10 eingegeben wurde, gibt es nur 1 Ticket");
		}
		zuZahlenderBetrag = karteneinzelpreis * Ticketmenge;
		
		// Geldeinwurf
		eingezahlterGesamtbetrag = 0.0;
		nochZuZahlen = 0.0;
		while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
			nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
			System.out.printf("Noch zu zahlen: %.2f Euro", nochZuZahlen);
			System.out.print("\nEingabe (mind. 5 Cent, höchstens 20 Euro): ");
			eingeworfeneMuenze = tastatur.nextDouble();
			String xls = String.valueOf(eingeworfeneMuenze);
			switch (xls){
			case "0.05", "0.1", "0.2", "0.5", "1.0", "2.0", "5.0", "10.0", "20.0":
				eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
				break;
			default:
				System.out.println("Ist kein gültiger Betrag");
				break;
			}
		}

		// Fahrscheinausgabe
		System.out.println("\nFahrschein wird ausgegeben");
		for (int i = 0; i < 8; i++) {
			System.out.print("=");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");

		// Rückgeldberechnung und -ausgabe
		rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
		if (rueckgabebetrag > 0.0) {
			System.out.println("Der Rückgabebetrag in Höhe von " + rueckgabebetrag + " Euro");
			System.out.println("wird in folgenden Münzen ausgezahlt:");

			while (rueckgabebetrag >= 20.0) { // 2-Euro-Münzen
				System.out.println("20 Euro");
				rueckgabebetrag = rueckgabebetrag - 20.0;
			}
			while (rueckgabebetrag >= 10.0) { // 2-Euro-Münzen
				System.out.println("10 Euro");
				rueckgabebetrag = rueckgabebetrag - 10.0;
			}
			while (rueckgabebetrag >= 5.0) { // 2-Euro-Münzen
				System.out.println("5 Euro");
				rueckgabebetrag = rueckgabebetrag - 5.0;
			}
			while (rueckgabebetrag >= 2.0) { // 2-Euro-Münzen
				System.out.println("2 Euro");
				rueckgabebetrag = rueckgabebetrag - 2.0;
			}
			while (rueckgabebetrag >= 1.0) { // 1-Euro-Münzen
				System.out.println("1 Euro");
				rueckgabebetrag = rueckgabebetrag - 1.0;
			}
			while (rueckgabebetrag >= 0.5) { // 50-Cent-Münzen
				System.out.println("50 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.5;
			}
			while (rueckgabebetrag >= 0.2) { // 20-Cent-Münzen
				System.out.println("20 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.2;
			}
			while (rueckgabebetrag >= 0.1) { // 10-Cent-Münzen
				System.out.println("10 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.1;
			}
			while (rueckgabebetrag >= 0.05) { // 5-Cent-Münzen
				System.out.println("5 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.05;
			}
			if (rueckgabebetrag > 0.045) {
				System.out.println("5 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.05;
			}
			System.out.println("Rest " + rueckgabebetrag);
//			System.out.printf("%.2f Cent", rueckgabebetrag);
		}

		System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir wünschen Ihnen eine gute Fahrt.");

		tastatur.close();
	}
}