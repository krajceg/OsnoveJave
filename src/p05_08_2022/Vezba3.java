package p05_08_2022;

import java.util.Scanner;

public class Vezba3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj M: ");
		int m = s.nextInt();
		System.out.println("Unesite broj N: ");
		int n = s.nextInt();
		System.out.println("Unesite korak petlje K: ");
		int k = s.nextInt();
		int a,b;
		
		if (m < n ) {
			a = m;
			b = n;
		}
		else {
			a = n;
			b = m;
		}
		for (int i = a; i <= b; i = i + k) {
			System.out.print(i + ", ");
		}
		

	}

}
