package d05_08_2022;

import java.util.Scanner;

public class Vezba3 {

	public static void main(String[] args) {
		
//		Napisati program za potrebe jutjuba koji odredjuje kada ce se pokrenuti reklame. Duzinu videa kao i 
//		vreme prve reklame unosi korisnik a zatim se na svakih 30s startuje nova reklama.
//		Primer izvrsenja:
//		Duzina videa (minut): 2
//		Duzina videa (sekund): 40
//		Prva reklama (minut): 0
//		Prva reklama (sekund): 15
//		Reklame:
//		0:15
//		0:45
//		1:15
//		1:45
//		2:15
		
		Scanner s = new Scanner(System.in);
		
		int minutD, sekundD, minutR, sekundR;
		int ukupnoD, ukupnoR;
		
		System.out.print("Duzina videa minut: ");
		minutD = s.nextInt();
		System.out.print("Duzina videa sekund: ");
		sekundD = s.nextInt();
		System.out.print("Prva reklama minut: ");
		minutR = s.nextInt();
		System.out.print("Prva reklama sekund: ");
		sekundR = s.nextInt();
		
		ukupnoD = minutD * 60 + sekundD;
		ukupnoR = minutR * 60 + sekundR;
		System.out.println(minutR + ":" + sekundR);
		for (int i = 30; i < (ukupnoD - ukupnoR); i = i + 30) {
			sekundR = sekundR + 30;
			if (sekundR > 60) {
				sekundR = sekundR - 60;
				minutR = minutR + 1;
			}
			System.out.println(minutR + ":" + sekundR);
		}
			
		
		
		

	}

}
