package compu_3b;
import java.util.Scanner;
public class H_Corredor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name[]= {"Juan","Luia","Eva","Raúl","Fati","Diana","Yara","Edu","Gabo","Gael"};
		double nums[]= {0,0,0,0,0,0,0,0,0,0};
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
			System.out.println("El competidor con el menor tiempo fue ");
			for (int j=0; j<name.length; j++)
			{
				System.out.println(name[j]+ " " + nums[j]);
			}

				}
			

	}


