package p04_08_2022;

import java.util.Scanner;

public class Vezba4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite pol osobe: ");
		String pol = s.next();

		System.out.print("Unesite cenu proizvoda: ");
		double cena = s.nextDouble();

		System.out.print("Da li je proizvod neophodan: ");
		String proizvod = s.next();

		if (pol.equals("zenski") && proizvod.equals("da")) {
			System.out.println("Prozivod se kupuje, a njegova cena je " + cena);
		} else {
			System.out.println("Proizvod se ne kupuje.");
		}

	}

}
