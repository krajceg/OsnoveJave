package d05_08_2022;

import java.util.Scanner;

public class Domaci3 {

	public static void main(String[] args) {
		
//		3. Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve. 
//		Na kraju programa prikazati sumu.
//		Primer izvrsenja:
//		Unesite N: 5
//		Unesite broj: 1
//		Unesite broj: 2
//		Unesite broj: 9
//		Unesite broj: 6
//		Unesite broj: 8
//		Suma parnih brojeva je 16
//		Objasnjenje: 2 + 6 + 8 = 16
		
		Scanner s = new Scanner (System.in);
		
		int n, suma, x;
		suma = 0;
		
		System.out.print("Unesite broj N: ");
		n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite broj: ");
			x = s.nextInt();
			if (x % 2 == 0) {
				suma = suma + x;
			}
		}
		System.out.println("Suma parnih brojeva je " + suma);

	}

}
