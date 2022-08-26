package p02_08_2022;

import java.util.Scanner;

public class Predavanje3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite vrednost a: ");
		double a = s.nextDouble();
		
		System.out.print("Unesite vrednost b: ");
		double b = s.nextDouble();
		
		double zbir = a + b;
		System.out.println("Zbir je " + zbir);

	}

}
