package trabalhoMatrizJavaGaabi;

import java.util.Scanner;

public class StartApp {
	
	static int pos = 0;
	static int tamanhoLinha = 10;
	static int tamanhoColuna = 20;
	static int a = 2;
	static int b = 2;
	static int c = 3;
	static int d = 4;
	static int dolar = 50; 
	
	static Scanner scan = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		String matriz [][] = new String [tamanhoLinha][tamanhoColuna];
		
		
		preencheMatriz1(matriz);
		imprimeEsteira(matriz);
		logicaEsteira(matriz);
		int saldo = resultadoFinal();
		System.out.println("O saldo final é de: " + saldo);
		
		scan.close();
	}
	
	public static void preencheMatriz1 (String matriz [][]) {
		
		for (int i = 0; i < tamanhoLinha; i++) {
			
			for (int j = 0; j < tamanhoColuna; j++) {
				
				matriz [i][j] = "-";
				
			}
			
		}
		
		
	}
	
	public static void imprimeEsteira (String matriz [][]) {
		
		for (int i = 0; i < tamanhoLinha; i++) {
			
			for (int j = 0; j < tamanhoColuna; j++) {
				
				System.out.print(" " + matriz [i][j] + " " );
				
			}
			
			System.out.println(" ");
		}
		
		
	}
	
	public static void logicaEsteira (String matriz [][]) {
		
		
			
		for (int i = 0; i < tamanhoLinha; i++) {
			
			for (int j = 0; j < tamanhoColuna; j++) {
				
				
				String enter = scan.nextLine();				
				
				if (enter.equals("")) {
					
					if (j < 6) {
					
						imprimeFase("A",matriz, i,j);

					}else if (j < 11) {					
					
						imprimeFase("B",matriz, i,j);

			
					}else if (j < 16) {	
											
						imprimeFase("C",matriz, i,j);

				
					}else if (j < 19){
					
						imprimeFase("D",matriz, i,j);

					
					}if (j == 19) {
						
						matriz[i][j] = "$";
						imprimeEsteira(matriz);
						
					}
										
				}
				
										
			}
				
		imprimeResults();
			
		a = a + 1;
		b += 2;
		c += 3;
		d += 4;
		dolar += 50; 
		
		
		}
		
		
	}		

	public static void imprimeFase (String letra, String matriz [][], int i, int j) {
		
		System.out.println("Você está na fase: " + letra + ", e na esteira " + (i+1));
		matriz [i][j] = letra;
		imprimeEsteira(matriz);
		matriz [i][j] = "-";
		
	}

	public static void imprimeResults () {
		
		System.out.println("Valor de A: " + a);
		System.out.println("Valor de B: " + b);
		System.out.println("Valor de C: " + c);
		System.out.println("Valor de D: " + d);
		System.out.println("Valor de $: " + dolar);
			
	}
	
	public static int resultadoFinal () {
		
		int result = (2*a)+(3*b)+c+(d/2)+(dolar/10);
		
		return result;
	}
}

