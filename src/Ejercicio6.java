import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el inicio:");
		int inicio=in.nextInt();
		while(inicio<=0){
			System.out.println("Número no válido, ha de ser mayor que cero");
			inicio=in.nextInt();
		}
		System.out.println("Introduce el fin:");
		int fin=in.nextInt();
		while((fin<=0)||(fin<=inicio)){
		System.out.println("Número no válido, ha de ser mayor que cero y el número de inicio");
		fin=in.nextInt();
		}
		for(int i=inicio;i<=fin;i++){
			if(i%7==0){
			System.out.println(i);
			}
		}
	}

}
