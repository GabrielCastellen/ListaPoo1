import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor recebido por hora: ");
		float valorHora = entrada.nextFloat();
		System.out.print("Informe a quantidade total de horas trabalhadas neste m�s: ");
		int horasTrabalhadas = entrada.nextInt();
		
		float salarioBruto = valorHora * horasTrabalhadas;
		float IR = salarioBruto * 0.11f;
		float INSS = salarioBruto * 0.08f;
		float sindicato = salarioBruto * 0.05f;
		float salarioLiq = salarioBruto - IR - INSS - sindicato;
		
		System.out.println("Sal�rio bruto: R$ " + salarioBruto);
		System.out.println("IR(11%): R$" + IR);
		System.out.println("INSS(8%): R$" + INSS);
		System.out.println("Sindicato(5%): R$" + sindicato);
		System.out.println("Sal�rio L�quido: " + salarioLiq);
		
		
		entrada.close();

	}

}
