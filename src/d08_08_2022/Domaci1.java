package d08_08_2022;

import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		
//		Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve. 
//		Zadatak resiti while petljom.
//		Unesite N: 5
//		Unesite broj: 1
//		Unesite broj: 32
//		Unesite broj: 121
//		Unesite broj: 1333
//		Unesite broj: 144
//		Suma je: 265
		
		Scanner s = new Scanner(System.in);
		int n, x, suma;
		suma = 0;
		System.out.print("Unesite broj N: ");
		n = s.nextInt();
		
		while (n > 0) {
			System.out.print("Unesite broj: ");
			x = s.nextInt();
			n--;
			if (x > 99 && x < 1000) {
				suma = suma + x;
			}
		}
		System.out.println("Suma je: " + suma);


	}

}
