package compu_3b;

import java.util.Scanner;

public class C {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d,m,a,s,sum,c1,c2,c3,c4;
		System.out.println("Introduzca su fecha de nacmiento ");
		System.out.println("Día: ");
		d = sc.nextInt();
		System.out.println("Mes: ");
		m = sc.nextInt();
		System.out.println("Año: ");
		a = sc.nextInt();
		sum=d+m+a;
		c1=sum/1000;
		c2=sum/100%10;
		c3 = sum/10%10;
		c4 = sum%10;
		s= c1+c2+c3+c4;
		System.out.println("Tu número de la suerte es: " + s);
		
		

	}

}
