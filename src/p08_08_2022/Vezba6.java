package p08_08_2022;

import java.util.Scanner;

public class Vezba6 {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		
		int n, k, brojac;
		brojac = 0;
		System.out.print("Unesite broj N: ");
		n = s.nextInt();
		System.out.print("Unesite broj K: ");
		k = s.nextInt();
		
		while (n > 0) {
			System.out.print("Unesite broj: ");
			int broj = s.nextInt();
			if (broj == k) {
				brojac++;
			}
			n--;
		}
		System.out.println("Uneto je " + brojac + " koja imaju vrednost " + k + ".");
	}

}
