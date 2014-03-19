import java.util.Scanner;
public class Ej1 {
	// Ejecicio #1 comparar si son iguales
	static boolean soniguales(int numero1, int numero2){
		if (numero1==numero2){
			return true;
		}else
		return false;			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejecicio #1
		System.out.println("\n   EJERCICIO #1");
		System.out.println("---------------------");
		Scanner mi_s = new Scanner (System.in);
		System.out.print("Ingrese un numero:");
		int num1=mi_s.nextInt();
		System.out.print("Ingrese otro numero:");
		int num2=mi_s.nextInt();
		System.out.println("¿los nuemeros son iguales? "+"\n Respuesta= "+ soniguales(num1, num2));
		
		System.out.println("----------------------------------");
		
//-------------------------------------------------------------------------------------------		
		
		System.out.println("\n   EJERCICIO #3");
		System.out.println("---------------------");
		int promedio[];
		promedio = new int [3];
		for (int i=0; i<promedio.length; i++){
			System.out.println("Ingrese la posicion "+i+":");
			promedio[i]= mi_s.nextInt();
		}
		int total=0;
		for (int i=0; i<promedio.length; i++){
			total+=promedio[i];
		}
		System.out.print("Promedio: "+(total)/3+" %");
}
}
