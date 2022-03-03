import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		Scanner Digite = new Scanner(System.in);

		int a[], b[], c[], i;
		a = new int[10];
		b = new int[10];
		c = new int[10];

		for (i = 0; i <=9; i++) {
			System.out.println("Digite o " + (i + 1) + " Valor de A");
			a[i] = Digite.nextInt();
		}

		for (i = 0; i <=9; i++) {
			System.out.println("Digite o " + (i + 1) + " valor de B");
			b[i] = Digite.nextInt();

		}

		System.out.print("A = [ ");
		for (i = 0; i <=9; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");

		System.out.print("B = [ ");
		for (i = 0; i <=9; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("]");

		System.out.print("C = [ ");
		for (i = 0; i <=9; i++) {
			c[i] = a[i] + b[i];
			System.out.print(c[i] + " ");
		}
		System.out.print("]");
	}
}
