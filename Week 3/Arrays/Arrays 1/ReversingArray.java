

public class ReversingArray {
    static void swap(int []arr ,int i , int j){
        int temp = arr[i];
        arr[i]  = arr[j];
        arr[j] = temp;
    }
    static void printArray(int [] arr , int size){
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void reversingArray(int arr[] , int size){
        for(int i = 0 , j = size-1; i<=j; i++ , j--){
            swap(arr , i , j);
        }
        printArray(arr, size);

    } 
    public static void main(String args[]){
        int arr[] = {1 , 2 , 3, 4, 5, 6, 7, 8 };
        System.out.println("The array before reversing");
        printArray(arr, arr.length);
        System.out.println("The array after reversing");
        reversingArray(arr, arr.length);
    }
}
