/* realizar código que solicite ingresar con contra donde deberá escoger de 5 distintos destinos turistícos el que más le convenga.
 * Si el usuario no cuenta con contraseña, deberá registrase en el sistema.
 * Por otra parte, el destino turistico que el usuario escoja le solicitará el presupuesto con el que cuenta, y el sistema le deberá indicar
 * si su viaje es viable o no.*/
package compu_3b;

import java.util.Scanner;

public class S_FUSIÓN_BUCLES {
public static void main(String[] args) {
		
		String x="contraseña";
		String n;
		String m;
		String a;
		String b;
		int c;
		double d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Buenas tardes, ingresar su contraseña para acceder.");
		System.out.println("a) Crear contraseña.");
		System.out.println("b) Ingresar contraseña");
		a =sc.next();
		if(!a.equals("a")) {
			System.out.println("Ingrese su contraseña");
			b =sc.next();
			
			if((!b.equals(x))) {//acá
				System.out.println("Contraseña incorrecta.");
			}
		}
		else {
			System.out.println("Crea una contraseña:");
			n =sc.next();
			do 
			{
			System.out.println("Ingresa la contraseña:");
			m =sc.next();
			if((!m.equals(n))) {
				System.out.println("Contraseña incorrecta.");
			}
			}
			while (!m.equals(n));
			System.out.println("La contraseña es correcta. Bienvenido.");
			}
		System.out.println("");
		System.out.println("Ahora podemos comenzar, elige alguno de los siguientes destinos a los cuales te gustaria viajar:");
		System.out.println("0) TULUM");
		System.out.println("1) NEW YORK");
		System.out.println("2) CDMX");
		System.out.println("3) CHINA");
		System.out.println("4) MONACO");
		c =sc.nextInt();
		do {
		switch(c){
		case 0:
		System.out.println("TU ELEGISTE TULUM.");
			break;
		case 1:
			System.out.println("TU ELEGISTE NEW TORK.");
				break;
		case 2:
			System.out.println("TU ELEGISTE CDMX.");
				break;
		case 3:
			System.out.println("TU ELEGISTE CHINA.");
				break;
		case 4:
			System.out.println("TU ELEGISTE MONACO.");
				break;
			default:
			System.out.println("No existe, intentalo denuevo");
		
		}
		}
		while(c>4);
		System.out.println("Ahora deberás ingresar el presupuesto que tienes contemplado utilizar:");
		d = sc.nextDouble();
		if(d<100000) {
			System.out.println("Lo sentimos, su saldo es insuficiente, debería considerar otras opciones para su destino.");
			System.out.println("Muchas gracias, vuelva pronto.");
		}
		else {
			System.out.println("Genial, ahora solo falta que te contactes con nuestros asesores para poner en marcha su viaje. ");
			System.out.println("Muchas gracias, hasta pronto.");
		}
		
		}
		
}
