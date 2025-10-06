
import java.util.Scanner;

/* Ejercicio 2: Factorial de un Número
Enunciado: Escribe un programa que calcule el factorial de un número ingresado por el
usuario.
*/
public class ejercicio2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para calcular su factorial:");
        int numero = sc.nextInt();
        int factorial = 1;
        for(int i = 1; i <= numero; i++){
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
        sc.close();
    }
    
}
