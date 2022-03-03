import java.util.Scanner;

public class MediaV {
	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		{

			int a[], total = 0, i;
			double media = 0;
			a = new int[10];

			for (i = 0; i < 10; i++) {
				System.out.println("Digite " + (i + 1) + " valore inteiro");
				a[i] = digite.nextInt();
				total += a[i];
				media = total / 10;
			}
			System.out.print("\n Valores [ ");
			for (i = 0; i < 10; i++) {
				System.out.print(a[i] + " ");
			}
			digite.close();

			System.out.print("] ");
			System.out.print("A média é " + media + "%");
		}
	}
}
