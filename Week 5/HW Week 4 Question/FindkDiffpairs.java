import java.util.*;
public class findKDiffPairs {
    // brute force: Time Complexity - O(n^2)...
    static int findkdiffpairsBruteForce(int arr[] , int k){
        int count = 0; 
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(Math.abs(arr[i] - arr[j]) == k){
                    count++;
                }
            }
        }
        return count;

    }


    // Two Pointer Approach:  Time Complexity - O(nlogn)....
    static int findkdiffPairs(int[] arr, int k) {
        int s = 0;
        int e = s+1; 
        int count = 0; 
        Arrays.sort(arr); 
        while(e < arr.length)
        { 
            if(arr[e] - arr[s] == k){
                System.out.println(  "(" + arr[e] + "," + arr[s] + ")");
                count++;
                s++;
                e++;
            }
            else if(arr[e] - arr[s] > k){
                 s++;
            }
            else{
                e++;
            }
            if(s==e) e++;
        }
        return count;
    }


    // using Binary Search...
    static int binarySearch(int arr[] ,int s, int newTarget){
         int e = arr.length -1; 
         int mid = 0; 
         while(s<=e){
            mid = s + (e-s)/2;
            if(arr[mid] == newTarget)  return mid;
            else if(arr[mid] < newTarget) s = mid+1;
            else e = mid-1;
         }
        return -1;
    }
    static int findkdiffPairsBS(int arr[] , int k){
        int ans = 0; 
        Arrays.sort(arr);
        int i = 0; 
        while(i<arr.length){
            int newTarget = arr[i] + k;
            if(binarySearch(arr, i+1, newTarget) != -1){
                ans++;
                while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1};
        Scanner sc = new Scanner(System.in);
        // using Brute Force:
        // int numPairsBrute = findkdiffpairsBruteForce(arr , 1);
        // System.out.println(numPairsBrute);

        int k ;
        System.out.println("Enter the diff to find: ");
        k = sc.nextInt();
        // Using Two Pointer Approach...:
        // int numPairs = findkdiffPairs(arr , k);
        // System.out.println("The number of pairs with difference " + k + " are: " +  numPairs);


        int numPairsBS = findkdiffPairsBS(arr , k);
        System.out.println("The number of pairs with difference " + k + " are: " +  numPairsBS);


    }
}
