package d05_08_2022;

import java.util.Scanner;

public class Domaci2 {

	public static void main(String[] args) {
		
//		2. Napisati program koji od korisnika ucitava N brojeva  i ispisuje sumu tih brojeva. 
//		N nam kaze koliko broja ce korisnik da unese.
//		
//		Primer izvrsenja:
//			Unesite N: 3
//			Unesite broj: 1
//			Unesite broj: 4
//			Unesite broj: 9
//			Suma je 14.
		
		Scanner s = new Scanner(System.in);
		int n, suma, x;
		suma = 0;
		System.out.print("Unesite N: ");
		n = s.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite broj: ");
			x = s.nextInt();
			suma = suma + x;
		}
		System.out.println("Suma je " + suma + ".");
		


	}

}
