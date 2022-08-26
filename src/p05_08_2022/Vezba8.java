package p05_08_2022;

import java.util.Scanner;

public class Vezba8 {

	public static void main(String[] args) {

//		Scanner s = new Scanner(System.in);
//		int a, b;
//
//		System.out.print("Unesite A: ");
//		a = s.nextInt();
//		System.out.print("Unesite B: ");
//		b = s.nextInt();
//
//		for (int i = 0; i < a; i++) {
//			System.out.print("*");
//		}
//		for (int i = a; i <= b; i++) {
//			System.out.print("_");
//		}
//		for (int i = b; i < 20; i++) {
//			System.out.print("*");
//		}
		
		Scanner s = new Scanner(System.in);
		int a, b;

		System.out.print("Unesite A: ");
		a = s.nextInt();
		System.out.print("Unesite B: ");
		b = s.nextInt();

		for (int i = 0; i < 20; i++) {
			if ((i < a) || (i > b)) {
				System.out.print("*");
			}
			else {
				System.out.print("_");
			}
		}
		
	}

}
