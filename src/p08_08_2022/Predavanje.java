package p08_08_2022;

import java.util.Scanner;

public class Predavanje {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int d;
		
		
//		if (d < 8 && d > 0) {
//		switch (d) {
//		case 1:
//			System.out.println("Ponedeljak");
//			break;
//		case 2:
//			System.out.println("Utorak");
//			break;
//		case 3:
//			System.out.println("Sreda");
//			break;
//		case 4:
//			System.out.println("Cetvrtak");
//			break;
//		case 5:
//			System.out.println("Petak");
//			break;
//		case 6:
//			System.out.println("Subota");
//			break;
//		case 7:
//			System.out.println("Nedelja");
//			break;
//		}
//		}
//		else {
//			System.out.println("!?");
//		}

		do {
			System.out.print("Unesite broj zeljenog dana u nedelji: ");
			d = s.nextInt();
			if (d > 0 && d < 8) {
			switch (d) {
			case 1:
				System.out.println("Ponedeljak");
				break;
			case 2:
				System.out.println("Utorak");
				break;
			case 3:
				System.out.println("Sreda");
				break;
			case 4:
				System.out.println("Cetvrtak");
				break;
			case 5:
				System.out.println("Petak");
				break;
			case 6:
				System.out.println("Subota");
				break;
			case 7:
				System.out.println("Nedelja");
				break;
			}
			}
			else {
				System.out.println("Probaj ponovo!");
			}
		}
		while (d > 7 || d < 1);
		System.out.println("proso si do/while");
		
	}

}
