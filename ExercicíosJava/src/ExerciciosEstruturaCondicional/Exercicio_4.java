package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
		sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração 
		mínima de 1 hora e máxima de 24 horas.*/ 
		int horaInicio, horaFim, soma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a hora que o jogo começou (0 até 23)");
		horaInicio = sc.nextInt();
		System.out.println("Insira a hora que o jogo terminou (0 até 23)");
		horaFim = sc.nextInt();
		if(horaInicio == horaFim) {
			soma = 24;
		}
		else if(horaInicio > horaFim) {
			soma = 24 - horaInicio + horaFim;
		}
		else {
			soma = horaFim - horaInicio;
		}
		System.out.printf("O jogo durou %d horas", soma);
		
		sc.close();
		
		
	}

}
