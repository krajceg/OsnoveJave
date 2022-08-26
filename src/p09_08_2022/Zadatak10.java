package p09_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {

//		Napisati program koji ucitava sa tastature N karaktera i kreira niz koji predstavlja 
//		palindrom. Na kraju programa odstampati novo kreirani niz.
//		Primer izvrsenja:
//		Unesite N: 4
//		Unesite karakter: M
//		Unesite karakter: b
//		Unesite karakter: n
//		Unesite karakter: c
//		Palindrom:
//		M, b, n, c, c, n, b, M
//		Napomena: U memoriji niz treba da ima sve ove elemente.


		ArrayList<String> slova = new ArrayList<String>();
		Scanner s = new Scanner(System.in);

		int n;
		String x;

		System.out.print("Unesite N: ");
		n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite karakter: ");
			x = s.next();
			slova.add(i, x);
		}
		System.out.println(slova);
	}
}
