package p04_08_2022;

import java.util.Scanner;

public class Vezba8 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a;
		System.out.print("Unesite vrednost broja a: ");
		a = s.nextInt();

		if (a % 2 == 0 && a % 3 == 0) {
			System.out.println("Broj je deljiv i sa 2 i sa 3.");
		} else if (a % 2 == 0) {
			System.out.print("Broj je deljiv sa 2.");
		} else if (a % 3 == 0) {
			System.out.print("Broj je deljiv sa 3.");
		} else {
			System.out.println("Broj nije deljiv sa 3 i 2.");
		}
	}

}
