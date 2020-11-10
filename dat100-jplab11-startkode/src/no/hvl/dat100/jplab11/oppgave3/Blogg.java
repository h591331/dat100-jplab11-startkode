package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		//Blogg lengde = new Blogg(20);
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		
	}

	public int getAntall() {
		return nesteledig;	
			
	
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
				
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteledig; i++) {
				
			if(innleggtabell[i].erLik(innlegg)) {
				return i;		
				}				
			}
			return -1;	
	}

	public boolean finnes(Innlegg innlegg) {	
		for (int i = 0; i < nesteledig; i++) {
			
			if(innleggtabell[i].erLik(innlegg)) {
				return true;		
			}				
		}
		return false;				
	}

	public boolean ledigPlass() {
		for (int i = 0; i < innleggtabell.length; i++) {
		
			if(innleggtabell[i] == null) {
				return true;
			}			
		}
		return false;			
	}
	
	public boolean leggTil(Innlegg innlegg) {		
		if(!finnes(innlegg) && ledigPlass()) {			
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}
		return false;
		
		
	}
	
	public String toString() {
		
		String str = getAntall() + "\n";
		
		for (int i = 0; i < nesteledig; i++) {		
			str += innleggtabell[i]; 
			
		}			
		return str; 

	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		
		Innlegg[] Tab = new Innlegg[innleggtabell.length*2];
		
		for (int i = 0; i < innleggtabell.length; i++) {
			
			Tab[i] = innleggtabell[i];
			
			
		}
		innleggtabell = Tab;	
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
		//if(!ledigplass()){utvidd();}
		if(!finnes(innlegg) && ledigPlass()) {			
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		
			//else if(finnes(innlegg)){leggTil();}
		} else if(!finnes(innlegg) && !ledigPlass()) {
			utvid();
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}
		return false;
				
	}
	
	public boolean slett(Innlegg innlegg) {
		if(finnes(innlegg)) {
			innlegg=null;
			nesteledig--;
			return true;
		}
		return false;
	
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}