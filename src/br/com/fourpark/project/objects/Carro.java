package br.com.fourpark.project.objects;

import java.text.MessageFormat;

public class Carro {

	private String placa;
	private String modelo;
	private String cor;

	public Carro(String placa, String modelo, String cor) {
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void getAll() {
		System.out.println(MessageFormat.format("Placa: {0}, Modelo: {1}, Cor: {2} ", this.getPlaca(), this.getModelo(), this.getCor()));
	}

}
