import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o raio do c�rculo: ");
		float raio = entrada.nextFloat();
		
		float area = 3.14f * (raio * raio);
		
		System.out.println("A �rea do c�rculo � " + area);
		
		entrada.close();
		

	}

}
