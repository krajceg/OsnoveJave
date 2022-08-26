package Vezbe;

import java.util.Scanner;

public class Dani_u_nedelji {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int day;
		
		do {
		String poruka1 = "Unesite u vidu broja dan u nedelji: ";
		System.out.print(poruka1);
		day = s.nextInt();
		
		if (day>0 & day<8) {
			
			switch (day) {
			
			case 1:
				System.out.println("Izabrani dan je Ponedeljak.");
				break;
			case 2:
				System.out.println("Izabrani dan je Utorak.");
				break;
			case 3:
				System.out.println("Izabrani dan je Sreda.");
				break;
			case 4:
				System.out.println("Izabrani dan je Cetvrtak.");
				break;
			case 5:
				System.out.println("Izabrani dan je Petak.");
				break;
			case 6:
				System.out.println("Izabrani dan je Subota.");
				break;
			case 7:
				System.out.println("Izabrani dan je Nedelja.");
				break;	
			}
			
						
		}
		else {
			
				System.out.println("Unesena vrednost mora biti uzmedju 1-7! :)");
			
			 }
		}
			while (day > 7 || day < 1);
			
		}


}

