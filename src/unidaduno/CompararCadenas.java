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
public class CompararCadenas 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese una cadena: ");
        String sl = scanner.next();
        System.out.println("Ingrese otra cadena: ");
        String s2 = scanner.next();
        
        System.out.println("s1 = " +sl + "");
        System.out.println("s2 = " +s2 + "");
        
        if(sl.equals(s2))
        {
            System.out.println("son iguales");
        }
        else
        {
            System.out.println("son distintas");
        }
        if(sl.equalsIgnoreCase(s2))
        {
            System.out.println("son iguales");
        }
        else
        {
            System.out.println("son distintas");
        }
    }
    
}
