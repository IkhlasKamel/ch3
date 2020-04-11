/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3_1;

/**
 *
 * @author Ikhlas Kamel
 */

import static java.lang.Math.random;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Q1 {
//
    public static void main(String[] args) {
        
        Random r = new Random();
        int[] random = new int[100];

        for (int i = 0; i < random.length; i++) {
            random[i] = r.nextInt(100) + 1;
        }

        for (int i = 0; i < random.length; i++) {
            System.out.println(random[i]);
        }

        List<int[]> randomList = Arrays.asList(random);

        sortElements(randomList);

    }

    private static void sortElements(Collection<int[]> values) {

        Set<int[]> set = new HashSet<int[]>(values);

        for (int[] is : set) {
            System.out.printf("Sorted Elements: %d ", values);
        }

        System.out.println();
    }

    // Calculate Sum of the elements

   // Calculate floating point average of the elements.
 
    
}

   
