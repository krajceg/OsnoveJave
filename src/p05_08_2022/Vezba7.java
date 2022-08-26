package p05_08_2022;

import java.util.Scanner;

public class Vezba7 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a,b;

		System.out.print("Unesite A: ");
		a = s.nextInt();
		System.out.print("Unesite B: ");
		b = s.nextInt();
		
		if ((a>0 && a<11) || (b>0 && b<11)) {
		for (int i = 1; i<=10; i++) {
			if (i != a && i != b) {
				System.out.print(i + " ");
			}
		}
		}
		else {
			System.out.println("Barem jedna od vrednosti mora biti izmedju 1 i 10!");
		}
	}

}
