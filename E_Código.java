package compu_3b;

import java.util.Scanner;

public class E_Código {


	public static void main(String[] args) 
	{
		Scanner dato = new Scanner(System.in);
		int mayor = 0; 
		int menor = 0;
		int[]numeros = new int[11];
		for (int i = 0+1;i<11;i++) 
		{
			System.out.println("Introduce un número " +(i)+ " a evaluar.");
			numeros [i]=dato.nextInt();
		}
		for(int i =1; i <numeros.length; i++) 
		{
			if(mayor < numeros [i]) 
			{
				mayor = numeros [i];
			}
		}
		menor = mayor; 
		for(int i = 1; i < numeros.length; i++) 
		{
			if(menor >numeros [i]) 
			{
				menor = numeros [i];
			}
		}
		System.out.println("El número mayor a evaluar es: "+mayor+" y el número menor es: "+ menor);
	}

}
