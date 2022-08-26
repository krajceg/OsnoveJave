package p04_08_2022;

import java.util.Scanner;

public class Vezba5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		double a, b, c;
		System.out.println("Unesite stranicu a: ");
		a = s.nextDouble();

		System.out.println("Unesite stranicu b: ");
		b = s.nextDouble();

		System.out.println("Unesite stranicu c: ");
		c = s.nextDouble();

		if (a > 0 && b > 0 && c > 0) {
			if (a * a + b * b == c * c) {

				System.out.println("Trougao je pravougli.");
			} else {
				System.out.println("Trougao nije pravougli.");
			}

		} else {
			System.out.println("Niste uneli validne vrednosti.");
		}

	}
}
