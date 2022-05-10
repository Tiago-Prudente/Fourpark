package br.com.fourpark.project;

import java.util.HashMap;
import java.util.Scanner;

import br.com.fourpark.project.objects.Estacionamento;
import br.com.fourpark.project.objects.Vaga;

public class Main {

	public static void main(String[] args) {
		Integer option = -1;
		Scanner input = new Scanner(System.in);
		Estacionamento estacionamento = new Estacionamento();
		String placa, modelo;
		HashMap<Integer, Vaga> historico = new HashMap<Integer, Vaga>();
		
		
		// Esse método cria o estacionamento com as 50 vagas.
		estacionamento.setEstacionamento();

		
		// Inicia o loop para fazer as movimentações do sistema.
		do {
			System.out.println("---------- FOUR PARK MANAGEMENT SYSTEM ----------");
			System.out.println("VALOR POR HORA DEFINIDO PARA O PADRÃO EM R$20.00");
			System.out.println("Digite a opção desejada: ");
			System.out.println("1 - Listar vagas");
			System.out.println("2 - Entrada de veículo");
			System.out.println("3 - Saida de veículo");
			System.out.println("4 - Exibir histórico de veículo");
			System.out.println("5 - Definir valor hora do dia");
			System.out.println("6 - Fechar o dia de trabalho");
			System.out.println("0 - Sair do sistema");
			System.out.print("Digite a opção desejada >>>> ");
			option = input.nextInt();

			if (option.equals(1)) {
				// Esse método retorna as vagas disponiveis.
				estacionamento.getEstacionamento();
			}

			if (option.equals(2)) {
				input.nextLine(); // Desbugar o scanner
				System.out.println("Digite a placa: ");
				placa = input.nextLine();
				System.out.println("Digite a marca: ");
				modelo = input.nextLine();
				// Esse método ocupa uma vaga.
				estacionamento.ocuparVaga(placa, modelo);
			}

			if (option.equals(3)) {
				input.nextLine();
				System.out.println("Digite o número da vaga: ");
				Integer vaga = input.nextInt();
				System.out.println("Digite o horario de saida: ");
				input.nextLine();
				String saida = input.nextLine();
				// Esse método desocupa uma vaga pelo número.
				estacionamento.desocuparVaga(vaga, saida, historico);
			}
			
			if (option.equals(4)) {
				Estacionamento.exibirHistorico(historico);
			}	
			
			if (option.equals(5)) {
				Estacionamento.definirValorPorHora();
			}
			
			if (option.equals(6)) {
				Estacionamento.fecharCaixaNoDia(historico);
			}

			if (option.equals(0)) {
				// Ao entrar aqui sai do if e chega no final do While.
				System.out.println("Saindo do sistema...");
				break;
			}
		} while (option != 0);

		input.close();
	}

}
