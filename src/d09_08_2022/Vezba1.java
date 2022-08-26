package d09_08_2022;

import java.util.ArrayList;

public class Vezba1 {

	public static void main(String[] args) {

//		Napisati program za potrebe 2x2 pasta bara. Potrebe programa su da stampamo meni.
//		Program u sebi ima dva niza podataka:
//		Prvi niz je niz pasti koje pasta bar nudi
//		Drugi niz je niz cena
//		Proizvod iz prvog niza je uskladjen sa cenom iz drugog niza po poziciji, sto znaci da pasta
//		sa pozicije 0 je sa cenom sa pozicije 0... pasta za pozicije 2 je sa cenom sa pozicije 2...
//		Nizovi su proizvoljni.
//		Primer izvrsenja:
//		AGLIO E OLIO..................................320 rsd
//		FUNGHI..................................320 rsd
//		PESTO..................................310 rsd
//		NAPOLITANA..................................280 rsd
//		ARRABBIATA..................................300 rsd

		ArrayList<String> pasta = new ArrayList<String>();
		ArrayList<Integer> cena = new ArrayList<Integer>();

		pasta.add("AGLIO E OLIO");
		pasta.add("FUNGHI");
		pasta.add("PESTO");
		pasta.add("NAPOLITANA");
		pasta.add("ARRABBIATA");

		cena.add(320);
		cena.add(320);
		cena.add(310);
		cena.add(280);
		cena.add(300);

		for (int i = 0; i < pasta.size(); i++) {
			System.out.println(pasta.get(i) + ".................................." + cena.get(i) + " rsd");
		}
	}

}
