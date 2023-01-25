public class ArrayUebung {

	public static void main(String args[]) {

		int Arr[] = new int[100];
		
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = i+1;
		}
		for (int i = 0; i < Arr.length; i++) {
			System.out.println(Arr[i]);
		}
		System.out.println(Arr[89]);
		Arr[49] = 1060;
		Arr[0] = 2020;
		Arr[Arr.length-1] = 2022;
		for (int i = 0; i < Arr.length; i++) {
			System.out.println("Array: " + (i+1) + " Inahlt: " + Arr[i]);
		}
		int tmp_x = 0;
		for (int i = 0; i < Arr.length; i++) {
			tmp_x = tmp_x + Arr[i];
		}
		System.out.println("Durchschnitt: " + (tmp_x/100));
	}
}