/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_work3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

/**
 *
 * @author ikhlas
 */
public class Home_work3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int []x=new int [3];
        for (int i = 0; i < 3; i++) {
           x [i]=(int)( Math.random()*100);
        }
      List <Integer> list= new ArrayList<>();
        for (int i = 0; i <x.length; i++) {
            list.add(x[i]);
        }
        Collections.sort(list);
            System.out.print("Sorted: ");
         for (Integer integer : list) {
         
             System.out.print(integer +" ");
            
        }
         System.out.println("");
        System.out.println("The Sum: "+ IntStream.of(x).sum());
        System.out.println("The Average: "+IntStream.of(x).average().getAsDouble());
        // TODO code application logic here
    }
    
}
