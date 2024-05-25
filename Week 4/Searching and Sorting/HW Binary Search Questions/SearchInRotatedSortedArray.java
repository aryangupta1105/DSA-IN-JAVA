
public class SearchInRotatedSortedArray {
    static int findPivotIndex(int arr[]){
        int s = 0; 
        int e = arr.length-1;
        int mid = s + (e-s)/2;
        while(s<=e){
            if(s==e) return s;
            if(mid<=e && arr[mid] > arr[mid+1]) return mid; 

            if(mid-1 >= s && arr[mid-1] > arr[mid]) return mid-1;

            if(arr[mid] < arr[s]) e = mid-1;
            else s = mid + 1;

            mid = s + (e-s)/2;
            System.out.println("s" + s + "e" + e + "mid" + mid);
        }
        
        return -1;
    }

    static int binarySearch(int arr[] , int s , int e, int target){
        int mid = s + (e-s)/2;
        while(s<=e){
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) e = mid-1;
            else s = mid +1;
            mid = s + (e-s)/2;
        }
        return -1;
    }
    static int search(int[] nums, int target) {
        int pivotIndex = findPivotIndex(nums);
        int ans = -1;
        if(pivotIndex == -1) return binarySearch(nums, 0, nums.length-1, target);

        if(nums[0] <= target && nums[pivotIndex] >= target){
            ans = binarySearch(nums , 0 , pivotIndex , target);
        }
        else ans = binarySearch(nums, pivotIndex+1 , nums.length-1 , target);

        return ans;
    }

    public static void main(String args[]){
        int arr[] = {1,3};
        int index = search(arr , 1);
        System.out.println("The element is present at index: " + index);

    }
}
