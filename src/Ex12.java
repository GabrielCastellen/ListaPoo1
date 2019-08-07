import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a sua altura: ");
		float h = entrada.nextFloat();
		
		System.out.println("Peso ideal caso homem: " + ((72.7*h) - 58) + ("kg"));
		
		System.out.println("Peso ideal caso mulher: " + ((62.1*h) - 44.7 ) + ("kg"));
		
		entrada.close();

	}

}
