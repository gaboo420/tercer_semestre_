package compu_3b;

import java.util.Scanner;

public class M_Proceso_de_Números {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i=1;
		System.out.println("Introduce un número");
		int n = sc.nextInt();
		do 
		{
		System.out.println(i);
		i++;
		}
		while (i<n);

	}

}
