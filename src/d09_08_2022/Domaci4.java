package d09_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci4 {

	public static void main(String[] args) {
		
//		Napisati program koji ucitava niz a duzine N. Nakon unosa niza a, formira se niz b tako 
//		sto se prva 3 elementa niza a kopiraju u niz b, a ostale elemente niza b ispuniti 
//		jedinicama.(niz b je iste duzine kao i niz a)
//
//		Unesite N: 6
//		Unesite broj: 1
//		Unesite broj: 5
//		Unesite broj: 2
//		Unesite broj: 7
//		Unesite broj: 8
//		Unesite broj: -1
//
//		Niz a: 1, 5, 2, 7, 8, -1
//		Niz b: 1, 5, 2, 1, 1, 1



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
		for (int i = 0; i < 3; i++) {
			b.add(a.get(i));
		}
		int razlika = a.size() - b.size();
		for (int i = 0; i < razlika; i++) {
			b.add(1);
		}
		System.out.println("Niz A: " + a);
		System.out.println("Niz B: " + b);
	}
}
