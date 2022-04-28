import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		int [] vetor = new int[10];
		int soma = 0;
		
		preencher(vetor);
		soma = calcular(vetor, soma);
		
		System.out.println("Soma dos valores armazenados: "+ soma);
	}

	public static int[] preencher(int[] vetor) {
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.print("informe o valor "+ i +" a ser armazenado no array:");
			vetor[i] = in.nextInt();
		}
		return vetor;
	}
	
	public static int calcular(int[] vetor, int soma) {
		soma = vetor[0];
		for(int i = 1; i < 10; i++) {
			soma += vetor[i];
		}
		return soma;
	}
	
}
