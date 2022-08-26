package p08_08_2022;

import java.util.Scanner;

public class Vezba9 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n, suma;
		suma = 0;
		n = 1;
		do {
			suma = suma + n;
			n++;
		} while ((suma + n) < 100);
		System.out.println(suma);
	}

}
