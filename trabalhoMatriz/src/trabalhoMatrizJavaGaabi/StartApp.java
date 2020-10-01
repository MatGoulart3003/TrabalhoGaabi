package trabalhoMatrizJavaGaabi;

import java.util.Scanner;

public class StartApp {
	
	//declarando variaveis globais
	static int pos = 0;
	static int tamanhoLinha = 10;
	static int tamanhoColuna = 20;
	static int a = 2;
	static int b = 2;
	static int c = 3;
	static int d = 4;
	static int dolar = 50; 
	
	//declarando o scanner, no C++ vc só precisa escrever scanf, no java eu tenho q puxar esse new scanner
	static Scanner scan = new Scanner (System.in);
	
	//método main
	public static void main(String[] args) {
		
		//declarando a matriz
		String matriz [][] = new String [tamanhoLinha][tamanhoColuna];
		
		//metodo pra preencher a matriz com "-", uso um for nesse metodo
		preencheMatriz1(matriz);
		//metodo q chama e imprime a matriz preenchida
		imprimeEsteira(matriz);
		//aqui ta toda a logica de como o programa roda
		logicaEsteira(matriz);
		// variavel q recebe o calculo do saldo final, depois q a esteira toda rodar
		int saldo = resultadoFinal();
		
		//mostra o saldo final
		System.out.println("O saldo final é de: " + saldo);
		
		//aqui eu tenho q fechar o scanner q eu puxei la em cima, por isso essa linha scan.close()
		scan.close();
	}
	
	//esse metodo é q eu puxei la na main pra preencher a matriz
	public static void preencheMatriz1 (String matriz [][]) {
		
		for (int i = 0; i < tamanhoLinha; i++) {
			
			for (int j = 0; j < tamanhoColuna; j++) {
				
				matriz [i][j] = "-";
				
			}
			
		}
		
		
	}
	
	//esse metodo q faz a impressao da esteira preenchida, ela sera chamada toda vez q a gente apertar enter
	public static void imprimeEsteira (String matriz [][]) {
		
		for (int i = 0; i < tamanhoLinha; i++) {
			
			for (int j = 0; j < tamanhoColuna; j++) {
				
				System.out.print(" " + matriz [i][j] + " " );
				
			}
			
			System.out.println(" ");
		}
		
		
	}
	
	//aqui ta toda a logica de apertar enter, o produto avançar na esteira e mudar de letra nas fases, alem de fazer as contas do saldo q aparecerão em meio a esteira rodando	
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
	
	//esse trexo eu usei pra não ter q ficar digitando essas linhas toda hora no metodo da logica da esteira	
	public static void imprimeFase (String letra, String matriz [][], int i, int j) {
		
		System.out.println("Você está na fase: " + letra + ", e na esteira " + (i+1));
		matriz [i][j] = letra;
		imprimeEsteira(matriz);
		matriz [i][j] = "-";
		
	}
	
	//esse metodo é pra imprimir os resultados das contas enquanto a esteira estiver rodando 
	public static void imprimeResults () {
		
		System.out.println("Valor de A: " + a);
		System.out.println("Valor de B: " + b);
		System.out.println("Valor de C: " + c);
		System.out.println("Valor de D: " + d);
		System.out.println("Valor de $: " + dolar);
			
	}
	
	// esse metodo apenas calcula a formula final do saldo, q aparece no final do programa
	public static int resultadoFinal () {
		
		int result = (2*a)+(3*b)+c+(d/2)+(dolar/10);
		
		return result;
	}

	// e é isso, vc vai conseguir fazer isso em char, diferente de mim, pq o java me limita a fazer essa logica em string
}

