import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o peso pescado: ");
		float pesoDePeixes = entrada.nextFloat();
		float excesso = 0;
		float multa = 0;
		
		if(pesoDePeixes > 50) {
			excesso = pesoDePeixes -50;
			multa = excesso * 4;
		}
		
		System.out.println("Excesso: " + excesso);
		System.out.println("Multa: " + multa);
		
		entrada.close();

	}

}
