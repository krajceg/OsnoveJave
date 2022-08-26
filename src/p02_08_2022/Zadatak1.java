package p02_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
//		Napisati program koji na ekranu
//		stampa podatke u formatu:
//			[IME I PREZIME]
//			[BROJ TELEFONA], [ULICA I BROJ], [GRAD]
//			[EMAIL]
		
		String ime = "Svetolik Kljajic";
		String brojTelefona = "062666666";
		String imeUlice = "Ostrva Vida 23";
		String grad = "Krusevac";
		String email = "svetolik@gmail.com";
		
		System.out.println(ime);
		System.out.println(brojTelefona + ", " + imeUlice + ", " + grad);
		System.out.println(email);

	}

}
