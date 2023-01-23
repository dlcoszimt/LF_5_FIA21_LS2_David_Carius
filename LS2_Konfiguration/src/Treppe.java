import java.util.Scanner;

public class Treppe {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Treppenhöhe, Stufenbreite, zeichen = 0;

		System.out.printf("Treppenhöhe: ");
//		Treppenhöhe = scan.nextInt();
		Treppenhöhe = 7;
		Stufenbreite = 2;
		System.out.printf("%nStufenbreite: %n");
//		Stufenbreite = scan.nextInt();
		
		for (int i = 1; i <= Treppenhöhe; i++) {
			zeichen += Stufenbreite;
			System.out.printf("%"+ (Treppenhöhe - zeichen) +"s%"+zeichen+"s", " ", "*");
			System.out.println();
		}
		scan.close();
	}
}