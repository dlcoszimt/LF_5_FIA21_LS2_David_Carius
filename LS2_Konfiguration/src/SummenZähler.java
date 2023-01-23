import java.util.Scanner;

public class SummenZähler {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Zahl = 0;
		System.out.print("Bitte geben sie eine ganzzahl ein: ");
		Zahl = scan.nextInt();
		for (int i = 1; i < Zahl+1; i++) {
			System.out.println(i);
		}
		System.out.println("");
		for (int i = Zahl; i > 0; i--) {
			System.out.println(i);
		}
	}
}