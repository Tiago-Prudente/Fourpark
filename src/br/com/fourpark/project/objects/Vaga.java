package br.com.fourpark.project.objects;

public class Vaga {
	private String horarioDeEntrada;
	private String horarioDeSaida;
	private Integer posicao;
	private Boolean isDisponivel = true;
	private Carro veiculo;

	@Override
	public String toString() {
		return "Vaga = " + this.getPosicao() + ", disponivel = " + this.getIsDisponivel() + ", Veiculo = " + this.getVeiculo();
	}
	
	public Vaga() {
		
	}
	
	
	public Vaga (Carro veiculo, String horarioDeEntrada, String horarioDeSaida) {
		this.veiculo = veiculo;
		this.isDisponivel = true;
		this.horarioDeEntrada = horarioDeEntrada;
		this.horarioDeSaida = horarioDeSaida;		
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

	public Boolean getIsDisponivel() {
		return isDisponivel;
	}

	public void setIsDisponivel(Boolean disponivel) {
		this.isDisponivel = disponivel;
	}

	public Carro getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Carro veiculo) {
		this.veiculo = veiculo;
	}
	
}
