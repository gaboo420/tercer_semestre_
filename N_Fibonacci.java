package compu_3b;



public class N_Fibonacci {

	public static void main(String[] args) {

		int n=0;
		int i=1;
		int m=0;
		int j=1;


		do {
			System.out.println(m);
			j++;
			m++;
			m=n+i;
			n=i;
			i=m;
			m=n;
		}
		while(j<=10);		

		}
	

	}


