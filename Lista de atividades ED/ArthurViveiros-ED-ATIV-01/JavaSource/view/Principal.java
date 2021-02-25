package view;

import controller.Exercicios_Ativ_01;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Exercicios_Ativ_01 Ativ01 = new Exercicios_Ativ_01();
		
		Scanner sc= new Scanner(System.in);
		int choose = 0;

		System.out.print("Arthur Viveiros - RA: 1110482012024\n"); 
		System.out.print("Atividade 01 - Estrutura de dados");
		
		do {
			System.out.println("\n\n----------------------------------------------------------------------");
			System.out.print("Caso você quiser encerrar o programa, digite 0\n");  
			System.out.print("Digite o número do exercício que você quer ver:");  
			System.out.println("\n----------------------------------------------------------------------");
			choose= sc.nextInt(); 

		
			switch(choose) {
			case 1: Ativ01.exerc01(); break;
			case 2: Ativ01.exerc02(); break;
			case 3: Ativ01.exerc03(); break;
			case 4: Ativ01.exerc04(); break;
			case 5: Ativ01.exerc05(); break;
			case 6: Ativ01.exerc06(); break;
			case 7: Ativ01.exerc07(); break;
			case 8: Ativ01.exerc08(); break;
			case 9: Ativ01.exerc09(); break;
			case 10: Ativ01.exerc10(); break;
			case 11: Ativ01.exerc11(); break;
			}
		} while(choose != 0);
	}
}
