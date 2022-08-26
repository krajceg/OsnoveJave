package d08_08_2022;

import java.util.Scanner;

public class Domaci4 {

	public static void main(String[] args) {

//		Napisati program koji od korisnika ucitava stanje na racunu a zatim sa racuna skida dok god ima 
//		sredstava za transakciju. U slucaju da nema dovoljno sredstava ispisati odgovarajucu gresku.
//		Primer izvrsenja:
//		Unesite stanje na racunu: 100
//		Na racunu imate $100, Unesite sumu za sledecu transakciju: 50
//		Na racunu imate $50, Unesite sumu za sledecu transakciju: 31
//		Na racunu imate $19, Unesite sumu za sledecu transakciju: 20
//		Nemate dovoljno sredstava na racunu.Na racunu vam je ostalo $19

		Scanner s = new Scanner(System.in);

		int stanje, transakcija;

		System.out.print("Unesite stanje na racunu: ");
		stanje = s.nextInt();

//		do {
//			if (stanje == 0) {
//				break;
//			}
//			System.out.print("Na rucunu imate $" + stanje + ". Unesite sumu za sledecu transkaciju: ");
//			transakcija = s.nextInt();
//			if (stanje >= transakcija) {
//				stanje = stanje - transakcija;
//			} else {
//				break;
//			}
//
//		} while (stanje >= 0);
//		System.out.println("Nemate dovoljno sredstava na racunu. Na racunu vam je ostalo $" + stanje);
		
		do {
			System.out.print("Na rucunu imate $" + stanje + ". Unesite sumu za sledecu transkaciju: ");
			transakcija = s.nextInt();
			if (stanje - transakcija >= 0) {
				stanje = stanje - transakcija;
				transakcija = 0;
				}

		}
		while (stanje - transakcija >=0);
		System.out.println("Nemate dovoljno sredstava na racunu. Na racunu vam je ostalo $" + stanje);
	}
}
