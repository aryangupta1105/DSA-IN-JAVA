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

    static int findLowerBound(int arr[], int x) {
        int s = 0;
        int e = arr.length - 1;
        int mid = 0;
int ans = -1;
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                e = mid - 1;
            } else if(x>arr[mid]){
                s = mid + 1;
            }
            else{e = mid-1;}
        }
        return ans; // s will be the index where x would go
    }
    
    static void findKClosestElementBS(int arr[] , int k , int x){
        int lowerBound = findLowerBound(arr , x);
        int h = lowerBound;
        int l = h-1;
        Vector<Integer> ans = new Vector<>();
        while(k>=0){ 
            if(x - arr[l] >= arr[h] - x){
                h++;
            }
            else{
                l--;
            }
            k--;
        }
        for(int i = l+1; i<h-1; i++){
            ans.add(arr[i]);
        }
        System.out.println(ans);
        System.out.println(lowerBound);
    }
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,3,5,6,7,8,8};
        // int arr[] = {1,2,3,4,5};
        // there's some bug..
        // Vector<Integer> closest = findKClosestElement(arr, 4, 35);
        // System.out.println(closest);



        findKClosestElementTwoPointerApproach(arr, 2, 2);

        findKClosestElementBS(arr, 2, 2);
    }
}
