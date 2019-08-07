import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a medida(em metros): ");
		float medidaM = entrada.nextFloat();
		float medidaC = medidaM * 100;
		
		System.out.println("O valor " + medidaM + " em centímetros é " + medidaC);
		
		entrada.close();

	}

}
