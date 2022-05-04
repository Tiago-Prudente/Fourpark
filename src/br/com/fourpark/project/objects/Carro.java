package br.com.fourpark.project.objects;

import java.text.MessageFormat;
import java.util.UUID;

public class Carro {

	private String placa;
	private String modelo;
	private UUID id; // ID estilo UUID
	private String telefoneContato;
	private String tipo; // Carro, Moto, Caminhão, etc...

	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
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
	
	public String toString() {
		System.out.println(MessageFormat.format("Placa: {0}, Modelo: {1} ", this.getPlaca(), this.getModelo()));
		return "";
	}

}
