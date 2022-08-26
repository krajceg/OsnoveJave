package p08_08_2022;

import java.util.Scanner;

public class Vezba4 {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		
		int broj, broj2;
		broj2 = 0;
		do {
			System.out.print("Unesite broj: ");
			broj = s.nextInt();
			if (broj == 0) {
				broj2++;
			}
		}
		while (broj2 != 2);
		System.out.println("NAPOKON!");
	}

}
