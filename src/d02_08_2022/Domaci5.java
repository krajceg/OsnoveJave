package d02_08_2022;

import java.util.Scanner;

public class Domaci5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite vrednost x: ");
		double x = s.nextDouble();
		
		System.out.print("Unesite vrednost y: ");
		double y = s.nextDouble();
		
		double z = (x-y) * (x-y);
		System.out.println("Z prema formuli (x-y) na kvadrat je: " + z);

	}

}
