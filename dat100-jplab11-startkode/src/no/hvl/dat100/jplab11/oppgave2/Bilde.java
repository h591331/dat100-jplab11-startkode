package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id, bruker, dato, tekst);
		this.url = url;
	}
		
	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id, bruker, dato, likes, tekst);
		this.url = url;
	}
	
	public String getUrl() {
		return url;

	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		
		String str = "BILDE" + "\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" 
					+ getLikes() + "\n"+ getTekst() + "\n" + url + "\n";
			return str;

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		String str = "\t\t<h2>" + getBruker() + "@" + getDato() + "[" + getLikes() + "]" + "<h2>\n"
					+ "\t\t<hr>" 
					+ "\n\t\t<p>" + getTekst() + "<p>\n"
					+ "\t\t<iframe src="  + url + "height=600 width=800" +"></iframe><hr>";
			return str;
	}
}
