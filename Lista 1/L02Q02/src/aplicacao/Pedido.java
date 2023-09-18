package aplicacao;

public class Pedido {
	private float hora, resta;
	private String endereco;
	private int qntBotijoes;
	private float totalCompra;
	private float horaEntrega;
	private int pagamento;
	private String status;
	private int cod;
	
	
	public void setHora(float hora) {
		this.hora = hora;
		setHoraEntrega(hora);
	}
	public float getHora() {
		return hora;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setQntBotijoes(int botijoes) {
		this.qntBotijoes = botijoes;
		setTotalCompra(qntBotijoes);
	}
	public int getQntBotijoes() {
		return qntBotijoes;
	}
	public void setTotalCompra(int qntBotijoes) {
		this.totalCompra= qntBotijoes*60;
	}
	public float getTotalCompra() {
		return totalCompra;
	}
	private void setHoraEntrega(float hora) {
		if (hora<18) {
			horaEntrega = hora + 6;
		} else {
			resta = 24 - hora;
			horaEntrega = 6 - resta;
		}
		
		
	}
	public float getHoraEntrega() {
		return horaEntrega;
	}
	public void setPagamento(int pagamento) {
		this.pagamento = pagamento;
	}
	public int getPagamento() {
		return pagamento;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}

	
	
	
	
}
