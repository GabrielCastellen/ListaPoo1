import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		int num = entrada.nextInt();
		System.out.println("O n�mero informado foi " + num);
		
		entrada.close();
	}

}
