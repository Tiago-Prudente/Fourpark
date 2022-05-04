package br.com.fourpark.project;

import java.util.Scanner;

import br.com.fourpark.project.objects.Estacionamento;

public class Main {

	public static void main(String[] args) {
		Integer option = -1;
		Scanner input = new Scanner(System.in);
		Estacionamento estacionamento = new Estacionamento();
		
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
				estacionamento.getEstacionamento();
			}
			
			if (option.equals(0)) {
				System.out.println("Saindo do sistema...");
				break;
			}
		} while (option != 0);
		
		input.close();
	}

}
