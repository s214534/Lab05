package it.polito.tdp.anagrammi.model;

import java.util.*;

public class Model {

		List<Parola> anagrammi;
		Parola parolaIniziale;
		int livello;
		int numeroAnagrammi;
		Parola parziale;
		
		public Model(){
		}
		
		public List<Parola> cercaAnagrammi(String parola)
		{
			anagrammi=new ArrayList<Parola>();
			parolaIniziale=new Parola(parola);
			parziale=new Parola(parolaIniziale.getDimensione());
			livello=0;
			recursive(parziale, livello);
			
			return anagrammi;
			
		}
		
		// Struttura di un algoritmo ricorsivo generico
		void recursive (Parola parziale, int livello) {
			
			// A
			if (parziale.isFull()) {

				Parola temp=new Parola(parziale.getParola());
				if(!anagrammi.contains(temp))
				anagrammi.add(temp);
				parziale.reset();
			 	return;
			}
		 // Potrebbe essere anche un while ()
		 for (int i=0; i<parolaIniziale.getDimensione();i++) {
		 // B

			
			 char c=parolaIniziale.getCaratteri()[i];
			
			 if (!(parziale.conta(c)==parolaIniziale.conta(c))) { // C
				 parziale.addCharacter(c);
				 recursive (parziale, livello + 1);
				 parziale.removeCharacter();
			 }
			 // D
			 
		 }
	}

}
