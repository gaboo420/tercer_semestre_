/*codigo qye solicite dos números pero que si son iguales se termina el bucle*/
package compu_3b;

import java.util.Scanner;

public class K_DoWhile3 {

		public static void main(String[] args) 
		{
			int m;
			int n;
			Scanner sc = new Scanner(System.in);
			do 
			{
			System.out.println("Ingresa el primer número");
			m = sc.nextInt();
			System.out.println("Ingresa el segundo número");
			n =sc.nextInt();
			}
			while (m!=n);
			}
		


	}


