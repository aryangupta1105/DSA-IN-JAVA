import java.util.*;
public class FindKClosestElement {

    // By using sorting: Time complexity: O(nlogn)....
    static Vector<Integer> findKClosestElement(int arr[] , int k , int x){
        int ex[] = new int[arr.length];
        Vector<Integer> ans = new Vector<>();
        for(int i = 0 ; i<arr.length; i++){
            int diff = Math.abs(arr[i] - x);
            ex[i] = diff;
        }
        Arrays.sort(ex);
        for(int l : ex) System.out.print(l + " ");
        
        for(int i = 0; i<k; i++){
            ans.add(ex[i] + x);
        }

        
        System.out.println(ans);
        return ans;
    }

    static void findKClosestElementTwoPointerApproach(int arr[] , int k , int x){
        int low = 0; 
        int high = arr.length-1;
        Vector<Integer> ans = new Vector<>();

        while(high-low >= k){
            if(x - arr[low] > arr[high] - x ){
                low++;
            }
            else{
                high--;
            }
        }
        for(int i = low; i<=high; i++){
            ans.add(arr[i]);
        }
        System.out.println(ans);
    }

    static int findLowerBound(int arr[] , int x){
        int s = 0; 
        int e = arr.length-1;
        int mid = 0; 
        while(s<=e){
            mid = s + (e-s)/2;
            if(Math.abs(arr[mid] - x) <= arr[e] - x) e = mid-1;
            else s = mid+1;
        }
        return s;
    }

    static void findKClosestElementBS(int arr[] , int k , int x){
        int lowerBound = findLowerBound(arr , x);
        int h = lowerBound;
        int l = h-1;
    }
    public static void main(String[] args) {
        int arr[] = {12, 16, 22, 30 , 35, 39 , 42 , 45, 48 , 50 , 53, 55 , 56};
        // there's some bug..
        // Vector<Integer> closest = findKClosestElement(arr, 4, 35);
        // System.out.println(closest);



        // findKClosestElementTwoPointerApproach(arr, 4, 35);

        findKClosestElementBS(arr, 4, 35);
    }
}
