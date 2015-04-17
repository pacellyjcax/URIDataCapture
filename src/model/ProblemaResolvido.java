package model;

public class ProblemaResolvido {
	private String id;
	private String descricao;
	private String level;
	private String ranking;
	private String submissao;
	private String linguagem;
	private String tempo;
	private String datadaSubmissao;

	public ProblemaResolvido(String id, String level, String descricao, String ranking,
			String submissao, String linguagem, String tempo,
			String datadaSubmissao) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.level = level;
		this.ranking = ranking;
		this.submissao = submissao;
		this.linguagem = linguagem;
		this.tempo = tempo;
		this.datadaSubmissao = datadaSubmissao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	public String getSubmissao() {
		return submissao;
	}

	public void setSubmissao(String submissao) {
		this.submissao = submissao;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public String getDatadaSubmissao() {
		return datadaSubmissao;
	}

	public void setDatadaSubmissao(String datadaSubmissao) {
		this.datadaSubmissao = datadaSubmissao;
	}

	@Override
	public String toString() {
		String str = this.id + " - " +this.descricao + " - " +this.level + " - " +
				this.ranking +" - " + this.submissao+ " - " +this.linguagem + " - " +
				this.tempo + " - " + this.datadaSubmissao;
		return str;
	}

	

}
