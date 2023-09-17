package visao;
import aplicacao.Cachorro;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro C1 = new Cachorro("cachorro sem nome", "nenhuma raça definida", 0);

		System.out.println("Antes da modificacao...");
		System.out.println("Nome: " + C1.getNome());
		System.out.println("Raca: " + C1.getRaca());
		System.out.println("Idade: " + C1.getIdade());
		
		C1.setNome("Marie");
		C1.setIdade(5);
		C1.setRaca("Gata brava");
		
		Cachorro C2 = C1.clonarCachorro();
		
		System.out.println("Depois da modificação..." + C1.informarEstado());
		
		if(C1.informarEstado().equals(C2.informarEstado())) {
			System.out.println("Os estados sao iguais");
		}else {
			System.out.println("Os estados nao sao iguais");
		}
		System.out.println("Cachorro clonado:" + C2.informarEstado());
	}

}
