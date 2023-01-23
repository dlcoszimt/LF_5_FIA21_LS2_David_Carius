import java.util.Scanner;

public class AB_structure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Gebe eine Note ein: ");
		int Number = scan.nextInt();
		switch (Number) {
		case 1:
			System.out.println("Sehr gut");
			break;
		case 2:
			System.out.println("Gut");
			break;
		case 3:
			System.out.println("Befriedigend");
			break;
		case 4:
			System.out.println("Ausreichend");
			break;
		case 5:
			System.out.println("Mangelhaft");
			break;
		case 6:
			System.out.println("Ungenügend");
			break;

		default:
			System.out.println("Ich kenne die Note nicht!");
			break;
		}
	}

}
