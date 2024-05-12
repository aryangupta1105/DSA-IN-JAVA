import java.util.*;
public class SearchInRotatedSortedArray {
    static int searchInRotatedSortedArray(int arr[] , int key){
        int start = 0;
        int end = arr.length-1;
        int ans =0;
        int mid = 0;
        while(start<end){
            mid= start + (end - start)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(key < arr[end] && arr[mid] < end) start= mid+1;
            else end = mid;
        }
        return mid;

    }
    public static void main(String[] args) {
        int arr[] = { 5, 6, 7 ,8,9 , 1, 2, 3, 4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        int index = searchInRotatedSortedArray(arr , key);
        System.out.printf("The key %d is present at index %d." , key , index);
    }
}
