import java.util.Scanner;
import java.util.ArrayList;


public class ControleUsuario {
	
	ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
	ArrayList<Operario> operarios = new ArrayList<Operario>();
	ArrayList<Projeto> projetos = new ArrayList<Projeto>();

	public void cadastrarProjeto() {
		System.out.println("Digite os dados do projeto do gerente, respectivamente: o titulo, data de inicio, data do fim, função desenvolvida, stakeholders, histórico, produtos entregues");
		Projeto pr1 = new Projeto(InputString.stringInput(), InputString.stringInput(), InputString.stringInput(), InputString.stringInput(), InputString.stringInput(), InputString.stringInput(), InputString.stringInput());
	}
	
	public void cadastrarGerente() {
	{
		
		boolean exit = false;
		int i=0;
		while (exit = false) 
		{
			System.out.println("Digite os projetos responsavel por esse gerente");
		}
		
		System.out.println("Digite os dados do dependente, respectivamente: o nome, sexo, data de nascimento");
		Dependente dep1 = new Dependente(InputString.stringInput(), InputString.stringInput(), InputString.stringInput());
		
		System.out.println("Digite os dados do dependente, respectivamente: o nome, sexo, data de nascimento");
		Dependente dep2 = new Dependente(InputString.stringInput(), InputString.stringInput(), InputString.stringInput());
		
		System.out.println("Digite os dados do gerente, respectivamente: nome, codigo, filiação, carga horária, telefone, endereço, salario, departamento, "
				+ "cpf, identidade, sexo, estado civil, naturalidade, "
				+ "escolaridade, cargo");
		Gerente us0 = new Gerente(InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),
				InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),InputString.stringInput(), projetos.get(0), dep1, dep2);
		
		gerentes.add(us0);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
	}
	
	
	public void cadastrarOperario() 
	{

		
		System.out.println("Digite os dados do dependente 2 do operarios que deseja cadastrar, respectivamente: o nome, sexo, data de nascimento");
		Dependente dep1 = new Dependente(InputString.stringInput(), InputString.stringInput(), InputString.stringInput());
		
		System.out.println("Digite os dados do dependente 2 do operarios que deseja cadastrar, respectivamente: o nome, sexo, data de nascimento");
		Dependente dep2 = new Dependente(InputString.stringInput(), InputString.stringInput(), InputString.stringInput());
		
		System.out.println("Digite os dados dos tipo de trabalho do operario");
		TipoTrabalho tipo1 = new TipoTrabalho(InputString.stringInput(),InputString.stringInput());
		
		
		System.out.println("Digite os dados do operario, respectivamente: nome, codigo, filiação, carga horária, telefone, endereço, salario, departamento, "
				+ "cpf, identidade, sexo, estado civil, naturalidade, "
				+ "escolaridade, cargo, habilidade, periodo");
		Operario us0 = new Operario(InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),
				InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),InputString.stringInput(),InputString.stringInput(), InputString.stringInput(), InputString.stringInput(), dep2, dep2, tipo1);
		
		operarios.add(us0);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	public void menu() 
	{
		
		boolean exit = false;
		String variavel;
		while (exit == false) {
			System.out.println("Bem vindo ao menu. Digite o que deseja fazer!");
			System.out.println("Para relatorio do número de funcionario, digite 1");
			System.out.println("Relatório com os projetos desenvolvidos, digite 2");
			System.out.println("Relatório das habilidades de cada operário, digite 3");
			System.out.println("Relação dos dependentes de cada funcionário, digite 4");
			System.out.println("Relação do gerente de cada projeto, digite 5");
			System.out.println("digite outro dado para sair");
			variavel = InputString.stringInput();
			
			if (variavel == "1") 
			{
				System.out.println("O numero de usuarios é " + ContaObjetos.getContador());
			}
			if (variavel == "2") 
			{
				
			}
		
		
		}
		
	}
	
	
		
}
