/*Ejercicio 1: Suma de Números Pares
Enunciado: Escribe un programa que calcule la suma de todos los números pares del 1 al
100.*/

public class ejercicio1 {
    public static void main(String[] args){
        for (int i = 1; i <=100; i++){
            if(i % 2 == 0){
                System.out.println("La suma de los números pares del 1 al 100 es: " + i);
            }
        }
    }
}