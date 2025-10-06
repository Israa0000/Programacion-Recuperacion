/*Ejercicio 3: Números Primos
Enunciado: Escribe un programa que verifique si un número ingresado por el usuario es
primo.*/
import java.util.Scanner;


public class ejercicio3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("comprueba si ru numero es primo:");
        int numero = sc.nextInt();
        boolean esPrimo = true;
        if (numero < 1 ){
            esPrimo = false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++){ // Verifica si el número es divisible por algún número menor que su raíz cuadrada
            if (numero % i == 0){ // Si es divisible, no es primo
                esPrimo = false; 
                break;
            }
        }

        if (esPrimo) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }

        sc.close();
    }
    
}
