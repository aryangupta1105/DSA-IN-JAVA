

public class FindMaxElement {
    static int findMax(int arr[] ,int size){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<size; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[] = {1 , 32, 52, 2 , 3 ,54 , 8};
        int max = findMax(arr, arr.length);
        System.out.println("The maximum element in the array is " + max);
    }
}
