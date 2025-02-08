package Asignaturas.EntornosDeDesarrollo;

import java.util.Arrays;
import java.util.Scanner;

/* Hola Antonio, he revisado tu código y he hecho algunos cambios para que el código sea más eficiente
/ y me he tomado la libertad de agregar algunos cambios, un saludo.
*/

public class TrabajoEnf {
    // Creo dos variables de clase para guardar los valores que obtenga con los
    // métodos
    static int pares = 0;
    static int impares = 0;

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) { // El "try" lo añade solo VsCode por si hay excepciones, no le
                                                         // hagas caso
            // Primero creo un Array para almacenar los 10 valores que piden
            int[] numeros = new int[10];
            // Con este bucle recorro el array y le asigno los valores que se introduzcan
            // por terminal
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Dime el número " + (i + 1) + " de 10");
                numeros[i] = entrada.nextInt();
            }

            System.out.println("Aquí tienes los números ordenados de menor a mayor");
            Arrays.sort(numeros); // Con el método sort de la clase Arrays ordeno el array de menor a mayor
            // Con este foreach imprimo por pantalla cada valor y le he añadido corchetes
            // para que se vea más bonito
            for (int i : numeros) {
                System.out.print("[" + i + "]");

            }
            System.out.println();
            // Llamo a los dos métodos para que añada a las variables pares/impares cuantos
            // hay de cada una
            cualesPares(numeros);
            cualesImPares(numeros);
            // Por último concateno e imprimo el resultado
            System.out.println("De los cuales " + pares + " son pares y " + impares + " son impares.");
        }

    }

    /////////////////
    // MÉTODOS //
    ////////////////

    public static void cualesPares(int[] numeros) {

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) // Con esto incremento la variable "pares" por cada par en el Array
                pares++;

        }

    }

    public static void cualesImPares(int[] numeros) {

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 != 0) // Con este incremento la variable "impares" por cada impar en el Array
                impares++;

        }

    }

}