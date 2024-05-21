import java.util.*;

public class Findkdiffpairs {
    static int findKdiffpairs(int arr[] , int k){
        int s = 0;
        int e = 0; 
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
    public static void main(String args[]){
        int arr [] = {1, 5, 3, 4, 2};
        int diff = findKdiffpairs(arr , 2);
        System.out.println(diff);
    }
}
