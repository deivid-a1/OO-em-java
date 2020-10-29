import java.util.ArrayList;

public class Gerente extends UsuarioFuncionario {
	
	private Projeto nomeProjeto;
	
	private ArrayList<Dependente> dependentes = new ArrayList<Dependente>();
	private Dependente dep = new Dependente();
	
	
	public Gerente(Projeto nomeProjeto, Dependente dep) {
		this.nomeProjeto = nomeProjeto;
		this.dep = dep;
	}

	public Projeto getNomeProjeto() {
		return nomeProjeto;
	}
	
	public int lenDependente() {
		return dependentes.size();
	}

	public void setNomeProjeto(Projeto nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public Dependente getDep(int index) {
		return dependentes.get(index);
	}
	public void setDep(Dependente dep) {
		dependentes.add(dep);
	}
}