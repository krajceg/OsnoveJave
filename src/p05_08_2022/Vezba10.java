package p05_08_2022;

import java.util.Scanner;

public class Vezba10 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int duzinaVidea, trenutnoVreme, procenat, minuti, sekunde, minuti2, sekunde2;

		System.out.print("Unesite duzinu videa: ");
		duzinaVidea = s.nextInt();
		System.out.print("Unesite trenutno vreme: ");
		trenutnoVreme = s.nextInt();

		procenat = trenutnoVreme * 100 / duzinaVidea;

		for (int i = 0; i < 100; i++) {
			if (i < procenat) {
				System.out.print("*");
			} else {
				System.out.print("_");
			}
		}
		minuti = trenutnoVreme/60;
		sekunde = trenutnoVreme - 60 * minuti;
		minuti2 = duzinaVidea/60;
		sekunde2 = duzinaVidea - 60 * minuti2;
		System.out.println();
		System.out.println(minuti + ":" + sekunde + " / " + minuti2 + ":" + sekunde2);
		

	}

}
