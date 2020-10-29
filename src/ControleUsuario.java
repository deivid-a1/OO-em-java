import java.util.Scanner;
import java.util.ArrayList;


public class ControleUsuario {
	
	ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
	ArrayList<Operario> operarios = new ArrayList<Operario>();
	Scanner input = new Scanner(System.in);

	public void cadastrarGerente() {
	
		int qtd;
		Gerente us1 = new Gerente(new Projeto(), new Dependente());
		
		System.out.println("Cadastrando gerente");
		System.out.println("Digite o nome do gerente");
		us1.setNome(InputString.stringInput());					//poderia colocar todos os atributos de UsuarioFuncionario, mas iria demorar muito para testar.
		System.out.println("Digite o cpf do gerente " + us1.getNome());
		us1.setCpf(InputString.stringInput());
		System.out.println("============================================");
		
		
		System.out.println("Cadastre o projeto que o gerente "+ us1.getNome() + " está responsável.");
		System.out.println("Digite o titulo do projeto:");	//não coloquei todos os atributos de projetos pela demora para testar.
		us1.getNomeProjeto().setTitulo(InputString.stringInput());
		
		
		System.out.println("============================================");
		System.out.println("Cadastre os dependentes de "+ us1.getNome());
		System.out.println("Digite quantos dependentes deseja cadastrar: ");
		qtd = input.nextInt();
		for (int i=0; i < qtd; i++) {
			us1.setDep(new Dependente());
			System.out.println("Digite o nome do dependente " + (i+1));
			us1.getDep(i).setNomeDep(InputString.stringInput());
			System.out.println("Digite o sexo de " + us1.getDep(i).getNomeDep());
			us1.getDep(i).setSexoDep(InputString.stringInput());
			System.out.println("Digite a data de nascimento de " + us1.getDep(i).getNomeDep());
			us1.getDep(i).setDataNasc(InputString.stringInput());
		}
		System.out.println("Dependentes de " + us1.getNome() + " foram cadastrados");
		
		System.out.println("============================================");
		
		gerentes.add(us1);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
	}
	
	public void cadastrarOperario() 
	{
		int qtd;
		Operario us1 = new Operario(new Dependente(), new TipoTrabalho());
		
		System.out.println("Cadastrando operario");
		System.out.println("Digite o nome do operario");
		us1.setNome(InputString.stringInput());
		System.out.println("Digite o cpf do gerente " + us1.getNome());
		us1.setCpf(InputString.stringInput());
		System.out.println("============================================");
		
		System.out.println("Digite a quantidade de habilidades que "+ us1.getNome() + " possui: ");
		qtd = input.nextInt();
		for(int i = 0; i < qtd; i++)
		{
			System.out.println("Digite a habilidade " + (i+1));
			us1.setHabilidade(InputString.stringInput());
		}
		System.out.println("Habilidades de " + us1.getNome() + " CADASTRADA");
		
		System.out.println("============================================");
		System.out.println("Cadastre os dados do tipo de trabalho feito por "+ us1.getNome());
		System.out.println("Digite o codigo do tipo de trabalho: ");
		us1.getTipo1().setCodigoTrabalho(InputString.stringInput());
		System.out.println("Digite a caracteristica do trabalho");
		us1.getTipo1().setCaracteristicas(InputString.stringInput());
		System.out.println("Digite o periodo do trabalho");
		us1.getTipo1().setPeriodo(InputString.stringInput());
		
		System.out.println("============================================");
		
		System.out.println("Cadastre os dependentes de "+ us1.getNome());
		System.out.println("Digite quantos dependentes deseja cadastrar: ");
		qtd = input.nextInt();
		for (int i=0; i < qtd; i++) {
			us1.setDep(new Dependente());
			System.out.println("Digite o nome do dependente " + (i+1));
			us1.getDep(i).setNomeDep(InputString.stringInput());
			System.out.println("Digite o sexo de " + us1.getDep(i).getNomeDep());
			us1.getDep(i).setSexoDep(InputString.stringInput());
			System.out.println("Digite a data de nascimento de " + us1.getDep(i).getNomeDep());
			us1.getDep(i).setDataNasc(InputString.stringInput());
		}
		System.out.println("Dependentes de " + us1.getNome() + " foram cadastrados");
		
		System.out.println("============================================");
		System.out.println("Cadastro de "+ us1.getNome() + " terminado.");
		
		operarios.add(us1);
	}
	
	public void menu() 
	{
		boolean exit = false;
		int variavel;
		while (exit == false) {
			System.out.println("Bem vindo ao menu. Digite o que deseja fazer!");
			System.out.println("Para relatorio do número de funcionario, digite 1");
			System.out.println("Relatório com os projetos desenvolvidos, digite 2");
			System.out.println("Relatório das habilidades de cada operário, digite 3");
			System.out.println("Relação dos dependentes de cada funcionário, digite 4");
			System.out.println("Relação do gerente de cada projeto, digite 5");
			System.out.println("digite 0 para sair");
			System.out.println("==========Cadastre a partir de aqui=============");
			System.out.println("Digite 6 para cadastrar um gerente");
			System.out.println("Digite 7 para cadastrar um operario");
			
			variavel = input.nextInt();
			
			System.out.println("============================================================");
			if (variavel == 1) 
			{
				System.out.println("O numero de usuarios é " + ContaObjetos.getContador());
				System.out.println("============================================================");
			}
			if (variavel == 2) 
			{	
				System.out.println("Projetos desenvolvidos");
				for (int i = 0; i < gerentes.size(); i++) 
				{
					System.out.println(gerentes.get(i).getNomeProjeto().getTitulo());
				}
				System.out.println("============================================================");
			}
			if (variavel == 3) 
			{
				
				for (int i = 0; i < operarios.size(); i++) 
				{
					System.out.println("Habilidade desenvolvida por "+ operarios.get(i).getNome());
					for (int j = 0; j < operarios.get(i).lenHabilidades(); j ++)
					{
						System.out.println(operarios.get(i).getHabilidade(j));
					}
				}
				System.out.println("============================================================");
			}
			if (variavel == 4) 
			{
				for (int i = 0; i < gerentes.size(); i++) {
					System.out.println("Gerente " + gerentes.get(i).getNome() + " possui os dependentes: ");
					for(int j = 0 ; j < gerentes.get(i).lenDependente(); j ++) 
					{
						System.out.println(gerentes.get(i).getDep(j).getNomeDep());
						if ((j - 1)  == gerentes.get(i).lenDependente()) 
						{
							System.out.println("===================================================");
						}
					
					}
				}
				for (int i = 0; i < operarios.size(); i++) {
					System.out.println("Operario " + operarios.get(i).getNome() + " possui os dependentes: ");
					for(int j = 0 ; j < operarios.get(i).lenDep(); j ++) 
					{
						System.out.println(operarios.get(i).getDep(j).getNomeDep());
						if ((j - 1)  == operarios.get(i).lenDep())
						{
							System.out.println("===================================================");
						}
					}
				}
			}
			
			if (variavel == 5) {
				System.out.println("Gerente responsável por cada projeto.");
				for( int i =0; i < gerentes.size(); i++) 
				{
					System.out.println("Gerente " + gerentes.get(i).getNome() +" está responsavel por "+ gerentes.get(i).getNomeProjeto().getTitulo());
				}
				System.out.println("===================================================");
			}
			if (variavel == 0) {
				exit = true;
			}
			if (variavel == 6) 
			{
				cadastrarGerente();
			}
			if (variavel == 7)
			{
				cadastrarOperario();
			}
		}
	}
}
