/* en un certamen de atletismo de desea implementar un control para almacenar el tiempo de cada corredor y 
		 * además determinar por los datos obtenidos en los tiempos de los corredores cual es el ganador.
		 * Se debe especificar cuantos atletas van a participar.*/
package compu_3b;
import java.util.Scanner;
public class G_Corredores {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int tiempomayor = 0; 
		int tiempomenor = 0;

		int[]n = new int[11];
		for (int i = 0+1;i<11;i++) 
		{
			System.out.println("Introduce el tiempo del corredor " +(i)+ " en segundos.");
			n [i]=sc.nextInt();
		}
		for(int i =1; i <n.length; i++) 
		{
			if(tiempomayor < n [i]) 
			{
				tiempomayor = n [i];
			}
		}
		tiempomenor = tiempomayor; 
		for(int i = 1; i < n.length; i++) 
		{
			if(tiempomenor >n [i]) 
			{
				tiempomenor = n [i];
			}
	}	
		System.out.println("El ganador, ganó con un tiempo de "+tiempomenor);
		
		
	}
}


