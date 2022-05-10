package br.com.fourpark.project.objects;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Estacionamento extends Vaga {
	Vaga[] vagas = new Vaga[50];
	List<Vaga> vagasCriadas = new ArrayList<Vaga>();
	Vaga vaga;
	LocalDateTime now = LocalDateTime.now();
	Integer hora = now.getHour();
	Integer minuto = now.getMinute();
	Integer contagem = 0;
	HashMap<Integer, Vaga> historico = new HashMap<Integer, Vaga>();
	static Double VALOR_POR_HORA = 20.00;

	public void setEstacionamento() {
		for (int i = 1; i <= vagas.length; i++) {
			Vaga vaga = new Vaga();
			vaga.setPosicao(i);
			vagasCriadas.add(vaga);
		}
		System.out.println("Estacionamento com 50 vagas criado com sucesso.");
	}

	public void getEstacionamento() {
		for (int i = 1; i <= vagas.length; i++) {
			vagasCriadas.get(i - 1).getIsDisponivel();

			System.out.println(vagasCriadas.get(i - 1));
		}
	}

	public void ocuparVaga(String placa, String modelo) {
		Carro carro = new Carro(placa, modelo);

		for (int i = 0; i <= vagas.length; i++) {
			if (vagasCriadas.get(i).getIsDisponivel()) {
				vagasCriadas.get(i).setIsDisponivel(false);
				vagasCriadas.get(i).setVeiculo(carro);
				vagasCriadas.get(i).setHorarioDeEntrada(hora + ":" + minuto.toString());
				System.out.println(MessageFormat.format("Carro {0}, entrou na vaga {1}, no horario {2}.", modelo,
						vagasCriadas.get(i).getPosicao(), vagasCriadas.get(i).getHorarioDeEntrada()));
				break;
			} else {
				System.out.println("Estacionamento lotado.");
			}
		}
	}

	public HashMap<Integer, Vaga> desocuparVaga(Integer vaga, String saida, HashMap<Integer, Vaga> historico) {

		if (vagasCriadas.get(vaga - 1).getIsDisponivel() == false) {
			vagasCriadas.get(vaga - 1).setHorarioDeSaida(saida);
			historico = adicionarNoHistorico(vagasCriadas.get(vaga - 1), historico);
			vagasCriadas.get(vaga - 1).setIsDisponivel(true);
			vagasCriadas.get(vaga - 1).setVeiculo(null);
			System.out.println("A vaga " + vaga + " foi liberada, pode estacionar outro carro.");
			return historico;
		} else {
			System.out.println("A vaga está livre!");
			return historico;
		}
	}

	private HashMap<Integer, Vaga> adicionarNoHistorico(Vaga vaga, HashMap<Integer, Vaga> historico) {
		contagem++;
		historico.put(contagem, vaga);
		String placa, modelo, horarioEntrada, horarioSaida;
		horarioEntrada = historico.get(contagem).getHorarioDeEntrada();
		horarioSaida = historico.get(contagem).getHorarioDeSaida();
		placa = historico.get(contagem).getVeiculo().getPlaca();
		modelo = historico.get(contagem).getVeiculo().getModelo();

		Carro novoVeiculo = new Carro(placa, modelo);

		Vaga vagaAtualizada = new Vaga(novoVeiculo, horarioEntrada, horarioSaida);

		historico.put(contagem, vagaAtualizada);

		return historico;
	}

	public static void exibirHistorico(HashMap<Integer, Vaga> historico) {
		for (Integer posicao : historico.keySet()) {
			System.out.println(historico.get(posicao).getVeiculo());
			System.out.println("Entrada: " + historico.get(posicao).getHorarioDeEntrada());
			System.out.println("Saida: " + historico.get(posicao).getHorarioDeSaida());
		}
	}

	public static void definirValorPorHora() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor por hora do trabalho: ");
		VALOR_POR_HORA = sc.nextDouble();
	}

	public static void fecharCaixaNoDia(HashMap<Integer, Vaga> historico) {
		List<String> veiculosEntradaSaida = new ArrayList<String>();
		for (Integer posicao : historico.keySet()) {
				veiculosEntradaSaida.add(historico.get(posicao).getHorarioDeEntrada());
				veiculosEntradaSaida.add(historico.get(posicao).getHorarioDeSaida());
		}
		Integer horaEntrada, horaSaida, minutoEntrada, minutoSaida, retornar=0;
		
		while (veiculosEntradaSaida.size() >= 2) {
		horaEntrada = Integer.parseInt(veiculosEntradaSaida.get(0).substring(0,2));
		minutoEntrada = Integer.parseInt(veiculosEntradaSaida.get(0).substring(3,5));
		horaSaida = Integer.parseInt(veiculosEntradaSaida.get(1).substring(0,2));
		minutoSaida = Integer.parseInt(veiculosEntradaSaida.get(1).substring(3,5));
		
		retornar = retornar + ((horaSaida - horaEntrada) * 60) + (minutoSaida - minutoEntrada);
		veiculosEntradaSaida.remove(0); // Remove o ultimo indice 2x para limpar ir para o próximo veiculo
		veiculosEntradaSaida.remove(0);
		}
		
		Double resultado = Double.valueOf(retornar) / 60 * VALOR_POR_HORA;
		
		System.out.printf("O valor do caixa é: R$ %.2f", resultado);
		

	}
}
