package p04_08_2022;

import java.util.Scanner;

public class Vezba3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite vrednost broja a: ");
		double a = s.nextDouble();

		System.out.print("Unesite vrednost broja b: ");
		double b = s.nextDouble();

		System.out.print("Unesite vrednost broja c: ");
		double c = s.nextDouble();

		if (a >= b && a <= c) {
			System.out.println("a je u opsegu od b do c.");
		} else {
			System.out.println("a nije u opsegu od b do c");
		}

	}

}
