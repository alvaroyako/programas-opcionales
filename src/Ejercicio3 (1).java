import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String intro;
		System.out.println("Desea salir?(S/N)");
		intro=br.readLine();
			while((intro.equals("N"))||(intro.equals("n"))) {
				System.out.println("Desea salir?(S/N)");
				intro=br.readLine();
				}
			if ((intro.equals("S"))||(intro.equals("s"))) {
				System.out.println("Adiós");
			}
	}

}
