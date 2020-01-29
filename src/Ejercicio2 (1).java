import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un número de inicio y uno de final y te daré los valores que se hallan entre ellos");
		int n1=in.nextInt();
		int n2=in.nextInt();
		for(int i=n1;i<=n2;i++) {
			System.out.println(i);
		}
	}

}
