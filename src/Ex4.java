import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a 1� nota: ");
		float nota1 = entrada.nextFloat();
		
		System.out.print("Informe a 2� nota: ");
		float nota2 = entrada.nextFloat();
		
		System.out.print("Informe a 3� nota: ");
		float nota3 = entrada.nextFloat();
		
		System.out.print("Informe a 4� nota: ");
		float nota4 = entrada.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("M�dia: " + media);
		
		entrada.close();

	}

}
