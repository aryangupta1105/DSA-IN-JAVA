import java.util.*;
 
public class BsNearlySortedArray {
    static int findInNearlySortedArray(int arr[] , int key){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == key) return mid;
            if(mid-1>= 0 && arr[mid-1] == key  ) return mid-1;
            if(mid+1 < arr.length && arr[mid+1] == key) return mid+1;

            else if(arr[mid] < key) start  = mid +2;
            else end = mid-2;

        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[] = {10 , 2, 40, 20 , 50 , 80 , 70};
        int index = findInNearlySortedArray(arr, 80);
        System.out.println(index);
    }
}
