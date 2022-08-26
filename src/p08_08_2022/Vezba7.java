package p08_08_2022;

import java.util.Scanner;

public class Vezba7 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String pojacaj, smanji, play, akcija;
		pojacaj = "pojacaj";
		smanji = "smanji";
		play = "play";
		int zvuk = 75;

		do {
			System.out.print("Unesite akciju: ");
			akcija = s.next();
			if (akcija.equals(pojacaj)) {
				zvuk = zvuk + 10;
				if (zvuk > 100) {
					zvuk = 100;
				}
			} else if (akcija.equals(smanji)) {
				zvuk = zvuk - 10;
				if (zvuk < 0) {
					zvuk = 0;
				}
			}
		} while (!akcija.equals(play));
		System.out.println("Jacina zvuka je " + zvuk + ".");
	}

}
