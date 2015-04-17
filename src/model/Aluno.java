package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome;
	private String idUri;
	private List<ProblemaResolvido> problemas;
	private double pontosExtras;
	public Aluno(String nome, String idUri) {
		this.nome = nome;
		this.idUri = idUri;
		this.problemas = new ArrayList<>();
		this.pontosExtras = pontosExtras;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdUri() {
		return idUri;
	}
	public void setIdUri(String idUri) {
		this.idUri = idUri;
	}
	public List<ProblemaResolvido> getProblemas() {
		return problemas;
	}
	public void addProblemas(ProblemaResolvido problema) {
		this.problemas.add(problema);
	}
	public double getPontosExtras() {
		return pontosExtras;
	}
	public void setPontosExtras(double pontosExtras) {
		this.pontosExtras = pontosExtras;
	}
	
	
	

}
