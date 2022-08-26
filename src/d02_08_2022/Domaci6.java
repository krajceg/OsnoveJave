package d02_08_2022;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Domaci6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite ime: ");
		String ime = s.nextLine();
		
		System.out.print("Unesite prezime: ");
		String prezime = s.nextLine();
		
		System.out.print("Unesite godinu rodjenja: ");
		int godinaRodjenja = s.nextInt();
		
		Calendar now = Calendar.getInstance();

		int godina = now.get(Calendar.YEAR) - godinaRodjenja;
		
		System.out.println(ime + " " + prezime + " - " + godina); 
		
/// 	Mogu da vam kazem volim advance ali oci mi ispale dok sam ovo nasao XD
				

	}

}
