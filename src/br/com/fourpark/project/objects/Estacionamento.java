package br.com.fourpark.project.objects;
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
			System.out.println("Vaga no sistema: " + vaga.getPosicao() + "\nDisponibilidade: " + vaga.getDisponivel());
		}
	}

	public void getEstacionamento() {
		for(int i = 1; i <= vagas.length; i++) {
			System.out.println(vagasCriadas.get(i-1));
		}
	}
}
