import java.util.Scanner;

public class Quadrado {
	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		{

			final int TAM = 10;
			int a[], b[], i;
			a = new int[TAM];
			b = new int[TAM];

			for (i = 0; i < TAM; i++) {
				System.out.println("Informe o " + (i + 1) + " valor de A");
				a[i] = digite.nextInt();
				b[i] = a[i] * a[i];
			}

			System.out.print("\nB = ");
			for (i = 0; i < TAM; i++) {

				System.out.print(b[i] + " ");
			}
			digite.close();
		}
	}

}
