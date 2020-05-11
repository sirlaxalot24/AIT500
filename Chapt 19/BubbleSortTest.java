import java.util.Arrays;
import java.util.Random;

public class BubbleSortTest{

    public static void main(String args[]) { 
        
        //create array
        Random rd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(arr));

        // Sort Array
        BubbleSort bubSort = new BubbleSort(); 
        bubSort.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        System.out.println(Arrays.toString(arr)); 
    } 
} 