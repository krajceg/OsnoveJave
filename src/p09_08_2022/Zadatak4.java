package p09_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

//		Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i 
//		koji prikazuje element na poziciji K. K unosi korisnik.
//		Primer:
//			Unesite pozicjiu: 2
//			Na pozicji 2 je vrednost 7.

		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		
		
		brojevi.add(10);
		brojevi.add(15);
		brojevi.add(20);
		brojevi.add(30);
		brojevi.add(40);
		brojevi.add(50);
		
		System.out.println("Unesite poziciju: ");
		int k = s.nextInt();
		
		System.out.println("Na poziciji " + k + " je: " + brojevi.get(k));
		
		

	}

}
