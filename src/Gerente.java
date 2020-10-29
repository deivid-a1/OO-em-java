
public class Gerente extends UsuarioFuncionario {
	
	private Projeto nomeProjeto;
	private Dependente dependente1;
	private Dependente dependente2;
	
	
	public Gerente(String nome, String codigo, String filiacao, String cargaHoraria, String telefone, String endereco,
			String salario, String departamento, String cpf, String identidade, String sexo, String estadoCivil,
			String naturalidade, String escolaridade, String cargo, Projeto nomeProjeto, Dependente dependente1,
			Dependente dependente2) {
		super(nome, codigo, filiacao, cargaHoraria, telefone, endereco, salario, departamento, cpf, identidade, sexo,
				estadoCivil, naturalidade, escolaridade, cargo);
		this.nomeProjeto = nomeProjeto;
		this.dependente1 = dependente1;
		this.dependente2 = dependente2;
		
	}

	public Projeto getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(Projeto nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public Dependente getDependente1() {
		return dependente1;
	}

	public void setDependente1(Dependente dependente1) {
		this.dependente1 = dependente1;
	}

	public Dependente getDependente2() {
		return dependente2;
	}

	public void setDependente2(Dependente dependente2) {
		this.dependente2 = dependente2;
	}

	
	
	
	
}