package p08_08_2022;

import java.util.Scanner;

public class Vezba3 {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		
//		int broj;
//		System.out.print("Unesite broj: ");
//		broj = s.nextInt();
//		
//		while (broj != 0 ) {
//			System.out.print("Unesite broj: ");
//			broj = s.nextInt();
//		}
//		System.out.println("Napokon");

		int broj2;
		do {
			System.out.print("Unesite broj: ");
			broj2 = s.nextInt();
		}
		while (broj2 != 0);
		System.out.println("NAPOKON!");
	}

}
