import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor recebido por hora: ");
		float valorHora = entrada.nextFloat();
		System.out.print("Informe a quantidade total de horas trabalhadas neste mês: ");
		int horasTrabalhadas = entrada.nextInt();
		
		float salario = valorHora * horasTrabalhadas;
		
		System.out.println("Salrio : R$" + salario);
		
		entrada.close();
		
	}

}
