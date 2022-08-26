package p09_08_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak12 {

	public static void main(String[] args) {

//		Napisati program koji ima niz duzine 25 proizvoljnih elemenata i stampa niz kao tablu 
//		dimenzije 5x5.
//		Primer stampe:
//		1, 2, 3, 4, 6,
//		5, 6, 7, 3, 4,
//		5, 2, 1, 4, 5,
//		6, 6, 6, 2, 1
//		1, 9, 8, 7, 6

		ArrayList<Integer> brojevi = new ArrayList<Integer>();

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
		brojevi.add(11);
		brojevi.add(12);
		brojevi.add(13);
		brojevi.add(14);
		brojevi.add(15);
		brojevi.add(16);
		brojevi.add(17);
		brojevi.add(18);
		brojevi.add(19);
		brojevi.add(20);
		brojevi.add(21);
		brojevi.add(22);
		brojevi.add(23);
		brojevi.add(24);
		brojevi.add(25);

//		for (int i = 0; i < brojevi.size(); i++) {
//			if (i != 0 && i % 5 == 0) {
//				System.out.println();
//			}
//			System.out.print(brojevi.get(i) + ", ");
//		}
		
		for (int i = 0; i < brojevi.size(); i++) {
			System.out.print(brojevi.get(i) + ", ");
			if ((i+1) % 5 == 0) {
				System.out.println();
			}
		}
	}
}
