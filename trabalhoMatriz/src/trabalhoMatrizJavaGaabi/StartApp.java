package trabalhoMatrizJavaGaabi;

import java.util.Scanner;

public class StartApp {
	
	static int tamanhoLinha = 10;
	static int tamanhoColuna = 20;
	static Scanner scan = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		char matriz [][] = new char [tamanhoLinha][tamanhoColuna];
		
		preencheMatriz1(matriz);
		imprimeEsteira(matriz);
		
		
		
		scan.close();
	}
	
	public static void preencheMatriz1 (char matriz [][]) {
		
		for (int i = 0; i < tamanhoLinha; i++) {
			
			for (int j = 0; j < tamanhoColuna; j++) {
				
				matriz [i][j] = '-';
				
			}
			
		}
		
		
	}
	
	public static void imprimeEsteira (char matriz [][]) {
		
		for (int i = 0; i < tamanhoLinha; i++) {
			
			for (int j = 0; j < tamanhoColuna; j++) {
				
				System.out.print(" " + matriz [i][j] + " " );
				
			}
			
			System.out.println(" ");
		}
		
		
	}
	
	public static void passaEsteira (char matriz [][]) {
		
		
		
		
	}
}
