import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		int n1, n2, digitado;
		System.out.println("Determine o primeiro valor: ");
		n1 = tc.nextInt();
		System.out.println("Determine o segundo valor: ");
		n2 = tc.nextInt();
		System.out.println("Determine a operação que deseja realizar: 1)soma 2)subtração 3)multiplicação 4)divisão");
		digitado = tc.nextInt();

		switch (digitado) {
		case 1:
			System.out.println("Você escolheu a soma: " + (n1 + n2));
			break;
		case 2:
			System.out.println("Você escolheu a subtração: " + (n1 - n2));
			break;
		case 3:
			System.out.println("Você escolheu a multiplicação: " + (n1 * n2));
			break;
		case 4:
			System.out.println("Você escolheu a divisão: " + (n1 / n2));
			break;
		default:
			System.out.println("Opção invalida...");

		}

	}

}
