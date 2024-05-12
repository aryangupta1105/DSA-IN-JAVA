import java.util.*;
public class PeakElementMountainArray {
    static int findPeakElementMountainArray(int arr[]){
        int start = 0; 
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid+1] > arr[mid]){
                start = mid+1;
            }
            else end = mid;

        }
        return arr[start];
    }
    public static void main(String[] args) {
        int arr[] = {1 , 2, 4, 5 , 7, 7,5, 3 , 2};
        int peakElement = findPeakElementMountainArray(arr);
        System.out.println(peakElement);
    }
}
