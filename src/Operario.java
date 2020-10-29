import java.util.ArrayList;

public class Operario extends UsuarioFuncionario{
	
	private ArrayList<String> habilidades = new ArrayList<String>();
	
	private TipoTrabalho tipo1;
	
	private ArrayList<Dependente> dependentes = new ArrayList<Dependente>();
	private Dependente dep = new Dependente();
	
	public Operario(Dependente dependente1, TipoTrabalho tipo1) {
		this.dep = dependente1;
		this.tipo1 = tipo1;
	}


	public String getHabilidade(int index) {
		return habilidades.get(index);
	}


	public void setHabilidade(String habilidade) {
		habilidades.add(habilidade);
	}
	public int lenHabilidades() {
		return habilidades.size();
	}

	public Dependente getDep(int index) {
		return dependentes.get(index);
	}
	
	public int lenDep() {
		return dependentes.size();
	}

	public void setDep(Dependente dep) {
		dependentes.add(dep);
	}


	public TipoTrabalho getTipo1() {
		return tipo1;
	}


	public void setTipo1(TipoTrabalho tipo1) {
		this.tipo1 = tipo1;
	}
	
}
