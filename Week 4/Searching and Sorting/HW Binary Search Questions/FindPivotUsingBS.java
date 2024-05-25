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

    static int findPivotUsingBS2ndMethod(int arr[]){
        int start = 0; 
        int end = arr.length-1;
        int mid = 0; 
        int ans = -1; 
        while(start<=end){
            mid = start + (end -start)/2;
            if(start == end) return start;
            if(mid<end && arr[mid] > arr[mid+1])   ans = mid;
            if(mid-1 > start && arr[mid-1] > arr[mid]) 
            ans = mid-1;
            if(arr[start] > arr[mid])
                {ans = mid;
                end = mid-1;}
            else start = mid+1;  
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {10 , 1, 2, 3,4, 5, 6};
        // int pivot = findPivotUsingBS(arr);
        // System.out.println("The pivot is at index: " + pivot);
        // System.out.println("The pivot is  " + arr[pivot]);
        int pivot2 = findPivotUsingBS2ndMethod(arr);
        System.out.println("The pivot is at index: " + pivot2);
        System.out.println("The pivot is " +arr[ pivot2]);
    }
}
