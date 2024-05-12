import java.util.*;
public class FindMissingElementBS {
    static int findMissingElement(int arr[]){
        int start = 0; 
        int end= arr.length-1;
        int ans = 0;
        int mid = 0;
        while(start<end){
            mid = start + (end - start) /2;
            if (arr[mid] - mid != arr[end] - end)
            {
                start = mid;
            }
            else if(arr[mid] - mid != arr[start] - start){
                end = mid-1;
            }
            else{ 
               return arr[end] +1;
            }  
            
        }
        return mid+1;
    }
    static int findMissingElementCountMethod(int arr[] , int size){
        // size+1 because length of array is one less as 1 element is missing..
        int sum = (size+1)* (size+2) /2;
        int newSum = 0;
        for(int i = 0; i<size; i++){
            newSum += arr[i];
        }
        System.out.println(newSum);
        System.out.println(sum);
        int missingElement = sum - newSum;
        System.out.println(missingElement);
        return missingElement;
    }
    public static void main(String[] args) {
        int arr[]  = { 1 , 2  ,4 ,5 , 6,7};
        int missingElement = findMissingElement(arr);
        System.out.println(missingElement);
        findMissingElementCountMethod(arr , arr.length);
    }
}
