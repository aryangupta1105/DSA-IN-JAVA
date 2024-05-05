import java.util.*;
import java.lang.*;

public class Arrays1{

    static void printArray(int [] arr , int size){
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void updateArray(int arr[] , int size){
        arr[0] += 10;
        printArray(arr, size);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
// ---->
        int arr[] = new int[5];

        // for(int i = 0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Printing the Array");
        // for(int i = 0; i<n; i++){
        //     System.out.println(arr[i]);
        // }

        // Memset Function: It is used to initialize the array with same elements:

// ---->
        // Arrays.fill(arr , 1);
        // System.out.println("Printing the Array");
        // for(int i = 0; i<5; i++){
        //     System.out.print(arr[i] + " ");
        // }


        // <----------Arrays and Function------------->
        int arr2[] = {2, 3};
        updateArray(arr2, 2);
        printArray(arr2, 2);
        // Both gives same answer so it is pass by refrence...

    }
}
