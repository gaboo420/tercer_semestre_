package compu_3b;

import java.util.Scanner;

public class R_Do_Case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Selecciona alguna de las opciones:");
		System.out.println("1.Puntos electrónicos");
		System.out.println("2.Mesa de regalos");
		System.out.println("3.Pagos");
		do 
		{
			System.out.println("");
			System.out.println("Introduce un número:");
			n = sc.nextInt();
			
			switch(n){
			case 0:
				System.out.println("Muchas Gracias. La operación a finalizado.");
				break;
			case 1:
				System.out.println("Puntos electrónicos");
				System.out.println("Gracias por tu elección.");
				break;
			case 2:
				System.out.println("Mesa de regalos");
				System.out.println("Gracias por tu elección.");
				break;
			case 3:
				System.out.println("Pagos");
				System.out.println("Gracias por tu elección.");
				break;
				default:
				System.out.println("No existe, intentalo denuevo");
				
			}
		}
		while (n>3);

	}
		
			}

		
		
		
			
	






