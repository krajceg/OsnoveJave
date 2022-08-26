package p09_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {

//		Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do prvog.


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
		
		int size = brojevi.size()-1;
		int i = 0;

		while (i < brojevi.size()) {
			System.out.println(brojevi.get(size));
			i++;
			size--;
		}

	}

}
