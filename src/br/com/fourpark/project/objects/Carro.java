package br.com.fourpark.project.objects;

import java.util.UUID;

public class Carro {

	private String placa;
	private String modelo;
	private UUID id; // ID estilo UUID
	private Pessoa pessoa; // Dono do veículo
	private String tipo; // Carro, Moto, Caminhão, etc...

	public Carro(String placa, String modelo) {
		this.id = UUID.randomUUID();
		this.placa = placa;
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Carro placa = " + placa + ", modelo = " + modelo;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
