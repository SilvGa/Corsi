package it.polito.tdp.corsi.model;

public class Corso {
	private String codiceInsegnamento;
	private int crediti;
	private String nome;
	private int pd;
	
	
	
	
	
	
	public Corso(String codiceInsegnamento, int crediti, String nome, int pd) {
		super();
		this.codiceInsegnamento = codiceInsegnamento;
		this.crediti = crediti;
		this.nome = nome;
		this.pd = pd;
	}
	
	
	public String getCodiceInsegnamento() {
		return codiceInsegnamento;
	}
	public void setCodiceInsegnamento(String codiceInsegnamento) {
		this.codiceInsegnamento = codiceInsegnamento;
	}
	public int getCrediti() {
		return crediti;
	}
	public void setCrediti(int crediti) {
		this.crediti = crediti;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPd() {
		return pd;
	}
	public void setPd(int pd) {
		this.pd = pd;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codiceInsegnamento == null) ? 0 : codiceInsegnamento.hashCode());
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
		Corso other = (Corso) obj;
		if (codiceInsegnamento == null) {
			if (other.codiceInsegnamento != null)
				return false;
		} else if (!codiceInsegnamento.equals(other.codiceInsegnamento))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Corso [codiceInsegnamento=" + codiceInsegnamento + ", crediti=" + crediti + ", nome=" + nome + ", pd="
				+ pd + "]";
	}
	
	
	
}
