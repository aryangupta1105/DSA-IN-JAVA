import java.util.*;
public class findKDiffPairs {
    static int FindKDiffPairs(int[] arr, int k) {
        int s = 0;
        int e = s+1; 
        int count = 0; 
        Arrays.sort(arr);
        while(s < arr.length)
        { 
            if(arr[s] - arr[e] == k){
                count++;
                s++;
                e++;
            }
            else if(arr[s] - arr[e] > k){
                e--;
            }
            else{
                s++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int numPairs = FindKDiffPairs(arr , 1);
        System.out.println(numPairs);
    }
}
