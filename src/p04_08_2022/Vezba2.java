package p04_08_2022;

import java.util.Scanner;

public class Vezba2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite broj a: ");
		double a = s.nextDouble();
		a = Math.abs(a);

		if (a < 10) {
			System.out.println("Broj a je jednocifren.");

		} else if (a < 100) {
			System.out.println("Broj a je dvocifren.");
		} else if (a < 1000) {
			System.out.println("Broj a je trocifren.");
		} else {
			System.out.println("Broj a je cetvorocifren ili veci. :)");
		}

	}

}
