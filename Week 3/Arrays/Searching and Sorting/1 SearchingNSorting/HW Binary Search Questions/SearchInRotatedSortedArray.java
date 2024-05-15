import java.util.*;
public class SearchInRotatedSortedArray {
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
    static int searchInRotatedSortedArray(int arr[] , int key){
        int start = 0;
        int end = arr.length-1;
        int ans =0;
        int mid = 0;
        int pivot = findPivotUsingBS(arr);

        while(start<end){
            mid= start + (end - start)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] == arr[pivot -1])
            {
                if(key<arr[end]) start = mid+1;
                else end = mid;
            }
            else if(arr[mid] > key)
            {
                if(arr[mid]>arr[end]) start = mid+1;
                else end = mid;
            }
            else 
            {
                if(arr[mid]<arr[end]) start = mid+1;
                else end = mid;
            }

        }
            return start;
    }
    public static void main(String[] args) {
        int arr[] = { 5, 6, 7 , 1, 2, 3, 4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        int index = searchInRotatedSortedArray(arr , key);
        System.out.printf("The key %d is present at index %d." , key , index);
    }
}
