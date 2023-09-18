package visao;

import java.util.ArrayList;
import java.util.Scanner;

import aplicacao.Pedido;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList <Pedido> pedido = new ArrayList <Pedido>();
		
		int op, cod=0, i=0, num=0;
		boolean achou = false;
		do {
			System.out.println("---------------------------------");
			System.out.println("MENU PRINCIPAL");
			System.out.println("---------------------------------");
			System.out.println("1 - FAZER PEDIDO");
			System.out.println("2 - CONFIRMAR ENTREGA");
			System.out.println("3 - VER PEDIDOS CONFIRMADOS");
			System.out.println("4 - VER PEDIDOS ENTREGUES");
			System.out.println("5 - SAIR");
			System.out.println("---------------------------------");
			System.out.println("Digite a opçao desejada: ");
			op = teclado.nextInt();
			
		
			switch (op) {
				case 1: 
					Pedido a = new Pedido();
			
					System.out.println("Cadastrando pedido...");
					System.out.println("Informe o horário: ");
					a.setHora(teclado.nextFloat());
					teclado.nextLine();
					System.out.println("Informe o endereço: ");
					a.setEndereco(teclado.nextLine());
					
					System.out.println("Confirmação do pedido...");
					System.out.println("Dados do pedido: ");
					System.out.println("Horário: " + a.getHora() + ",  endereço: " + a.getEndereco());
					
					int resp;
					do {
						System.out.println("Quer alterar o pedido (1-Sim, 0-Não)?");
						resp = teclado.nextInt();
						teclado.nextLine();
						
						if (resp==1) {
							System.out.println("Alterando pedido...");
							
							System.out.println("Informe o horário: ");
							a.setHora(teclado.nextFloat());
							teclado.nextLine();

							System.out.println("Informe o endereço: ");
							a.setEndereco(teclado.nextLine());	
							
							System.out.println("Dados do pedido: ");
							System.out.println("Horário: " + a.getHora() + ", Endereço: " + a.getEndereco());
							System.out.println("Confirmar (0-Sim, 1-Não)? ");
							resp = teclado.nextInt();
							teclado.nextLine();
						}
						
					} while (resp!=0);
					
					System.out.println("Informe a quantidade de botijões: ");
					a.setQntBotijoes(teclado.nextInt());
					
					System.out.println("Dados do pedido: ");
					System.out.println("Horário: " + a.getHora());
					System.out.println("Endereço: " + a.getEndereco());
					System.out.println("Quantidade de botijões: " + a.getQntBotijoes());
					System.out.println("Total da compra: " + a.getTotalCompra());
					System.out.println("Horário de entrega: " + a.getHoraEntrega());
						
					System.out.println("Informe o número do cartão de crédito: ");
					a.setPagamento(teclado.nextInt());
					a.setStatus("CONFIRMADO!!!");
	
					pedido.add(a);
					System.out.println("Número do pedido: " + cod);
					cod++;
					
				break;
				
				case 2:
					System.out.println("Informe o número do pedido: ");
					num = teclado.nextInt();
					
					for (i=0; i<pedido.size(); i++) {
						if (num == pedido.get(i).getCod()) {
							pedido.get(i).setStatus("Entregue!");
							System.out.println("Pedido confirmado.");
							achou = true;
						} 
					}
					if (!achou) {
						pedido.get(i).setStatus("Pedido não localizado :/");
					}
					
					
				break;
				
				case 3: System.out.println("PEDIDOS CONFIRMADOS: ");	

					achou = false;
					for (i=0; i<pedido.size(); i++) {
						if ("CONFIRMADO!!!" == pedido.get(i).getStatus()) {
								System.out.println("----------------------------------");
								System.out.println("Dados do pedido");
								System.out.println("Código: " + pedido.get(i).getCod());
								System.out.println("Horário: " + pedido.get(i).getHora());
								System.out.println("Endereço: " + pedido.get(i).getEndereco());
								System.out.println("Quantidade de botijões: " + pedido.get(i).getQntBotijoes());
								System.out.println("Total da compra: " + pedido.get(i).getTotalCompra());
								System.out.println("Cartão: " + pedido.get(i).getPagamento());
								System.out.println("Horário de entrega: " + pedido.get(i).getHoraEntrega());

								System.out.println("----------------------------------");
							achou = true;
						}
					}
					if (!achou) {
						System.out.println("Não há pedidos confirmados.");
					}
			
				break;		
				
				case 4:
					achou = false;
					for (i=0; i<pedido.size(); i++) {
						if ("Entregue!" == pedido.get(i).getStatus()) {
								System.out.println("----------------------------------");
								System.out.println("Dados do pedido");
								System.out.println("Código: " + pedido.get(i).getCod());
								System.out.println("Horário: " + pedido.get(i).getHora());
								System.out.println("Endereço: " + pedido.get(i).getEndereco());
								System.out.println("Quantidade de botijões: " + pedido.get(i).getQntBotijoes());
								System.out.println("Total da compra: " + pedido.get(i).getTotalCompra());
								System.out.println("Cartão: " + pedido.get(i).getPagamento());
								System.out.println("Horário de entrega: " + pedido.get(i).getHoraEntrega());
								System.out.println("----------------------------------");
							achou = true;
						}
					}
					if (!achou) {
						System.out.println("Não há pedidos entregues. ");
					}
					
				break;
						
				case 5: System.out.println("Finalizando programa...");
				break;
				
				default: System.out.println("Opção inválida.");
		
		}
			
		} while (op!=5);
	}

}
