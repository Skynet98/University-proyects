import java.util.Scanner;
public class Comparación {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner( System.in );
		int n1;
		int n2;
		int n3;
		System.out.println("Escriba el primer número entero:");
		n1 = entrada.nextInt();
		System.out.println("Escriba el segundo número entero:");
		n2 = entrada.nextInt();
		System.out.println("Escriba el tercer número entero:");
		n3 = entrada.nextInt();
		if(n1>=n2 && n1>=n3) {
			if(n2>=n3)
				System.out.println(n3+" es menor o igual que"+n2+" que es menor o igual que "+ n1);
			else
				System.out.println(n2+" es menor o igual que  "+n3+" que es menor o igual que "+ n1);}
		if(n2>=n1 && n2>=n3) {
			if(n1>=n3)
				System.out.println(n3+" es menor o igual que "+n1+" que es menor o igual que "+ n2);
			else
				System.out.println(n1+" es menor o igual que "+n3+" que es menor o igual que "+ n2);}
		if(n3>=n1 && n3>=n2) {
			if(n1>=n2)
				System.out.println(n2+" es menor o igual que "+n1+" que es menor o igual que "+ n3);
			else
				System.out.println(n1+" es menor o igual que "+n2+" que es menor o igual que "+ n3);}
		
	}
	
		
				
		
				

	}


