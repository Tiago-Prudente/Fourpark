package br.com.fourpark.project.objects;

public class Vaga {
	private String horarioDeEntrada;
	private String horarioDeSaida;
	private Integer posicao;
	private Boolean disponivel = true;
	private Carro veiculo;
	
	@Override
	public String toString() {
		return "Vaga na posicao = " + this.getPosicao() + ", disponivel = " + this.getDisponivel() + "]";
	}		
	
	
	public String getHorarioDeEntrada() {
		return horarioDeEntrada;
	}
	public void setHorarioDeEntrada(String horarioDeEntrada) {
		this.horarioDeEntrada = horarioDeEntrada;
	}
	public String getHorarioDeSaida() {
		return horarioDeSaida;
	}
	public void setHorarioDeSaida(String horarioDeSaida) {
		this.horarioDeSaida = horarioDeSaida;
	}
	public Integer getPosicao() {
		return posicao;
	}
	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}
	public Boolean getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	public Carro getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Carro veiculo) {
		this.veiculo = veiculo;
	}
	
	public void ocuparVaga(Carro veiculo) {
		this.setDisponivel(false);
		System.out.println("O carro " + veiculo + " ocupou a vaga.");
	}
	
	public void desocuparVaga() {
		this.setDisponivel(true);
		System.out.println("A vaga foi liberada, pode estacionar outro carro");
	}
	
}
