package Vezbe;

import java.util.Scanner;

public class Vezba2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite broj zaposljenih: ");
		String [] zaposljeni = new String [s.nextInt()];
		s.nextLine();
		System.out.println("Unesite njihova imena koristeci enter posle svakog: ");
		for (int i = 0; i<zaposljeni.length; i++) {
			zaposljeni[i] = s.nextLine();
		}
		System.out.println();
		System.out.println("Uneli ste: ");
		for (String zaposljeniPojedinacno: zaposljeni) {
			System.out.println(zaposljeniPojedinacno);
		}
	}

}
