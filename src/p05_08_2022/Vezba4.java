package p05_08_2022;

import java.util.Scanner;

public class Vezba4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite jacinu zvuka: ");
		int zvuk = s.nextInt();
		
		System.out.print("<");
		
		if (zvuk>10) {
			zvuk = 10;
		}
		else if (zvuk<=0) {
			System.out.println("/");
		}
		for (int i = 0; i < zvuk; i++) {
			System.out.print("|");
		}
	}

}
