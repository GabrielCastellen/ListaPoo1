import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a �rea a ser pintada(m�): ");
		int metrosQ = entrada.nextInt();
		int litrosNecessarios = metrosQ/3;
		int latasNecessarias = litrosNecessarios/18;
		if(litrosNecessarios %  18 > 0)
			latasNecessarias++;
		
		float precoTotal = latasNecessarias * 80;
		
		System.out.println("S�o necess�rias " + latasNecessarias + " latas de tinta, totalizando R$" + precoTotal);

		
		entrada.close();

	}

}
