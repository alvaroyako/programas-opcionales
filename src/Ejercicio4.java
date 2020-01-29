public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=1;
		int numeros=1;
		//Con bucle for
		System.out.println("Los siguientes números son pares, no múltiplos de 4 y tampoco múltiplos de 3: ");
		for (int i=1;i<=100;i++){
			if((i%2==0)&&(i%4!=0)&&(i%3!=0)){
			System.out.println(i);
			}
		}
		//Con bucle while
		System.out.println("Los siguientes números son pares, no múltiplos de 4 y tampoco múltiplos de 3: ");
		while(contador<=100){
			if((numeros%2==0)&&(numeros%4!=0)&&(numeros%3!=0)){
				System.out.println(numeros);
				}
			contador++;
			numeros++;
		}
		
		
		
	}

}
