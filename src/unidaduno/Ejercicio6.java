
package unidaduno;

import java.util.Scanner;

/**
 *
 * @author Abigail
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int result, a, n;
        Scanner num = new Scanner(System.in);
        System.out.print("Ingresa la base (a): ");
        a = num.nextInt();
        System.out.print("Ingresa la potencia (n): ");
        n = num.nextInt();
        result = potencia(a, n);
        System.out.println("El resultado de " + a + " exp " + n + " = " + result);
    }
    static int potencia(int a, int n){
        int result;
        if(n == 0){
            result = 1;
        }
        else{
            // caso recursivo: a^n = a *a^n-1
            result = a * potencia(a, n - 1);
        }      
        return result;
    } 
}
