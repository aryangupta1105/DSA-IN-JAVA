import java.util.*;
public class FindPivotUsingBS {
    static int findPivotUsingBS(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid = start + (end - start)/2;
            if(arr[end] < arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int arr[] = {7,  9, 10 , 1, 6};
        int pivot = findPivotUsingBS(arr);
        System.out.println("The pivot is at index: " + pivot);
    }
}
