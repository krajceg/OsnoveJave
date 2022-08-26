package p09_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

//		Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i koji menja 
//		vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//		Primer:
//		Unesite pozicjiu od 0 do 9: 3
//		Unesite novu vrednost: 11
//		Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.


		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		
		brojevi.add(10);
		brojevi.add(15);
		brojevi.add(20);
		brojevi.add(30);
		brojevi.add(40);
		brojevi.add(50);
		brojevi.add(60);
		brojevi.add(70);
		brojevi.add(80);
		brojevi.add(85);

		System.out.println("Unesite poziciji od 0 do 9: ");
		int k = s.nextInt();
		System.out.println("Unesite novu vrednost: ");
		int n = s.nextInt();
		brojevi.set(k, n);
		
		System.out.println("Element na " + k + "." + " je " + brojevi.get(k));
		
		

	}

}
