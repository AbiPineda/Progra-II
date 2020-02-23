/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidaduno;

import java.util.Scanner;

/**
 *
 * @author Abigail
 */
public class Ejercicio2 {
 
    public static void main( String[] args )
    {
        int numero;
        Scanner teclado = new Scanner( System.in );

        System.out.printf( "Introduzca un número entero: " );
        numero = teclado.nextInt();

        if ( numero % 2 == 0 )
        {
            System.out.printf( "ES PAR " );
        }
        else
        {
            System.out.printf( "ES IMPAR " );
        }
    }
}

