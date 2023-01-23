public class Multiplikator {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int x = 1; x <= 10; x++) {
				System.out.printf("%4d", i * x);
			}
			System.out.println();
		}
	}
}