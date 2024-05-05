

public class FindMinElement {
    static int findMin(int arr[] ,int size){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<size; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int arr[] = { 32, 52,54 , 8 , 23 , 34};
        int min = findMin(arr, arr.length);
        System.out.println("The minimum element in the array is " + min);
    }
}
