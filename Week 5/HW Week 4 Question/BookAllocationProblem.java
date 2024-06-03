/*
    Problem Description: 
        You have N books, each with A[i] number of pages. M students need to be allocated contiguous books, with each student getting at least one book.
        
        Out of all the permutations, the goal is to find the permutation where the sum of maximum number of pages in a book allotted to a student should be minimum, out of all possible permutations.

        Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).
 */

public class BookAllocationProblem {
    static boolean isPossibleSolution(int arr[] , int M , int N , int sol){
        int pageSum = 0; 
        int c = 1; 
        for(int i = 0; i<N; i++){
            if(arr[i] > sol){
                return false;
            }
            if(arr[i] + pageSum > sol){
                c++;
                pageSum = arr[i];
                if(c>M) return false;
            }
            else{
                pageSum += arr[i];
            }
        }
        return true;
    }
    static int findPages(int arr[] , int M , int N){
        if(M>N) return -1;
        int sum = 0;
        for(int x: arr){
            sum += x;
        }
        int s = 0;
        int e = sum;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(isPossibleSolution(arr ,M, N, mid)){
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
        int arr[] = {12,34,67,90};
        int ans = findPages(arr, 2, 4);
        System.out.println(ans);
    }
    
}
