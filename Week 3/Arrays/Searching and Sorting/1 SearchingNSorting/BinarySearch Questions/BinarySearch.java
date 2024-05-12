import java.util.Arrays;

public class BinarySearch {
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
        int index  = binarySearch(arr, 12);
        System.out.printf("The %d is present at index %d\n", 12 , index);

        // Standard function for Binary Search in Java
       System.out.println( Arrays.binarySearch(arr, 12));
    }
}
