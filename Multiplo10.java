package forDo;

public class Multiplo10 {

	public static void main(String[] args) {
		System.out.println("Multiplos de 10 de 1 a 100:");
        for (int i = 1; i <= 100; i++) {
        	System.out.println(i);
            if (i % 10 == 0) {
                System.out.print(i);
                
                System.out.println(" Multiplo de 10");
            }

        }

	}
}
