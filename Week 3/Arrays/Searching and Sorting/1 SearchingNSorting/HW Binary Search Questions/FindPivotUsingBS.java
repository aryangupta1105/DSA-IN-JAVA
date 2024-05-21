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
        return start-1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4, 5, 6, 7, 8};
        int pivot = findPivotUsingBS(arr);
        System.out.println("The pivot is at index: " + pivot);
    }
}
