/*que sume 1+2+...+100*/
package compu_3b;

import java.util.Scanner;

public class L_Comoselespeguelagana {

	public static void main(String[] args) {
		
		int n=1;
		int i =100;
		Scanner sc = new Scanner(System.in);
		int s = (i*(i+1))/2;
		do {
			System.out.println("La suma es "+s);
			
		}
		while(n==100);		

	}

}
