
package TermProjectPart1;

import java.util.Scanner;
import java.util.Random;

public class TermProjectPart1 {

    public static void main(String[] args) {
        
        int numOfIntegers;
        Scanner scan = new Scanner(System.in);
        
        //Prompt user for a number
        System.out.println("Enter the number of integers you would like to sort, then press return:");
            numOfIntegers = scan.nextInt();
        
        //Create an array of length numOfIntegers of random integers
        Random gen = new Random();
        int[] numbersArray = new int[numOfIntegers];
            for (int i = 0; i < numbersArray.length; i++){
                numbersArray[i] = gen.nextInt(500);
            }
        
        //Print unsorted array to screen
        System.out.println("Integers in unsorted array:");
        for (int i=0; i<numbersArray.length; i++){
            System.out.print(numbersArray[i]+" ");
        }
        System.out.println("\n");

        //Sort array
        int temp;
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 1; i < numbersArray.length; i++){
                if(numbersArray[i-1] > numbersArray[i]){
                    temp = numbersArray[i - 1];
                    numbersArray[i-1] = numbersArray[i];
                    numbersArray[i] = temp;
                    flag = true;
                }
            }
        }
        
        //Print sorted array to screen
        System.out.println("Integers in sorted array:");
        for (int i = 0; i < numbersArray.length; i++){
            System.out.print(numbersArray[i]+" ");
        }
        
    }
    
}
