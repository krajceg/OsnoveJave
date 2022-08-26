package p09_08_2022;

import java.util.ArrayList;

public class Zadatak3 {

	public static void main(String[] args) {

//		Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji zamenjuje 
//		vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.

		ArrayList<Integer> brojevi = new ArrayList<Integer>();

		brojevi.add(10);
		brojevi.add(15);
		brojevi.add(20);
		brojevi.add(30);
		brojevi.add(40);
		brojevi.add(50);
		
		System.out.println("Prva pozicija: " + brojevi.get(0));
		System.out.println("Zadnja pozicija: " + brojevi.get(brojevi.size()-1));
		
		int brojZadnji = brojevi.get(brojevi.size()-1);
		brojevi.set(brojevi.size()-1, brojevi.get(0));
		brojevi.set(0, brojZadnji);
		System.out.println("Nova prva pozicija: " + brojevi.get(0));
		System.out.println("Nova zadnja pozicija: " + brojevi.get(brojevi.size()-1));

	}

}
