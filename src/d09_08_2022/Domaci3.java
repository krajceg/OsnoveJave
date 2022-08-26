package d09_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci3 {

	public static void main(String[] args) {

//		Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa treba ispisati 
//		indekse onih clanova niza koji su jednaki broju X.
//		Primer izvrsenja:
//		Unesite N: 5
//		Unesite broj: 1
//		Unesite broj: 3
//		Unesite broj: 7
//		Unesite broj: 3
//		Unesite broj: 9
//		Unesite X: 3
//
//		Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 1, 3

		ArrayList<Integer> a = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> b = new ArrayList<Integer>();
		int n;

		do {
			System.out.print("Unesite N: ");
			n = s.nextInt();
		} while (n <= 0);

		for (int i = 0; i < n; i++) {
			System.out.print("Unesite broj: ");
			int y = s.nextInt();
			a.add(y);
		}
		System.out.println("Unesite X: ");
		int x = s.nextInt();
		for (int i = 0; i < n; i++) {
			if (a.get(i) == x) {
				b.add(i);
			}
		}
		if (b.size() == 0) {
			System.out.println("U nizu A nema brojeva X.");
		} else {
			System.out.println("Rezultat: Elementi niza A koji su jednaki broju " + x + " imaju indekse: " + b);
		}
	}
}
