import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int A, B, x, y;
		double C, z;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextDouble();
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextDouble();
		

		System.out.printf("Valor a pagar: R$%.2f", (double)B*C+(double)y*z);
		sc.close();
	}
}
