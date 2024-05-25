
public class FindMissingElementBS {
    static int findMissingElement(int arr[]){
        int start = 0; 
        int end= arr.length-1;
        int ans = -1;
        int mid = 0;
        while(start<=end){
            mid = start + (end - start) /2;
            if (arr[mid] - mid == 1)
            {
                start = mid+1;
            }
            else{ 
               ans = mid;
               end = mid-1;
            }  
            
        }
        if(ans + 1 == 0){
            return start+1;
        }
        
        return ans+1;
    }
    


    static int findMissingElementCountMethod(int arr[] , int size){
        // size+1 because length of array is one less as 1 element is missing..
        int sum = (size+1)* (size+2) /2;
        int newSum = 0;
        for(int i = 0; i<size; i++){
            newSum += arr[i];
        }
        System.out.println(newSum);
        System.out.println(sum);
        int missingElement = sum - newSum;
        System.out.println(missingElement);
        return missingElement;
    }
    public static void main(String[] args) {
        int arr[]  = { 1 , 2  ,3 ,4 ,5 ,6, 7};
        // int missingElement = findMissingElement(arr);
        // System.out.println(missingElement);
        // findMissingElementCountMethod(arr , arr.length);
        int missing = findMissingElement(arr);
        System.out.println(missing);
    }
}
