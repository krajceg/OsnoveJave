package Vezbe;

import java.util.ArrayList;
import java.util.Scanner;

public class Vezba3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<String> zaposljeni = new ArrayList<String>();
		String ime;
		
		System.out.println("Unesite broj zaposljenih: ");
		int n = s.nextInt();
		System.out.println("Unesite imena zaposljenih: ");
		
		for (int i = 0; i < n; i++) {
			ime = s.next();
			zaposljeni.add(ime);
		}
		System.out.println();
		System.out.println("Uneli ste sledeca imena: ");
		for (int i = 0; i < zaposljeni.size(); i++) {
			System.out.println(zaposljeni.get(i));
		}
	}

}
