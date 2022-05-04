package br.com.fourpark.project;

import java.util.Scanner;

import br.com.fourpark.project.objects.Estacionamento;

public class Main {

	public static void main(String[] args) {
		Integer option = -1;
		Scanner input = new Scanner(System.in);
		Estacionamento estacionamento = new Estacionamento();
		String placa, modelo;
		
		// Esse método cria o estacionamento com as 50 vagas.
		estacionamento.setEstacionamento();
		
		do {
			System.out.println("---------- FOUR PARK MANAGEMENT SYSTEM ----------");
			System.out.println("Digite a opção desejada: ");
			System.out.println("1 - Listar vagas");
			System.out.println("2 - Entrada de veículo");
			System.out.println("3 - Saida de veículo");
			System.out.println("0 - Sair do sistema");
			System.out.print("Digite a opção desejada >>>> ");
			option = input.nextInt();
			
			if (option.equals(1)) {
				// Esse método retorna as vagas disponiveis.
				estacionamento.getEstacionamento();
			}	
			
			if (option.equals(2)) {
				input.nextLine();
				System.out.println("Digite a placa: ");
				placa = input.nextLine();
				System.out.println("Digite a marca: ");
				modelo = input.nextLine();
				estacionamento.ocuparVaga(placa, modelo);
			}
			
			if (option.equals(3)) {
				input.nextLine();
				System.out.println("Digite o número da vaga: ");
				Integer vaga = input.nextInt();
				estacionamento.desocuparVaga(vaga);
			}
			
			if (option.equals(0)) {
				System.out.println("Saindo do sistema...");
				break;
			}
		} while (option != 0);
		
		input.close();
	}

}
