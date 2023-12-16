import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite altura do triângulo: ");
        int altura = scanner.nextInt();

        for (int i= 1; i <=altura; i++) {
			System.out.println();

            for (int j =1; j<=altura-i; j++) {
                System.out.print(" ");
			}

            for (int k = 1; k<= 2*i-1;k++) {
                System.out.print("*");
			}
        }

        for (int i= altura; i >=1; i--) {
			System.out.println();

            for (int j =altura-i; j>=1; j--) {
                System.out.print(" ");
			}

            for (int k = 2*i-1; k>=1 ;k--) {
                System.out.print("*");
			}
        }

        }

	}