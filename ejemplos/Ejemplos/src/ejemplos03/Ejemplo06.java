/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;

/**
 *
 * @author Usuario
 */
public class Ejemplo06 {

    static int suma = 0;

    public static void main(String[] args) {

        System.out.printf("Valor de variable suma (main): %d\n", suma);
        obtenerSuma(10, 30);
        obtenerSumaDos();

    }

    public static void obtenerSuma(int a, int b) {
        suma = a + b;
        System.out.printf("Valor de variable suma (obtenerSuma): %d\n", suma);

    }

    public static void obtenerSumaDos() {
        suma = suma + 100;
        System.out.printf("Valor de variable suma (obtenerSumaDos): %d\n", suma);
    }
}
