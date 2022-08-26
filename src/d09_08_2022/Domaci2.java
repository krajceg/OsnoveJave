package d09_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci2 {

	public static void main(String[] args) {

//		Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve 
//		elemente niza koji su veci od nule.
//		Primer izvrsenja:
//		Unesite N: 5
//		Unesite broj: 1
//		Unesite broj: -4
//		Unesite broj: 3
//		Unesite broj: -7
//		Unesite broj: 9
//
//		Brojevi veci od nule u nizu A su: 1, 3, 9,

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
			int x = s.nextInt();
			a.add(x);
		}
		for (int i = 0; i < n; i++) {
			if (a.get(i) > 0) {
				b.add(a.get(i));
			}
		}
		if (b.size() == 0) {
			System.out.println("U nizu A nema brojeva vecih od nule.");
		} else {
			System.out.println("Brojevi veci od nule u nizu A su: " + b);
		}
	}
}
