import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o raio do círculo: ");
		float raio = entrada.nextFloat();
		
		float area = 3.14f * (raio * raio);
		
		System.out.println("A área do círculo é " + area);
		
		entrada.close();
		

	}

}
