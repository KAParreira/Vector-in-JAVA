import java.util.Scanner;

public class Inverso {
	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		{

			int i, ii, a[], b[];
			a = new int[10];
			b = new int[10];

			ii = 9;
			for (i = 0; i < 10; i++) {
				System.out.println("Digite o " + (i + 1) + " elemento do vetor");
				a[i] = digite.nextInt();
				b[ii] = a[i];
				ii--;
			}

			System.out.print("\n vetor A [ ");
			for (i = 0; i < 10; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.print("] ");

			System.out.print("\n vetor B [ ");
			for (i = 0; i < 10; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.print("] ");
			digite.close();
		}
	}
}
