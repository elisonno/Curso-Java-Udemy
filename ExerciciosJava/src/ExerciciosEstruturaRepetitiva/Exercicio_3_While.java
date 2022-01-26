package ExerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio_3_While {

	public static void main(String[] args) {
		/*Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva
		um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel 4.Fim). 
		Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido). 
		O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e 
		a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme exemplo.*/
		int tipoCombustivel = 0, alcool = 0, gasolina = 0, diesel = 0;
		Scanner sc = new Scanner(System.in);
		while(tipoCombustivel != 4) {
			System.out.printf("Qual o tipo de combustivel desejado?\n"
					+ "1 - �lcool\n"
					+ "2 - Gasolina\n"
					+ "3 - Diesel\n"
					+ "4 - Para sair\n");
			tipoCombustivel = sc.nextInt();
			switch(tipoCombustivel) {
				case 1: alcool++;
					break;
				case 2: gasolina++;
					break;
				case 3: diesel++;
					break;
				case 4: System.out.println("Muito Obrigado");
					break;
				default: System.out.println("C�digo invalido, selecione uma op��o v�lida");
					break;					
			}
		}
			System.out.printf("Lista dos produtos abastecidos pelos clientes:\n"
					+ "�lcool: %d clientes\n"
					+ "Gasolina: %d clientes\n"
					+ "Diesel: %d clientes\n", alcool, gasolina, diesel);
		sc.close();

	}

}
