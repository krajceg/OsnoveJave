package p04_08_2022;

import java.util.Scanner;

public class Predavanje1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite vrednost broja A: ");
		double a = s.nextDouble();

		System.out.print("Unesite vrednost broja B: ");
		double b = s.nextDouble();

		if (a > b) {
			System.out.println("Broja A je veci od broja B.");
		} else if (a == b) {
			System.out.println("Broja A jednak je broju B.");
		} else {
			System.out.println("Broja B je veci od broja A.");
		}
	}

}
