package compu_3b;
import java.util.Scanner;
public class A_for {
		public static void main(String[]args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingresa la especialidad:");
				String semestre[]={"PRIMER SEMESTRE","SEGUNDO SEMESTRE","TERCER SEMESTRE","CUARTO SEMESTRE","QUINTO SEMESTRE","SEXTO SEMESTRE"};	
				String n = sc.next();
				switch(n){
				case "administración":
					for (int s=0; s<semestre.length; s++)
					{
						String materia[]={"Emprendimiento","Marketing","Contabilidad","Finanzas","Inversión","Inglés"};
						System.out.println(semestre[s]+ " de "+n+", "   + materia[s]);
					}
					break;
				case "enfermeria":
					for (int s=0; s<semestre.length; s++)
					{
						String materia2[]={"Introducción a la Medicina","RSP","Proctología","Ciencias","Biología","Psycología"};
						System.out.println(semestre[s]+ " de "+n+", "   +materia2[s]);
					}
					break;
				case "computación":	
					for (int s=0; s<semestre.length; s++)
					{
						String materia3[]={"LP","OP","Matemáticas","MSO","PP","BD"};
						System.out.println(semestre[s]+ " de "+n+", "   +materia3[s]);
					}
					break;
					default:
					System.out.println("none exist");
				}


			}

		
		}




