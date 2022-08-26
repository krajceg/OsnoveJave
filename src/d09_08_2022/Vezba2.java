package d09_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Vezba2 {

	public static void main(String[] args) {

//		Napisati program koji vodi evidenciju koliko puta je korisnik uneo svaku cifru od 0 do 5. 
//		Korisnik unosi N brojeva.
//		Program u sebi ima niz duzine 6 koji sluzi za evidenciju unetih cifara. 
//		Na kraju programa odstapmati evidenciju.
//		Primer izvrsenja:
//		Unesite N: 6
//		Unesite broj: 1
//		Unesite broj: 1
//		Unesite broj: 0
//		Unesite broj: 1
//		Unesite broj: 5
//		Unesite broj: 7
//		Evidencija:
//		0 se javila 1 puta
//		1 se javila 3 puta
//		2 se javila 0 puta
//		3 se javila 0 puta
//		4 se javila 0 puta
//		5 se javila 1 puta

		Scanner s = new Scanner(System.in);
		ArrayList<Integer> niz = new ArrayList<Integer>();
		int n, x;

		niz.add(0);
		niz.add(0);
		niz.add(0);
		niz.add(0);
		niz.add(0);
		niz.add(0);

		System.out.print("Unesite broj N: ");
		n = s.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Unesite broj: ");
			x = s.nextInt();
			if (x >= 0 && x <= 5) {
				niz.set(x, niz.get(x) + 1);
			}
		}
		for (int i = 0; i < niz.size(); i++) {
			System.out.println(i + " se javila " + niz.get(i) + " puta");
		}
	}

}
