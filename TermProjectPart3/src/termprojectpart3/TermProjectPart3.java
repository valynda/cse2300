
package termprojectpart3;

import java.util.Scanner;
import java.util.Random;

public class TermProjectPart3 {

  
    public static void main(String[] args) {
        
        int n;
        int num_i;
        long running_time = 0;
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        
        //Prompt user for a number
        System.out.println("Enter the number of integers you would like to sort, then press return:");
            n = scan.nextInt();
        //Prompt user for number of iterations the sort will run
        System.out.println("Enter the number of iterations the sort should run, then press return:");
            num_i = scan.nextInt();
        
        //Iterative loop
        for (int m = 0; m < num_i; m++){
        //Record start time
        long startTime = System.nanoTime(); 
        //Create an array of length numOfIntegers of random integers
        int[] numbersArray = new int[n];
            for (int i = 0; i < numbersArray.length; i++){
                numbersArray[i] = gen.nextInt(500);
            }
        
//        //Print unsorted array to screen
//        System.out.println("Integers in unsorted array:");
//        for (int i=0; i<numbersArray.length; i++){
//            System.out.print(numbersArray[i]+" ");
//        }
//        System.out.println("\n");
        
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
        //record running time
        long elapsedTime = System.nanoTime() - startTime;
        running_time += elapsedTime;
        }
        
//        //Print sorted array to screen
//        System.out.println("Integers in sorted array:");
//        for (int k = 0; k < numbersArray.length; k++){
//            System.out.print(numbersArray[k]+" ");
        System.out.println("Number of items sorted: " + n);
        System.out.println("\nNumber of iterations: " + num_i);
        System.out.println("\nTotal running time: " + running_time);
        
        }
   
    }