// comprobar si un número es multiplo de 10, se realiza al dividirlo por 10 y el resultado de la division es cero//
package compu_3b;

import java.util.Scanner;

public class D_MúltiplodeDiez {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int n = sc.nextInt();
		if (n %10==0) {
			System.out.println("Es múltiplo de 10.");
		}
		else {
			System.out.println("No es múltiplo de 10.");
		}
	}

}
