package Exercicio_1;

import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		/*Fazer um programa para ler os valores da largura e altura de um ret�ngulo. Em
		 seguida, mostrar na tela o valor de sua �rea, per�metro e diagonal. Usar uma
		 classe como mostrado no projeto ao lado.
		  	 Rectangle 
		 --------------------
		 - Width: double
		 - Height: double
		 --------------------
		 - Area(): double
		 - Perimeter(): double
		 - Diagonal(): double
		 */
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter width");
		rectangle.width = sc.nextDouble();
		System.out.println("Enter height");
		rectangle.height = sc.nextDouble();
		System.out.println(rectangle);
		sc.close();
		

	}

}
