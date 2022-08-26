package d02_08_2022;

import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite vrednost broja a: ");
		int a = s.nextInt();
		int aB = Math.abs(a);
				
		System.out.print("Unesite vrednost broja b: ");
		int b = s.nextInt();
		int bB = Math.abs(b);
		
		System.out.print("Unesite vrednost broja c: ");
		int c = s.nextInt();
		int cB = Math.abs(c);
		
		int x = (aB*100) + (bB*10) + (cB);
		System.out.println("Vrednost za x je " + x);

	}

}
