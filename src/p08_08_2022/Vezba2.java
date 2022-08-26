package p08_08_2022;

import java.util.Scanner;

public class Vezba2 {

	public static void main(String[] args) {
		
//		Napisati program koji od korisnika ucitava N brojeva i te brojeve samo odsampa nakon unosa. 
//		Primer izvrsenja:
//		Unesite N: 3
//		Unesite broj: 1
//		Unet broj je 1.
//		Unesite broj: 4
//		Unet broj je 4.
//		Unesite broj: 9
//		Unet broj je 9.
		
		Scanner s = new Scanner (System.in);
		
		int n;
		System.out.print("Unesite broj N: ");
		n = s.nextInt();
		
//		for (int i = 0; i < n; i++) {
//			System.out.println("Unesite broj x: ");
//			int x = s.nextInt();
//			System.out.println("Broj x je: " + x);
//		}
		
		while (n > 0) {
			System.out.print("Unesite broj x: ");
			int x = s.nextInt();
			n--;
			System.out.println();
			System.out.println("Uneti broj x je: " + x);
			System.out.println();
		}
		
		
		


	}

}
