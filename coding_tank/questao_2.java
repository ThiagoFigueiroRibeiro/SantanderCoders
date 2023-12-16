import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		double C,F,K = 0.;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Digite a temperatura:");
		double temp = keyboard.nextDouble();

		keyboard.nextLine();

		System.out.println("Digite a unidade de temperatura input: C, K ou F");
		String tempIn = keyboard.nextLine();
		if (!"C".equals(tempIn)&&!"K".equals(tempIn)&&!"F".equals(tempIn)){
			System.out.println("A entrada especificada não é válida.");
			return;
		}

		System.out.println("Digite a unidade temperatura output: C, K ou F");
		String tempOut = keyboard.nextLine();
		if (!"C".equals(tempIn)&&!"K".equals(tempIn)&&!"F".equals(tempIn)){
			System.out.println("A entrada especificada não é válida.");
			return;
		}

	if("C".equals(tempIn) && "C".equals(tempOut) ){
		System.out.println(temp + " C" + " = " + temp + " C");
	}

	if("K".equals(tempIn) && "K".equals(tempOut) ){
		System.out.println(temp + " K" + " = " + temp + " K");
	}

	if("F".equals(tempIn) && "F".equals(tempOut) ){
		System.out.println(temp + " F" + " = " + temp + " F");
	}

	if("C".equals(tempIn) && "K".equals(tempOut) ){
		K = 273.15 + temp;
		System.out.println(temp + " C" + " = " + K + " K");
	}

	if("C".equals(tempIn) && "F".equals(tempOut) ){
		F = (temp * 9 / 5) + 32 ;
		System.out.println(temp + " C" + " = " + F + " F");
	}

	if("F".equals(tempIn) && "C".equals(tempOut) ){
		C = (temp - 32) * 5 / 9;
		System.out.println(temp + " F" + " = " + C + " C");
	}

	if("F".equals(tempIn) && "K".equals(tempOut) ){
		K = 273.15 + (temp - 32) * 5 / 9 ;
		System.out.println(temp + " F" + " = " + K + " K");
	}

	if("K".equals(tempIn) && "C".equals(tempOut) ){
		C = temp - 273.15;
		System.out.println(temp + " K" + " = " + C + " C");
	}

	if("K".equals(tempIn) && "F".equals(tempOut) ){
		F = ((temp - 273.15) * 9 / 5) + 32 ;
		System.out.println(temp + " F" + " = " + F + " F");
	}

	}
}
