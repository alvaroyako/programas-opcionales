import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=1;
		System.out.println("Introduce un n�mero distinto de cero para iniciar el programa");
		n=in.nextInt();
		while(n!=0){
		System.out.println("Introduce un n�mero entero del 1 al 7. Introducir un 0 terminar� el programa");
		n=in.nextInt();
		while(((n<1)&&(n!=0))||(n>7)){
			System.out.println("N�mero no valido, por favor introduzca un n�mero del 1 al 7");
			n=in.nextInt();
		}
		switch(n){
		case 1: System.out.println("Lunes");
		break;
		case 2: System.out.println("Martes");
		break;
		case 3: System.out.println("Mi�rcoles");
		break;
		case 4: System.out.println("Jueves");
		break;
		case 5: System.out.println("Viernes");
		break;
		case 6: System.out.println("S�bado");
		break;
		case 7: System.out.println("Domingo");
		break;
		}	
		}
		System.out.println("Cerrando el programa");
	}

}
