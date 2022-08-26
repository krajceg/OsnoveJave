package p08_08_2022;

import java.util.Scanner;

public class Vezba5 {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		
		int broj;
		
		do {
			System.out.print("Unesite broj: ");
			broj = s.nextInt();
		if (broj > 50 || broj < 10) {
			System.out.println("Greska: Broj nije u opsegu od 10 do 50.");
		}
	}
		while (broj < 10 || broj > 50);
		System.out.println("Broj je validan, kraj programa.");
	}

}
