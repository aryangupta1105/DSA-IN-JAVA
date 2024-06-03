import java.util.*;

/*
    Problem Description: 
        Given are N boards of with length of each given in the form of array, and K painters, such that each painter takes 1 unit of time to paint 1 unit of the board. The task is to find the minimum time to paint all boards under the constraints that any painter will only paint continuous sections of boards, say board {2, 3, 4} or only board {1} or nothing but not board {2, 4, 5}.
 */
public class ThePaintersPartitionProblem {
    static boolean isPossibleSolution(int arr[] , int K , int N , int sol){
        int timeTaken = 0; 
        int c = 1;
        for(int i = 0; i<N; i++){
            if(arr[i] > sol) return false;
            if(arr[i] + timeTaken > sol){
                c++;
                timeTaken = arr[i];
                if(c>K) return false;
            }
            else{
                timeTaken += arr[i];
            }
        }
        return true;
    }
    static int findMinimumTime(int arr[] , int K , int N ){
        int totalTime = 0; 
        for(int x: arr) totalTime+= x;
        int s = 0; 
        int e = totalTime; 
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(isPossibleSolution(arr , K , N , mid)){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid +1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {10, 10, 10, 10};

        // arr[i] = length of board...
        // k = number of painters....
        // N = number of boards...
        int timeTaken = findMinimumTime(arr, 2  , 4);
        System.out.println(timeTaken);
    }
}
