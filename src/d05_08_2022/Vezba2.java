package d05_08_2022;

import java.util.Scanner;

public class Vezba2 {

	public static void main(String[] args) {

//		Napisati program koji simulira navijanje alarma
//		Korisnik unosi sa tastature vreme koje zeli
//		unosi se sat - smatrajte da korisnik unosi od 0 do 23
//		Unosi se minut - smatrajte da korisnik unosi od 0 do 59
//		Program zatim ispisuje kada ce zvoniti alarm. Alarm zvoni narednih pola sata, na svakih 5min
//		Primer izvrsenja:
//		Unesite sat: 18
//		Unesite minut: 43
//		Alarm:
//		18:43
//		18:48
//		18:53
//		18:58
//		19:3
//		19:8
//		19:13

		Scanner s = new Scanner(System.in);

		int sat, minut;
		System.out.print("Sat: ");
		sat = s.nextInt();
		System.out.print("Minut: ");
		minut = s.nextInt();

		if (sat < 0 || sat > 24 || minut < 0 || minut > 60) {
			System.out.println("Uneti podaci nisu validni!");
		}
		for (int i = 0; i <= 30; i = i + 5) {
			if (minut > 60) {
				minut = minut - 60;
				sat++;
			}
			System.out.println(sat + ":" + minut);
			minut = minut + 5;
		}
	}
}
