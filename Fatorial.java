package forDo;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Entre com um numero:");
			int n = ler.nextInt(), f = 1;

			for (int i = n; i > 0; i--) {
			    f *= i;
			}

			System.out.println("Fatorial de " + n + " = " + f);
		}

	}

}
