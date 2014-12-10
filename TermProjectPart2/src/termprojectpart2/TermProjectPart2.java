
package termprojectpart2;

import java.util.Scanner;
import java.util.Random;

public class TermProjectPart2 {

  
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
        
        //Sort
        int i;
        int j;
        int n = numbersArray.length;
        int iMin;
        int temp;
        for(j = 0; j < n; j++){
            iMin = j;

            for ( i = j+1; i < n; i++) {
                if (numbersArray[i] < numbersArray[iMin]) {
                iMin = i;
                }
            }
        
        if ( iMin != j ) {
        //swap(numbersArray[j], numbersArray[iMin]);
        temp = numbersArray[j];
        numbersArray[j] = numbersArray[iMin];
        numbersArray[iMin] = temp;
        
        }
        }
        
        //Print sorted array to screen
        System.out.println("Integers in sorted array:");
        for (int k = 0; k < numbersArray.length; k++){
            System.out.print(numbersArray[k]+" ");
        }
   
    }
    
}
