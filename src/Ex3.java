import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero: ");
		int num1 = entrada.nextInt();
		System.out.print("Informe o segundo n�mero: ");
		int num2 = entrada.nextInt();
		
		System.out.println("Soma: " + (num1 + num2));
		
		entrada.close();
	}

}
