package d05_08_2022;

import java.util.Scanner;

public class Domaci4 {

	public static void main(String[] args) {
		
//		Napisati program koji od korisnika ucitava N brojeva i na kraju ispisuje srednju vrednost svih brojeva.
//		Unesite N: 5
//		Unesite broj: 1
//		Unesite broj: 2
//		Unesite broj: 9
//		Unesite broj: 6
//		Unesite broj: 8
//		Srednja vrednost je 5. 
//		5 jer je celobrojno deljenje!
		
		Scanner s = new Scanner (System.in);
		
		int n, suma, x;
		suma = 0;
		
		System.out.print("Unesite broj N: ");
		n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite broj: ");
			x = s.nextInt();
			suma = suma + x;
		}
		int srednjaVrednost = suma / n;
		System.out.println("Srednja vrednost je " + srednjaVrednost + ".");

	}

}
