import java.util.Scanner;

public class Prova2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int i, a[], b[];
		a = new int[20];
		for (i = 1; i < 20; i++) {
			System.out.print("Digite o " + (i + 1) + "elemento");
            a [i] = in.nextInt();    
		}
	}
}