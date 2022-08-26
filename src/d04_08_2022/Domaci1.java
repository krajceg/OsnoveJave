package d04_08_2022;

import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		/*
		 * 1.Napisati program koji za ucitava brojeve a i b (b ima vrednosti 1 ili 2)
		 * Ukoliko se za b unese: b=1, vrednost promenljive a se uvecava za 10 b=2,
		 * vrednost promenljive a se smanjuje za 20 Na kraju zadatka odstampati novu
		 * vrednost promenljive a. Primer izvrsenja: Unesite a: 44 Unesite b: 2 Nova
		 * vrednost za a je 24
		 */

		Scanner s = new Scanner(System.in);
		int a, b;

		System.out.print("Unesite vrednost broja a: ");
		a = s.nextInt();
		System.out.print("Unesite vrednost broja b(1-2): ");
		b = s.nextInt();
		if (b == 1 || b == 2) {
			if (b == 1) {
				a = a + 10;
			} else {
				a = a - 20;
			}
			System.out.println("Nova vrednost za a je " + a);
		} else {
			System.out.println("Uneli ste nevalidan podatak.");
		}
	}

}
