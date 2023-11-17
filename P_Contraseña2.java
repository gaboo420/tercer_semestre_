/*crear contra, guardarla, y que no te deje salir hasta escribir la correcta*/
package compu_3b;

import java.util.Scanner;

public class P_Contraseña2 {
	public static void main(String[] args) {
		
		String n;
		String m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Crea una contraseña:");
		n =sc.next();
		do 
		{
		System.out.println("Ingresa la contraseña");
		m =sc.next();
		}
		while (!m.equals(n));
		System.out.println("La contraseña es correcta");
		}

		
	
}

