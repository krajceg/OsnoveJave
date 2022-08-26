package p08_08_2022;

import java.util.Scanner;

public class VezbaStampajNiz {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n, x;
		String broj = "";
		do {
		System.out.print("Unesite broj N: ");
		n = s.nextInt();
		if (n > 0) {
		for (int i = 0; i < n; i++) {
			do {
			System.out.print("Unesite broj: ");
			x = s.nextInt();
			
			if (x >= 0) {
			broj = broj + x;
			}
			else {
				System.out.println("Broj mora biti 0 ili pozitivan!");
			}
			}
			while (x<0);
		}
		System.out.println(broj);
		}
		else {
			System.out.println("Broj N mora biti minimum 1!");
		}
		}
		while (n < 1);
	}

}
