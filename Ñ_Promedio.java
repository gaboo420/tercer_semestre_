package compu_3b;
import java.util.Scanner;
public class Ñ_Promedio {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			double n;
			int j=1;
			int m=0;
			int k=0;
			int s=0;
			do {
			System.out.println("Introduce la calificación a evaluar "+j);
			n =sc.nextDouble();
			if (n<7){
				m++;
			}
			else {
				if (n>7){
					k++;	
				}
				else
				{
					s++;
				}
			}
			j++;
			}
			while(j<=10);
			System.out.println(k+" calificaciones son mayores a 7");
			System.out.println(m+" calificaciones son menores a 7");
			System.out.println(s+" calificaciones son iguales a 7");
		}
		
	}


