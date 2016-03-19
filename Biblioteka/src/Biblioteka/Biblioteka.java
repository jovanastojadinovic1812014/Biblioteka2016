package Biblioteka;

import java.util.LinkedList;

import Biblioteka.interfejs.BibliotekaInterface;

public class Biblioteka implements BibliotekaInterface {

	LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();

	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		knjige.add(knjiga);

	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		knjige.remove(knjiga);
	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, String isbn, String naslov, String izdavac) {
		LinkedList<Knjiga> nove = new LinkedList<Knjiga>();

		if (autor == null && isbn == null && naslov == null && izdavac == null) {
			return knjige;
		}

		for (int i = 0; i < knjige.size(); i++) {
			if (isbn.equals(isbn)) {
				nove.add(knjige.get(i));
			}
		}

		return null;
	}

}
