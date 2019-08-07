import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Farenheit: ");
		float temperaturaF = entrada.nextFloat();
		float temperaturaC = (temperaturaF - 32) / 1.8f;
		
		System.out.println("Temperarura em graus Ceusius: " + temperaturaC);
		
		entrada.close();
	}

}
