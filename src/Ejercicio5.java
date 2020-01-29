import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=1;
		do{System.out.println("Introduce número entero");
	    n=in.nextInt();
		if(n<0){System.out.println("Número negativo");}
		else if(n>0){System.out.println("Número positivo");}
		}while(n!=0);

	}
}
