package p09_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {

//		Napisati program koji ima definisan niz od N broja i od korisnika ucitava N brojeva i 
//		cuva ih u niz. Nakon unosa brojeva sracunati sumu niza i prikazati je na kraju programa.
//		Primer:
//		Unesite N: 10
//		Unesite broj: 1
//		Unesite broj: 2
//		Unesite broj: 3
//		Unesite broj: 4
//		Unesite broj: 8
//		Unesite broj: 9
//		Unesite broj: 2
//		Unesite broj: 1
//		Unesite broj: 7
//		Unesite broj: 5
//		Suma je 42


		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);

		int n;
		int x;

		System.out.print("Unesite N: ");
		n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite broj: ");
			x = s.nextInt();
			brojevi.add(i, x);
		}
		int suma = 0;
		for (int i = 0; i < brojevi.size(); i++) {
			suma = suma + brojevi.get(i);
		}
		System.out.println(suma);
	}
}
