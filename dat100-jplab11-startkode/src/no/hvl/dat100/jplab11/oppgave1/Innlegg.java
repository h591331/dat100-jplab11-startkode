package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	private int id, likes;
	private String bruker, dato;
	
	public Innlegg() {	
		
	}
	
	public Innlegg(int id, String bruker, String dato) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		this.id = id;
		this.likes = likes;
		this.bruker = bruker;
		this.dato = dato;
	}
	
	public String getBruker() {
		return bruker;	

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		this.likes = getLikes() + 1;
	}
	
	public boolean erLik(Innlegg innlegg) {			
		if (innlegg.getId() == id)  {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		String str = id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		
		return str;
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		String str = "\t\t<h2>" + bruker + "@" + dato + "[" + likes + "]" + "<h2>\n";
			return str;
						
	}
}