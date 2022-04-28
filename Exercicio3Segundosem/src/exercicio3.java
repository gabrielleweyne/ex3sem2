import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		int binario;
		System.out.print("Informe o número binário: ");
		binario = in.nextInt();
		
		int[] calc = {1,2,4,8,16,32,64,128};
		
		int soma = 0;
		
		calculadora(binario, calc, soma);}
		
		public static void calculadora(int binario, int[] calc, int soma) {
		for(int i = 0; i < 8; i++) {
			if((binario % 10) == 1) {
				soma += calc[i];
				binario /= 10;
			}else {
				binario /= 10;
			}
			
		}
		System.out.print(soma);
		}
	}




