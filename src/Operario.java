
public class Operario extends UsuarioFuncionario{
	
	private String habilidade;
	private String periodo;
	private Dependente dependente1;
	private Dependente dependente2;
	private TipoTrabalho tipo1;
	private TipoTrabalho tipo2;
	
	public Operario(String nome, String codigo, String filiacao, String cargaHoraria, String telefone, String endereco,
			String salario, String departamento, String cpf, String identidade, String sexo, String estadoCivil,
			String naturalidade, String escolaridade, String cargo, String habilidade, String periodo,
			Dependente dependente1, Dependente dependente2, TipoTrabalho tipo1) {
		super(nome, codigo, filiacao, cargaHoraria, telefone, endereco, salario, departamento, cpf, identidade, sexo,
				estadoCivil, naturalidade, escolaridade, cargo);
		this.habilidade = habilidade;
		this.periodo = periodo;
		this.dependente1 = dependente1;
		this.dependente2 = dependente2;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
	}
	public String getHabilidade() {
		return habilidade;
	}
	public String getPeriodo() {
		return periodo;
	}	
}
