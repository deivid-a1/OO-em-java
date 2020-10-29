
public class Projeto {
	
	private String titulo;
	private String dataInicio;
	private String dataFim;
	private String funcaoDesenvolvida;
	private String stakeHolders;
	private String historico;
	private String produtosEntregues;
	
	
	public Projeto() {
		
	}
	
	
	
	public String getTitulo() {
		return this.titulo;
	}
	public String getDataInicio() {
		return this.dataInicio;
	}
	public String getDataFim() {
		return this.dataFim;
	}
	public String getFuncaoDesenvolvida() {
		return this.funcaoDesenvolvida;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public void setFuncaoDesenvolvida(String funcaoDesenvolvida) {
		this.funcaoDesenvolvida = funcaoDesenvolvida;
	}

	public void setStakeHolders(String stakeHolders) {
		this.stakeHolders = stakeHolders;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public void setProdutosEntregues(String produtosEntregues) {
		this.produtosEntregues = produtosEntregues;
	}

	public String getStakeHolders() {
		return this.stakeHolders;
	}
	public String getHistorico() {
		return this.historico;
	}
	public String getProdutosEntregues() {
		return this.produtosEntregues;
	}
}