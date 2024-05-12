import java.util.*;
public class Class1SearchingNSorting{
    static int binarySearch(int arr[] , int key){
        int start = 0; 
        int end = arr.length -1;
        
        int mid = start + (end - start) / 2;
        while(start<=end){
            if(arr[mid] == key){
                    return mid;
                }
            else if(arr[mid] > key){
                end = mid-1;
            }
            else if(arr[mid] < key) start = mid +1;

            mid = start + (end - start) / 2;
            }

        return -1;
    }


    public static void main(String args[]){
        int arr[] = {1 ,3 ,4 ,6, 7 , 8 , 12 , 14};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to search (Binary Search):");
        int key  = sc.nextInt();
        int index  = binarySearch(arr, key);
        System.out.printf("The key %d is present at index %d\n", key , index);

        // Standard function for Binary Search in Java
       System.out.println( "Using Standard Function in Java \n"+ Arrays.binarySearch(arr, key));
       
    }
}