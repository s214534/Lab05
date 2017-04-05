package it.polito.tdp.anagrammi.model;

import java.util.*;

public class Parola {
	
	private String parola;
	private int dimensione;
	private char[] caratteri;
	private int contatore;
	
	public Parola(String parola)
	{
		this.parola=parola;
		dimensione=parola.length();
		contatore=dimensione;
		caratteri=new char[dimensione];
		caratteri=parola.toCharArray();
		

	}
	
	
	public Parola(int dimensione)
	{
		caratteri=new char[dimensione];
		contatore=0;
		this.dimensione=dimensione;
		parola="";

	}
	
	public void reset(){
		parola="";
	}
	
	public int conta(char c){
		int conta=0;
		for(int i=0; i<contatore; i++)
		{
			if (caratteri[i]==c)
				conta++;
		}
		return conta;
	}
	public void addCharacter(char c){
		caratteri[contatore]=c;
		contatore++;
		
	}
	public boolean isFull(){
		if(dimensione==contatore){
			for(int j=0; j<caratteri.length; j++ )
			parola+=caratteri[j];
			return true;
		}
		else
			return false;
	}
	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public int getDimensione() {
		return dimensione;
	}

	public void setDimensione(int dimensione) {
		this.dimensione = dimensione;
	}

	public char[] getCaratteri() {
		return caratteri;
	}

	public void setCaratteri(char[] caratteri) {
		this.caratteri = caratteri;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((parola == null) ? 0 : parola.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parola other = (Parola) obj;
		if (parola == null) {
			if (other.parola != null)
				return false;
		} else if (!parola.equals(other.parola))
			return false;
		return true;
	}

	@Override
	public String toString() {
			return parola;
	}

	public void removeCharacter() {
		caratteri[contatore-1]=' ';
		contatore--;	
		
	}

	

	

}
