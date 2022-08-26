package p09_08_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {

//		Napisati program koji vrsi mesanje niza. Niz je duzine 10, proizvoljnih brojeva. 
//		Mesanje niza se vrsi tako sto se 8 puta vrsi zamena dva random elementa iz niza.
//		primer jedne zamene:
//		Ako je niz
//		1,2,3,4,5,6,7,8,9,10
//		i prvi random indeks je 4 a drugi random indeks je 6
//		1,2,3,4,7,6,5,8,9,10



		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		Random gen = new Random();
		
		brojevi.add(1);
		brojevi.add(2);
		brojevi.add(3);
		brojevi.add(4);
		brojevi.add(5);
		brojevi.add(6);
		brojevi.add(7);
		brojevi.add(8);
		brojevi.add(9);
		brojevi.add(10);

		for (int i = 0; i < 8; i++) {
			int a = gen.nextInt(brojevi.size());
			int b = gen.nextInt(brojevi.size());
			int safe = brojevi.get(a);
			brojevi.set(a, brojevi.get(b));
			brojevi.set(b, safe);
		}
		System.out.println(brojevi);
	}
}
