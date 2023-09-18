package visao;
import aplicacao.Aluno;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		int op, aux, codNota, valorNota;
		boolean achou;
		
		do {
			System.out.println("---------------------------------");
			System.out.println("MENU PRINCIPAL");
			System.out.println("---------------------------------");
			System.out.println("1 - CADASTRAR ALUNOS");
			System.out.println("2 - CADASTRAR NOTAS");
			System.out.println("3 - CALCULAR MÉDIAS");
			System.out.println("4 - INFORMAR SITUAÇÕES");
			System.out.println("5 - INFORMAR DADOS DE UM ALUNO");
			System.out.println("6 - ALTERAR NOTA");
			System.out.println("7 - SAIR");
			System.out.println("---------------------------------");
			System.out.println("Digite a opção desejada: ");
			
			op = teclado.nextInt();

			
			switch(op) {
			case 1: 
				System.out.println("\n CADASTRANDO ALUNOS \n");
				
				System.out.println("Aluno 1...");
				teclado.nextLine(); //Pegar o enter
				System.out.println("Digite o nome: ");
				a1.setNome(teclado.nextLine());
				System.out.println("Digite a matricula: ");
				a1.setMatricula(teclado.nextInt());

				System.out.println("Aluno 2...");
				teclado.nextLine(); //Pegar o enter
				System.out.println("Digite o nome: ");
				a2.setNome(teclado.nextLine());
				System.out.println("Digite a matricula: ");
				a2.setMatricula(teclado.nextInt());
				
				System.out.println("Aluno 3...");
				teclado.nextLine(); //Pegar o enter
				System.out.println("Digite o nome: ");
				a3.setNome(teclado.nextLine());
				System.out.println("Digite a matricula: ");
				a3.setMatricula(teclado.nextInt());


				break;
				
			case 2:
				System.out.println("\n CADASTRANDO NOTAS \n");
				
				System.out.println("Aluno 1...");
				System.out.println("Digite a n1, n2 e n3, respectivamente: ");
				a1.setNotas(teclado.nextFloat(),teclado.nextFloat(), teclado.nextFloat());
				
				System.out.println("Aluno 2...");
				System.out.println("Digite a n1, n2 e n3, respectivamente: ");
				a2.setNotas(teclado.nextFloat(),teclado.nextFloat(), teclado.nextFloat());
				
				System.out.println("Aluno 3...");
				System.out.println("Digite a n1, n2 e n3, respectivamente: ");
				a3.setNotas(teclado.nextFloat(),teclado.nextFloat(), teclado.nextFloat());
				teclado.nextLine();
				break;
				
			case 3:
			
				System.out.println("\n CALCULANDO MÉDIAS... \n");
				System.out.println("Qual a matrícula do aluno? ");
				aux = teclado.nextInt();
				if (aux == a1.getMatricula()) {
					a1.calcularMedia();
					System.out.println("Média calculada com sucesso!");
				} else if (aux == a2.getMatricula()) {
						a2.calcularMedia();
						System.out.println("Média calculada com sucesso!");
				} else if (aux == a3.getMatricula()) {
					a3.calcularMedia();
					System.out.println("Média calculada com sucesso!");
				} else {
					System.out.println("Aluno não cadastrado");
				}
				
				break;
			
			case 4:
				System.out.println("\n SITUAÇÃO DOS ALUNOS...\n");
				System.out.println(a1.getNome()+ ": " +a1.getSituacao());
				System.out.println(a2.getNome()+ ": " +a2.getSituacao());
				System.out.println(a3.getNome()+ ": " +a3.getSituacao());
				
				break;
				
			case 5:
				System.out.println("\n DADOS DO ALUNO...\n");
				System.out.println("Qual a matrícula do aluno a buscar? ");
				aux = teclado.nextInt();

				if (a1.buscarAluno(aux)) {
					System.out.println("Nome: " + a1.getNome());
					System.out.println("Nota 1: " + a1.getNota1());
					System.out.println("Nota 2: " + a1.getNota2());
					System.out.println("Nota 3: " + a1.getNota3());
					System.out.println("Média " + a1.getMedia());
					System.out.println("Situação: " + a1.getSituacao());
					achou = true;
				} else if (a2.buscarAluno(aux)) {
					System.out.println("Nome: " + a2.getNome());
					System.out.println("Nota 1: " + a2.getNota1());
					System.out.println("Nota 2: " + a2.getNota2());
					System.out.println("Nota 3: " + a2.getNota3());
					System.out.println("Média " + a2.getMedia());
					System.out.println("Situação: " + a2.getSituacao());
					achou = true;
				} else if (a3.buscarAluno(aux)) {
					System.out.println("Nome: " + a3.getNome());
					System.out.println("Nota 1: " + a3.getNota1());
					System.out.println("Nota 2: " + a3.getNota2());
					System.out.println("Nota 3: " + a3.getNota3());
					System.out.println("Média " + a3.getMedia());
					System.out.println("Situação: " + a3.getSituacao());
					achou = true;
				} else {
					System.out.println("A matrícula não corresponde a nenhum aluno.");
				}
				break;
							
			case 6:
				achou = false;
				System.out.println("\n ALTERAÇÃO DE NOTA...\n");
				System.out.println("Qual a matrícula do aluno a buscar? ");
				aux = teclado.nextInt();
				if (a1.buscarAluno(aux)) {
		
					do {
						System.out.println("Qual nota deseja alterar (1, 2 ou 3)? ");
						codNota = teclado.nextInt();
					}while ((codNota<1)||(codNota>3));
					
					System.out.println("Qual o novo valor da nota " + codNota + "? ");
					valorNota = teclado.nextInt();
					a1.alterarNota(codNota, valorNota);
					achou = true;
				} else if (a2.buscarAluno(aux)) {	
					do {
						System.out.println("Qual nota deseja alterar (1, 2 ou 3)? ");
						codNota = teclado.nextInt();
					}while ((codNota<1)||(codNota>3));
					
					System.out.println("Qual o novo valor da nota " + codNota + "? ");
					valorNota = teclado.nextInt();
					a2.alterarNota(codNota, valorNota);
					achou = true;
				} else if (a1.buscarAluno(aux)) {
					
					do {
						System.out.println("Qual nota deseja alterar (1, 2 ou 3)? ");
						codNota = teclado.nextInt();
					}while ((codNota<1)||(codNota>3));
					
					System.out.println("Qual o novo valor da nota " + codNota + "? ");
					valorNota = teclado.nextInt();
					a1.alterarNota(codNota, valorNota);
					achou = true;
				}
				
				if(!achou) {
					System.out.println("Aluno não cadastrado.");
				}
				
				break;

			case 7: System.out.println("Fim de programa!");
			break;
			
			default: System.out.println("Opção inválida."); 
			}
			
		} while (op!=7);
	}
	
}
