package it.polito.tdp.corsi.model;

import java.util.List;

public class TestModel {
	public static void main(String [] args) {
		Model m=new Model();
		List<Corso> corsi=m.listaCorsiSemestre(2);
		
		for(Corso c:corsi) {
			System.out.println(c);
		}
		
		int matricola=146101;
		String result=m.getNomeCognomeMatricola(matricola);
		System.out.println("Matricola: "+matricola+ " nome cognome: "+result);
	
		int matricola2=146100;
		String result2=m.getNomeCognomeMatricola(matricola2);
		System.out.println("Matricola: "+matricola2+ " nome cognome: "+result2);
	
		result= m.getStatisticheFromCorsi();
		System.out.println(result);
	}
}
