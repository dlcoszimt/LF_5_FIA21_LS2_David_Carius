public class Tabelle {
	public static void main(String[] args) {
		int l1 = -20, l2 = -10, l3 = 0, l4 = 20, l5 = 30;
		double r1 = -28.8889, r2 = -23.3333, r3 = -17.7778, r4 = -6.6667, r5 = -1.1111;
		String F = "Fahrenheit", C = "Celsius";
		System.out.printf("%-12s|%10s%n", F, C);
		System.out.println("-----------------------");
		System.out.printf("%+-12d|%10.2f%n", l1, r1);
		System.out.printf("%+-12d|%10.2f%n", l2, r2);
		System.out.printf("%+-12d|%10.2f%n", l3, r3);
		System.out.printf("%+-12d|%10.2f%n", l4, r4);
		System.out.printf("%+-12d|%10.2f%n", l5, r5);
	}
}