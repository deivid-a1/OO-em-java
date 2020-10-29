public class UsuarioFuncionario{
	private String nome;
	private String codigo;
	private String filiacao;
	private String cargaHoraria;
	private String telefone;
	private String endereco;
	private String salario;
	private String departamento;
	private String cpf;
	private String identidade;
	private String sexo;
	private String estadoCivil;
	private String naturalidade;
	private String escolaridade;
	private String cargo;
	
	public UsuarioFuncionario(String nome, String codigo, String filiacao, String cargaHoraria, String telefone,
			String endereco, String salario, String departamento, String cpf, String identidade, String sexo,
			String estadoCivil, String naturalidade, String escolaridade, String cargo) {
		this.nome = nome;
		this.codigo = codigo;
		this.filiacao = filiacao;
		this.cargaHoraria = cargaHoraria;
		this.telefone = telefone;
		this.endereco = endereco;
		this.salario = salario;
		this.departamento = departamento;
		this.cpf = cpf;
		this.identidade = identidade;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.naturalidade = naturalidade;
		this.escolaridade = escolaridade;
		this.cargo = cargo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}
	public void setNome(String dado) {
		this.nome = dado;
	}
	public void setCodigo(String dado) {
		this.codigo = dado;
	}
	
	public void setFiliacao(String dado) {
		this.filiacao = dado;
	}
	public void setCargaHoraria(String dado) {
		this.cargaHoraria = dado;
	}
	public void setTelefone(String dado) {
		this.telefone = dado;
	}
	public void setEndereco(String dado) {
		this.endereco = dado;
	}
	
	public void setDepartamento(String dado) {
		this.departamento = dado;
	}
	public void setCPF(String dado) {
		this.cpf = dado;
	}
	public void setIdentidade(String dado) {
		this.identidade = dado;
	}
	public void setSexo(String dado) {
		this.sexo = dado;
	}
	public void setEstadoCivil(String dado) {
		this.estadoCivil = dado;
	}
	public void setNaturalidade(String dado) {
		this.naturalidade = dado;
	}
	public void setEscolaridade(String dado) {
		this.escolaridade = dado;
	}
	public void setCargo(String dado) {
		this.cargo = dado;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	public String getCodigo() {
		return this.codigo;
	}	
	public String getFiliacao() {
		return this.filiacao;
	}	
	public String cargaHoraria() {
		return this.cargaHoraria;
	}	
	public String getTelefone() {
		return this.telefone;
	}
	public String getEndereco() {
		return this.endereco;
	}	
	public String getSalario() {
		return this.salario;
	}	
	public String getDepartamento() {
		return this.departamento;
	}	
	public String getCPF() {
		return this.cpf;
	}	
	public String getIdentidade() {
		return this.identidade;
	}	
	public String getSexo() {
		return this.sexo;
	}	
	public String getEstadoCivil() {
		return this.estadoCivil;
	}	
	public String getNaturalidade() {
		return this.naturalidade;
	}	
	public String getEscolariade() {
		return this.escolaridade;
	}	
	public String getCargo() {
		return this.cargo;
	}
}
