import java.util.Scanner;
public class Matrix {
	
	public static int quer(int zahl) {
		int summe = 0;
		while (0 != zahl) {
			summe = summe + (zahl % 10);
			zahl = zahl / 10;
		}
		return summe;
	}

	public static void main(String[] args) {
		int Teiler = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Gib mal Nummer: ");
		Teiler = scan.nextInt();
		System.out.println();
		
		for (int i = -1; i < 99; i += 10) {
			for (int x = 1; x <= 10; x++) {
				int p = i + x;
				String inhalt = Integer.toString(p);
				
				if (inhalt.contains(Integer.toString(Teiler))) {
					System.out.print("   *");
				}
				else {
					if (p % Teiler > 0) {
						System.out.printf("%4s", p);
					}
					else {
						if (quer(p) == p) {
							System.out.printf("%4s", p);
						}
						else {
							System.out.print("   *");
						}
					}
				}
			}
			System.out.println();
		}
	}
}