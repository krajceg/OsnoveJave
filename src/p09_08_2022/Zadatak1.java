package p09_08_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {

//		Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i 
//		prikazuje sumu nultog i zadnjeg elementa tog niza.

		ArrayList<Integer> brojevi = new ArrayList<Integer>();

		brojevi.add(1);
		brojevi.add(2);
		brojevi.add(3);
		brojevi.add(4);
		brojevi.add(5);
		brojevi.add(6);
//		int zadnji = brojevi.size() - 1;
		int suma = brojevi.get(0) + brojevi.get(brojevi.size() - 1);
		System.out.println("Suma je: " + suma);

	}

}
