import java.util.Scanner;
public class Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner( System.in );
		int suma=0;
		int n;
		int ni;
		int comprb;
		System.out.println("Escriba un entero:");
		n = entrada.nextInt();
		ni=n;
		comprb=n*(n+1)/2;
		while(n>0) {
			suma=suma+n;
			n=n-1;
			}
		System.out.println("El resultado de la suma de los "+ ni +" primeros números enteros es:"+suma);
		System.out.println("El resultado de la comprobación es: " + comprb);
		

	}

}
