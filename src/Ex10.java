import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um n�mero inteiro: ");
		int numInt1 = entrada.nextInt();
		System.out.print("Informe outro n�mero inteiro: ");
		int numInt2 = entrada.nextInt();
		System.out.print("Informe um n�mero real: ");
		float numReal = entrada.nextFloat();
		
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + (numInt1 *2) * (numInt2 /2));
		System.out.println("A soma do triplo do primeiro com o terceiro: " + ((numInt1 * 3) + (numReal)));
		System.out.println("O terceiro elevado ao cubo: " + (numReal * numReal * numReal));
		
		entrada.close();
		
	}

}
