/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidaduno;

import java.util.ArrayList;

/**
 *
 * @author Abigail
 */
public class Ejemplo0 {

    public static void main(String[] args) {
        int n=0;
//        ArrayList<String> myArray = new ArrayList<String>();
//        for (int i = 0; i < 10; i++)
//        {
//            myArray.add("Elemento " +i);
//            for (String x: myArray) 
//            {
//                System.out.println(x.toUpperCase());
//                
//            }
//            
//        }
        
        //suma de todo el array
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
        {
            myArray.add(i);
           
        }
         for (int x: myArray) 
            {
                n+=x;
            }
            System.out.println("La suma es: "+n);
    }
}
