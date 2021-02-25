package controller;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercicios_Ativ_01 {
	
	public Exercicios_Ativ_01() {
		super();
	}
	
	public void exerc01() {		
		
		System.out.println("Exercício 1\n");
		
		double saldos[] = new double[100];
		double range[] = new double[100];
		double negativos[] = new double[100];
		
		double totalSaldos = 0, totalNegativos = 0, totalRange = 0;
		int qtdNegativos = 0,qtdRange = 0;
		
		for (int i = 0; i < 100 ; i++) {
			saldos[(int) i] = ((Math.random() * (2000 + 2000)) -2000);
			
			if (saldos[(int) i] >= 100 & saldos[(int) i] <= 1000) {
				range[qtdRange] = saldos[(int) i];
				qtdRange++;
			}
			
			if (saldos[(int) i] < 0) {
				negativos[qtdNegativos] = saldos[(int) i];
				qtdNegativos++;
			}
		}
		
		for (int j = 0; j < 100 ; j++) {
			totalSaldos = totalSaldos + saldos[(int) j];
			totalRange = totalRange + range[ (int) j];
			totalNegativos = totalNegativos + negativos[ (int) j];
		}

		System.out.println("Média de saldos postivos entre 100 a 1000 é: "+ (totalRange / qtdRange));
		System.out.println("Média geral dos saldos é: "+ (totalSaldos / 100));
		System.out.println("Soma dos saldos negativos é: "+ totalNegativos);
		
	    
	}
	
	public void exerc02() {
		
		System.out.println("Exercício 2\n");
		
		int numeros[] = new int[5];
		BigInteger fat[] = new BigInteger[5];
		
		for (int i = 0; i < 5 ; i++) {
			numeros[i] = (int) ((Math.random() * (100 + 0)) + 0);
			if (numeros[i] == 0) {
				fat[i] = BigInteger.valueOf(1);
			} else {
				fat[i] = calcFatorial(numeros[i]);	
			}
		}

		System.out.println("Dados do vetor com números em fatorial");
		
		for (int j = 0; j < 5 ; j++) {
			System.out.println("Número: "+ numeros[j] + " - Fatorado: "+ fat[j]);
		}
		
	}
	
	public void exerc03() {
		
		System.out.println("Exercício 3\n");
		
		int numeros[] = new int[100];
		
		for (int i = 0; i < 100 ; i++) {
			numeros[i] = (int) ((Math.random() * (1000 + 1000)) - 1000);
		}
		
	    for(int i = 0; i < numeros.length - 1; i++) {
		      for(int j = 0; j < numeros.length - 1 - i; j++) {
		        if(numeros[j] > numeros[j + 1]) {
		          int aux = numeros[j];
		          numeros[j] = numeros[j + 1];
		          numeros[j + 1] = aux;
		        }
		      }
	    }
	    
		System.out.println("Vetor em ordem crescente: ");
	    
		for (int k = 0; k < 100 ; k++) {
			System.out.println(numeros[k]);
		}

	}
	
	public void exerc04() {
		
		System.out.println("Exercício 4\n");
		
		int matriz[][] = new int[4][4];
		
		int qtdRangeI = 0, qtdRangeJ = 0, maiorNum = 0, somaRange = 0, qtdImpRange = 0, qtdDivOito = 0, qtdImpTres = 0;
		BigInteger maiorFat;
		
		for (int i = 0 ; i < 4 ; i++) {
			for (int j = 0 ; j < 4 ; j++) {
				
				matriz[i][j] = (int) Math.round((Math.random() * (200 - 0)) + 0);

				if(matriz[i][j] > maiorNum) {
					maiorNum = matriz[i][j];
				}
				
				if ((matriz[i][j] % 2) != 0 & (matriz[i][j] % 3) == 0) {
					if(qtdRangeJ == 5) {
						qtdRangeI++;
						qtdRangeJ = 0;
					} else {
						qtdImpTres++;
						qtdRangeJ++;
					}
				}
				
				if ((matriz[i][j] % 8) == 0) {
					if(qtdRangeJ == 5) {
						qtdRangeI++;
						qtdRangeJ = 0;
					} else {
						qtdDivOito++;
						qtdRangeJ++;
					}
				}
				
				if (matriz[i][j] >= 30 & matriz[i][j] <= 50 & (matriz[i][j] % 2) != 0) {
					if(qtdRangeJ == 5) {
						qtdRangeI++;
						qtdRangeJ = 0;
					} else {
						qtdImpRange++;
						qtdRangeJ++;
					}
				}
				
				if (matriz[i][j] >= 1 & matriz[i][j] <= 100) {
					if(qtdRangeJ == 5) {
						qtdRangeI++;
						qtdRangeJ = 0;
					} else {
						somaRange = matriz[i][j] + somaRange;
						qtdRangeJ++;
					}
				}
			}
		}
		
		if (maiorNum == 0) {
			maiorFat = BigInteger.valueOf(1);
		} else {
			maiorFat = calcFatorial(maiorNum);
		}
		
		System.out.println("Soma dos valores no intervalo de 1 a 100 é: "+ somaRange);
		System.out.println("Quantidade de números impares entre 30 a 50 é: "+ qtdImpRange);
		System.out.println("Quantidade de números divisiveis por 8: "+ qtdDivOito);
		System.out.println("Quantidade de números impares divisiveis por 3: "+ qtdImpTres);
		System.out.println("Fatorial do maior número informado na matriz: "+ maiorFat);
		
	}
	
	public void exerc05() {
		
		System.out.println("Exercício 5\n");
		
		Scanner sc= new Scanner(System.in);
		
		int matriz[][] = new int[4][4];
		int j = 0, num = 1;
		
		for (int i = 0 ; i < 4 ; i++) {
				matriz[i][j] = num;
				num = num * 3;
				j++;
		}
		
		for (int i = 0 ; i < 4 ; i++) {
			for (j = 0 ; j < 4 ; j++) {
				if (matriz[i][j] == 0) {
					System.out.print("Digite o número da casa ["+i+"] ["+j+"] da matriz: ");  
					matriz[i][j]= sc.nextInt(); 
				}
			}
		}

		System.out.println("\n\nGráfico da matriz completa:\n");
		
		for (int i = 0 ; i < 4 ; i++) {
			System.out.println(matriz[i][0] +" - "+ matriz[i][1] +" - "+ matriz[i][2] +" - "+ matriz[i][3]);
		}
		
	}
	
	public void exerc06() {
		
		System.out.println("Exercício 6\n");
		
		Scanner sc= new Scanner(System.in);
		int num;
		
		System.out.print("Digite um número para fazer o fatorial recursivo: ");  
		num= sc.nextInt(); 

		System.out.println(recFat06(num));

	}
	
	public void exerc07() {
		
		System.out.println("Exercício 7\n");
		System.out.println("A soma de todos os números de 1 a 100 recursivamente é: " + somaNum07(1));
	}
	
	public void exerc08() {
		
		System.out.println("Exercício 8\n");
		System.out.println("A soma de todos os números pares de 1 a 200 recursivamente é: " + somaPar08(1));
		}
	
	public void exerc09() {
		
		System.out.println("Exercício 9\n");
		System.out.println("A soma de todos os números impares de 1 a 300 recursivamente é: " + somaImpar09(1));
	}
	
	public void exerc10() {
		
		System.out.println("Exercício 10\n");
		System.out.println("Sequência de fibonacci até o número é: " + fiboRec10(55));
	}
	
	public void exerc11() {
		
		System.out.println("Exercício 11\n");
	}
	
	
	
	public static BigInteger recFat06 (int num) {
		BigInteger fac = BigInteger.ONE;
		BigInteger facNum = BigInteger.valueOf(num);
		if (num == 0) {
			return fac;
		} else {
			return facNum.multiply(recFat06(num-1));
		}
	}
	
	public static int somaNum07 (int num) {
		
		while (num != 101) {
			return num + (somaNum07(num+1));
		}
		return 0;
	}
	
	public static int somaPar08 (int num) {
		
		while (num != 201) {
			if ( num % 2 == 0 ) {
				return num + (somaPar08(num+1));
			} else {
				return somaPar08(num+1);				
			}
		}
		return 0;
	}
	
	public static int somaImpar09 (int num) {
		
		while (num != 301) {
			if ( num % 2 != 0 ) {
				return num + (somaImpar09(num+1));
			} else {
				return somaImpar09(num+1);				
			}
		}
		return 0;
	}
	
	public static int fiboRec10 (int num) {
		int i = 1;	

		while ( i != num) {
				System.out.println(fiboRec10(i-1) + fiboRec10(i - 2));
				return fiboRec10(i-1) + fiboRec10(i - 2);				
			}
		return 0;
	}
	
	public static BigInteger calcFatorial(int numero) {
	    BigInteger fat = BigInteger.ONE;
	    if (numero == 0) {
	    	return BigInteger.valueOf(1);
	    }
	    for (int i = numero; i > 0; i--) {
	        fat = fat.multiply(BigInteger.valueOf(i));
	    }
	    return fat;
	}
}