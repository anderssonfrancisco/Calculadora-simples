import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		
		System.out.println("CALCULADORA SIMPLES");
		
		int opcao;
		do {
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Dividir");
			System.out.println("4 - Multiplicar");
			System.out.println("0 para SAIR");
			System.out.println("O que você quer fazer?");
			
			Scanner scanner = new Scanner(System.in);
			opcao = scanner.nextInt();
			
			processo(opcao);
		}while(opcao !=0);
		
	}
	
	public static void processo(int opcao) {
		switch(opcao) {
		case 1:{
			Scanner scanner = new Scanner(System.in);
			System.out.println("SOMANDO DOIS NUMEROS:");
			System.out.print("Digite o primeiro numero: ");
			int num1 = scanner.nextInt();
			System.out.print("Digite o segundo numero: ");
			int num2 = scanner.nextInt();
			int soma = num1 + num2;
			System.out.print("O resultado da soma é: " + soma);
			
			break;
		}
	    case 2:{
	    	Scanner scanner = new Scanner(System.in);
			System.out.println("SUBTRAINDO UM NUMERO:");
			System.out.print("Digite o primeiro numero: ");
			int num1 = scanner.nextInt();
			System.out.print("Digite o segundo numero: ");
			int num2 = scanner.nextInt();
			int sub = num1 - num2;
			System.out.print("O resultado da subtração é: " + sub);
			
			break;
	    }
		case 3:{
			Scanner scanner = new Scanner(System.in);
			System.out.println("DIVIDINDO UM NUMERO:");
			System.out.print("Digite o primeiro numero: ");
			double num1 = scanner.nextInt();
			System.out.print("Digite o segundo numero: ");
			double num2 = scanner.nextInt();
			
			if(num1 == 0 || num2 == 0){
				System.out.println("Impossivel dividir por 0");
			} else {
				double divisao = num1 / num2;
				System.out.print("O resultado da divisão é: " + divisao);
			}
			break;
		}
		case 4:{
			Scanner scanner = new Scanner(System.in);
			System.out.println("MULTIPLICANDO UM NUMERO:");
			System.out.print("Digite o primeiro numero: ");
			int num1 = scanner.nextInt();
			System.out.print("Digite o segundo numero: ");
			int num2 = scanner.nextInt();
			int mult = num1 * num2;
			System.out.print("O resultado da multiplicação é: " + mult);
			
			break;
		}
			
		}
	}

}
