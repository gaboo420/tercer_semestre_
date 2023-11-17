/*Pedirá su contra hasta que sea correcta, la contra ya deberá estar predefinida. Texto*/
package compu_3b;

import java.util.Scanner;

public class O_Contraseña {

	public static void main(String[] args) {
		
			String n= "contraseña";
			Scanner sc = new Scanner(System.in);
			do 
			{
			System.out.println("Ingresa la contraseña");
			n =sc.next();
			}
			while (!n.equals("contraseña"));
			}
	
			
		
	}


