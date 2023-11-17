package compu_3b;

import java.util.Scanner;

public class D_Letra_por_letra {

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		int c = 0; 
		System.out.println("Escribe una palabra");
		String palabra=dato.nextLine();
		char caracteres[]= new
		char [palabra.length()];
		for(int i = 0; i <palabra.length(); i ++) {
			c=c+1;
			caracteres[i]=palabra.charAt(i);
		System.out.println(caracteres[i]);
		}
		System.out.println("La cantidad de caracteres es: "+c);

	}

}
