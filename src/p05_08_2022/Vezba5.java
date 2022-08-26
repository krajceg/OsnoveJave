package p05_08_2022;

import java.util.Scanner;

public class Vezba5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String ime, prezime, jmbg;
		int broj;

		System.out.print("Unesite ime: ");
		ime = s.nextLine();
		System.out.print("Unesite prezime: ");
		prezime = s.nextLine();
		System.out.print("Unesite JMBG: ");
		jmbg = s.nextLine();
		System.out.print("Broj primeraka: ");
		broj = s.nextInt();

		for (int i = 1; i <= broj; i++) {
			System.out.println();
			System.out.println("Primerak " + i);
			System.out.println("******************************");
			System.out.println("Ime i prezime: " + ime + " " + prezime);
			System.out.println("JMBG: " + jmbg);
			System.out.println("******************************");

		}

	}

}
