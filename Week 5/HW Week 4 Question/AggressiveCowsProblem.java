import java.util.*;

public class AggressiveCowsProblem {
    static boolean isPossibleSolution(int arr[] , int K , int N , int sol){
        int maxPos = arr[0]; 
        int c = 1; 
        for(int i = 1; i<N; i++){
            if(arr[i] - maxPos >= sol){
                c++;
                maxPos = arr[i];
            }
            if(c == K) return true;
        }
        return false;
    }
    static int findMaximumDistance(int arr[] , int K , int N){
        Arrays.sort(arr);
        if(K>N) return -1;
        int ans = -1;
        int s = 0;
        int e = arr[arr.length-1]  - arr[0];
        while(s<=e){
            int mid = s + (e-s)/2;
            if(isPossibleSolution(arr,K,N , mid)){
                ans = mid; 
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1 , 2, 4, 8 , 9};
        int maxDistance = findMaximumDistance(arr, 3, 5);
        System.out.println(maxDistance);
    }
}
