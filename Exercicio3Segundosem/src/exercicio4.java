import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int binario;
		System.out.print("Informe o número binário: ");
		binario = in.nextInt();
		
		int[] calc = {1,2,4,8,16,32,64,128};
		
		int soma = 0;
		
		int x = 0;
		
		calculadora(binario, calc, soma, x);
		System.out.print(calculadora(binario, calc, soma, x));}
		
		public static int calculadora(int binario, int[] calc, int soma, int x) {
			
			if( x == 8) {
				return soma;
			} else {
				if((binario % 10) == 1) {
					soma += calc[x];
					binario /= 10;
					return calculadora(binario, calc, soma, x+1);
				} else {
					binario /= 10;
					return calculadora(binario, calc, soma, x+1);
				}
			}
	
		}
	}
	


