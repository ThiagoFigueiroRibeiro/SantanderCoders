import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
    
	//• o valor de um empréstimo;
		System.out.println("Digite o valor do empréstimo:");
		double total_saldo_devedor = keyboard.nextDouble();
		keyboard.nextLine();
		double saldo_inicial = total_saldo_devedor;

    //• a taxa de juros do empréstimo; 
		System.out.println("Digite a taxa de juros:");
		double juros_ao_mes = keyboard.nextDouble();
		juros_ao_mes=juros_ao_mes/100.;
		keyboard.nextLine();

    //• o tempo para pagamento.
		System.out.println("Digite o tempo de pagamento:");
		int total_de_meses = keyboard.nextInt();
		keyboard.nextLine();
		
		double saldo_devedor_atual = total_saldo_devedor;
		double amortizacao = total_saldo_devedor / total_de_meses;
		double juros_mensal = saldo_devedor_atual * juros_ao_mes;
		double parcela_mensal = juros_mensal + amortizacao;
		double somaJuros = 0;

		System.out.println("Valor fixo da amortização R$ "+ amortizacao + ", Saldo devedor total R$ " + saldo_devedor_atual + " com um juros de " + 100*juros_ao_mes + "% ao mês");
		for (int i = 1;i<=total_de_meses;i++){
			juros_mensal = saldo_devedor_atual * juros_ao_mes;
			somaJuros = somaJuros + juros_mensal;
			saldo_devedor_atual = saldo_devedor_atual - amortizacao;
			total_saldo_devedor = total_saldo_devedor - amortizacao;
			System.out.println("Parcela " + i + "| Juros: " + juros_mensal + "| Prestação " + (juros_mensal + amortizacao) + "| Saldo Devedor: " + total_saldo_devedor );
		}

		System.out.println("Total: Prestação R$ "+ (saldo_inicial+somaJuros) +", Juros R$ "+ somaJuros + ", Amortização R$ "+ saldo_inicial);
	}
}
