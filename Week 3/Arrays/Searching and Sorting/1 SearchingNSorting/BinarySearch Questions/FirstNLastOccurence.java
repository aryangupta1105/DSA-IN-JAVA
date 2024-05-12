public class FirstNLastOccurence {
    static int findFirstOccurrence(int arr[] ,int key){
        int start = 0; 
        int end = arr.length -1;
        int ans = 0;
        while(start <= end){
            int mid = start + (end -start) /2;  
            if(arr[mid] == key)
             {
                ans = mid;
                end = mid-1;
            }

            else if (arr[mid] > key) end = mid-1;
            else start = mid+1;
        }

        System.out.println("The first occurrence of " + key + " is at index " + ans);
        return ans;
    }
    
    static int findLastOccurrence(int arr[] ,int key){
        int start = 0; 
        int end = arr.length -1;
        int ans = 0;
        while(start <= end){
            int mid = start + (end -start) /2;  
            if(arr[mid] == key)
             {
                ans = mid;
                start = mid+1;
            }

            else if (arr[mid] > key) end = mid-1;
            else start = mid+1;
        }
        System.out.println("The last occurrence of " + key + " is at index " + ans);
        return ans;
    }
    static int findTotalOccurrence(int arr[] ,int key){
        int firstOccurrence = findFirstOccurrence(arr, key);
        int LastOccurrence = findLastOccurrence(arr, key);
        int totalOccurrence = LastOccurrence - firstOccurrence + 1;
        return totalOccurrence;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3 , 3, 4, 4 , 4, 4 ,4, 5, 5, 5, 8};
        // findFirstOccurrence(arr, 4);
        // findLastOccurrence(arr, 4);
        System.out.println(findTotalOccurrence(arr, 4));
    }
}
