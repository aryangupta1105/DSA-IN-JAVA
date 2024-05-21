import java.util.*;

public class FindOddOccuringElement {
    // using xor method
    static void findOddOccuringElement(int arr[]){
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            ans = ans^arr[i];
        }
        System.out.println(ans);
    }
    static int findOddOccuringElementBS(int arr[]){
        int s = 0;
        int e= arr.length-1;
        int mid = 0;
        int ans = 0;
        while(s<e){
            mid = s + (e-s)/2;
            if(mid%2 == 0 )
            {
                if(arr[mid] == arr[mid+1])
                s= mid+2;
                else if(arr[mid] == arr[mid-1])
                e = mid-2;
                else{
                    return mid;
                }
            }  
            else{
                if(arr[mid] == arr[mid-1])
                    s= mid+1;
                else if(arr[mid] == arr[mid+1]){
                    ans = mid;
                    e = mid-1;
                }
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2,2, 3, 3, 4, 4, 5,5,2 , 4 ,4, 5, 5, 3, 3 };
        // findOddOccuringElement(arr);
        int ans = findOddOccuringElementBS(arr);
        System.out.println(ans);

    }
}
