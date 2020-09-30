package trabalhoMatrizJavaGaabi;

import java.util.Scanner;

public class StartApp {
	
	static int pos = 0;
	static int tamanhoLinha = 10;
	static int tamanhoColuna = 20;
	static Scanner scan = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		String matriz [][] = new String [tamanhoLinha][tamanhoColuna];
		
		preencheMatriz1(matriz);
		imprimeEsteira(matriz);
		passaEsteira(matriz);
		
		
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
	
	public static void passaEsteira (String matriz [][]) {
		
		for (int i = 0; i < tamanhoLinha; i++) {
			
			for (int j = 0; j < tamanhoColuna; j++) {
				
				String enter = scan.nextLine();				
				
				if (enter.equals("")) {
					
					if (j < 7) {
					
						imprimeFase("A",matriz, i,j);

					}else if (j < 11) {					
					
						imprimeFase("B",matriz, i,j);

			
					}else if (j < 16) {	
											
						imprimeFase("C",matriz, i,j);

				
					}else {
					
						imprimeFase("D",matriz, i,j);

					
					}
					
				
					
				}
				
			}
					
		}
		
	}		

	public static void imprimeFase (String letra, String matriz [][], int i, int j) {
		
		System.out.println("Você está na fase: " + letra + ", e na esteira " + (j+1));
		matriz [i][j] = letra;
		imprimeEsteira(matriz);
		matriz [i][j] = "-";
		
	}

	




}

