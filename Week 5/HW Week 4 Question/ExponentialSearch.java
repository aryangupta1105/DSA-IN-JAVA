import java.util.*;
/*
 Applications:
    1) For large array, it improves the time complexity even lesser than O(logn).
 */
public class ExponentialSearch {
    static int binarySearch(int arr[], int s , int e , int x){
        int mid = s + (e-s)/2;
        while(s<=e){
            if(arr[mid] == x) return mid; 
            else if (arr[mid] > x) e = mid-1;
            else s = mid+1;

            mid = s + (e-s)/2;
        }
        return -1;
    }
    static int exponentialSearch(int arr[] , int x){
        if(arr[0] == x)
            return 0;
        int i = 1;
        while(i<arr.length && arr[i] <= x ){
            i = i*2;
        }

        // System.out.println(i + " " + i/2 + " " +Math.min(i, arr.length) );

        return binarySearch(arr, i/2, Math.min(i, arr.length-1), x);
    }

    // For unbounded Array: 
    // 1) Brute Force:
    static int unboundedArrayBruteForce(int arr[] , int x){
        int i = 0;
        int ans = -1;
        while(true){
            if(arr[i]>x){
                break;
            }
            if(arr[i] == x){
                ans = i;
            }
            i++;
        }
        return ans;

    }

    // 2) Better Approach: 
    // i)Using Exponential Search: 
    static int exponentialSearchUnboundedArray(int arr[] , int x){
        int i = 0; 
        int j = 1;
        while(arr[j] < x){
            i = j;
            j *= 2;
        }
        return binarySearch(arr, i, j, x);

    }

    public static void main(String[] args) {
        // Normal Exponential Search..
        int arr[] = { 3, 4, 5, 6 ,11, 13 ,14 , 15, 56, 70};
        // int index = exponentialSearch(arr , 56);

        // Using brute Force...
        // int indexBrute = unboundedArrayBruteForce(arr , 56);
        // System.out.println(indexBrute);

        // Using Exponential Search for unbounded Array....
        int indexUnbounded = exponentialSearchUnboundedArray(arr, 56);
        System.out.println(indexUnbounded);

    }
}
