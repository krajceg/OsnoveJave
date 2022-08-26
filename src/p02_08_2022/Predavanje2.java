package p02_08_2022;

import java.util.Scanner;

public class Predavanje2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite vrednost A: ");
		int a = s.nextInt();
		System.out.print("Unesite vrednost B: ");
		int b = s.nextInt();
		
		int rezultat = a + b;
		
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("Rezultat: " + rezultat);
		s.close();
		
		


	}

}
