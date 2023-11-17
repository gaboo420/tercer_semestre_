package compu_3b;
import java.util.Scanner;
class B {

	public static void main(String[] args) 
	{
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca valor de ");
		N=sc.nextInt();
		System.out.println(N/10000);
		System.out.println(N/1000);
		System.out.println(N/100);
		System.out.println(N/10);

		System.out.println(N);
	}

}
