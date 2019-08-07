import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a área a ser pintada(m²): ");
		int metrosQ = entrada.nextInt();
		int litrosNecessarios = metrosQ/6;
		
		int latasNecessarias = litrosNecessarios/18;
		if(litrosNecessarios %  18 > 0)
			latasNecessarias++;
		
		float precoLatas = latasNecessarias * 80;
		
		float galoesNecessarios = litrosNecessarios/3.6f;
//		if(litrosNecessarios %  3.6f > 0)
//			galoesNecessarios++;
		
		float precoGaloes = galoesNecessarios * 25;
		
		System.out.println("São necessárias " + latasNecessarias + " latas de tinta, totalizando R$" + precoLatas + " ou " + galoesNecessarios + " galoes, totalizando R$" + precoGaloes);
		
		entrada.close();

	}

}
