import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		int n1, n2, digitado;
		System.out.println("Determine o primeiro valor: ");
		n1 = tc.nextInt();
		System.out.println("Determine o segundo valor: ");
		n2 = tc.nextInt();
		System.out.println("Determine a opera��o que deseja realizar: 1)soma 2)subtra��o 3)multiplica��o 4)divis�o");
		digitado = tc.nextInt();

		switch (digitado) {
		case 1:
			System.out.println("Voc� escolheu a soma: " + (n1 + n2));
			break;
		case 2:
			System.out.println("Voc� escolheu a subtra��o: " + (n1 - n2));
			break;
		case 3:
			System.out.println("Voc� escolheu a multiplica��o: " + (n1 * n2));
			break;
		case 4:
			System.out.println("Voc� escolheu a divis�o: " + (n1 / n2));
			break;
		default:
			System.out.println("Op��o invalida...");

		}

	}

}
