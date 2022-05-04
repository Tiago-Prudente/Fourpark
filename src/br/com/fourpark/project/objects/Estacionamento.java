package br.com.fourpark.project.objects;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento extends Vaga{
	Vaga[] vagas = new Vaga[50];
	List<Vaga> vagasCriadas = new ArrayList<Vaga>();
	Vaga vaga;

	public void setEstacionamento() {
		for (int i = 1; i <= vagas.length; i++) {
			Vaga vaga = new Vaga();
			vaga.setPosicao(i);
			vagasCriadas.add(vaga);
		}
		System.out.println("Estacionamento com 50 vagas criado com sucesso.");
	}

	public void getEstacionamento() {
		for(int i = 1; i <= vagas.length; i++) {
			vagasCriadas.get(i-1).getIsDisponivel();
			
				System.out.println(vagasCriadas.get(i-1));
		}
	}
	
	public void ocuparVaga(String placa, String modelo) {
		Carro carro = new Carro(placa, modelo);
		
		for(int i = 0; i <= vagas.length; i++) {
			if(vagasCriadas.get(i).getIsDisponivel()) {
				vagasCriadas.get(i).setIsDisponivel(false);
				vagasCriadas.get(i).setVeiculo(carro);
				System.out.println(MessageFormat.format("Carro {0}, entrou na vaga {1}", modelo, vagasCriadas.get(i).getPosicao()));
				break;
			}
		}
	}
	
	public void desocuparVaga(Integer vaga) {
		if(vagasCriadas.get(vaga - 1).getIsDisponivel() == false) {
			vagasCriadas.get(vaga - 1).setIsDisponivel(true);
			System.out.println("A vaga " + vaga + " foi liberada, pode estacionar outro carro");
		} else {
			System.out.println("A vaga está livre!");
		}
	}
}
