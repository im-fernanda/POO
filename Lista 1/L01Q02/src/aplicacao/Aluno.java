package aplicacao;

public class Aluno {
	private String nome;
	private int matricula;
	private float n1, n2, n3;
	private float media;
	private String situacao;
	
	public Aluno() {
		
	}
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	public void setMatricula(int novaMatricula) {
		matricula = novaMatricula;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setNotas(float nota1, float nota2, float nota3) {
		n1 = nota1;
		n2 = nota2;
		n3 = nota3;
	}
	public void calcularMedia() {
		media = (n1*4+n2*5+n3*6)/15;
		// Atualizar situação
		if (media>=7.0) {
			this.situacao = "Aprovado.";
		} else if (media<3.0) {
			this.situacao = "Reprovado.";
		} else {
			this.situacao = "Em recuperação!";
		}
	}
	public boolean buscarAluno(int matricula) {
		if (matricula == this.matricula) {
			return true;
		} else {
			return false;
		}
	}
	public String alterarNota(int codNota, float valorNota) {
		if (codNota == 1) {
			n1 = valorNota;
		} else if (codNota == 2) {
				n2 = valorNota;
		} else {
			n3 = valorNota;
		}
		calcularMedia();
		return situacao;
	}

	public String getNome() {
		return nome;
	}
	public float getNota1() {
		return n1;
	}
	public float getNota2() {
		return n2;
	}
	public float getNota3() {
		return n3;
	}
	public float getMedia() {
		return media;
	}
	public String getSituacao() {
		return situacao;
	}
	
	
	
	
}
