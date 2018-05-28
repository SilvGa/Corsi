package it.polito.tdp.corsi.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.corsi.db.CorsoDAO;
import it.polito.tdp.corsi.db.StudenteDAO;

public class Model {

	public List<Corso> corsi;
	public CorsoDAO corsoDAO;
	public StudenteDAO studenteDAO;
	
	public Model() {
		corsoDAO= new CorsoDAO();
		studenteDAO=new StudenteDAO();
	}
	
	public List<Corso> listaCorsiSemestre(int pd){
		
		//metodo1:leggo tutto e filtro dopo
//		this.corsi=corsoDAO.listaAll();
//		List<Corso> risultato=new ArrayList<>();
//
//		for(Corso c:this.corsi) {
//			if(c.getPd()==pd) {
//				risultato.add(c);
//			}
//		}
//		return risultato;
		
		
//		//metodo2:uso il db per i filtri da usare più spesso
		List<Corso> risultato2=corsoDAO.listByPD(pd);
		return risultato2;
	}

	public String getNomeCognomeMatricola(int matricola) {
		
		Studente studente= studenteDAO.getStudenteByMatricola(matricola);
		if(studente==null) {
			return "Non ho trovato nessuno studente associato a quella matricola";
		}
		
		return studente.getNome()+ " " + studente.getCognome();
	}

	public String getStatisticheFromCorsi() {
		this.corsi=corsoDAO.listaAll();
		
		StringBuilder sb=new StringBuilder();
		
		for(Corso c: this.corsi) {
			Statistiche stat=corsoDAO.getStatisticheByCodins(c.getCodiceInsegnamento());
			sb.append("Codins: "+c.getCodiceInsegnamento()+"\n");
			for(String cds: stat.getMappaCDS().keySet()) {
				sb.append(" - "+cds+ " "+stat.getMappaCDS().get(cds)+ " \n");
			}
			sb.append("\n");
		}

		return sb.toString();
	}
}
