import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=1;
		do{System.out.println("Introduce n�mero entero");
	    n=in.nextInt();
		if(n<0){System.out.println("N�mero negativo");}
		else if(n>0){System.out.println("N�mero positivo");}
		}while(n!=0);

	}
}
