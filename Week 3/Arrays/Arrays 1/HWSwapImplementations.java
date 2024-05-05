public class HWSwapImplementations{
    static void printArray(int [] arr , int size){
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swapTempVar(int [] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void swapPlusMinus(int[] arr , int i , int j){
         arr[i] = arr[i] - arr[j];
         arr[j] = arr[i] + arr[j];
         arr[i] = arr[j] - arr[i];

    }
    static void swapXOR(int[] arr, int i, int j)
    {
        // Logic of XOR operator
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];

        
        
    }

    static void reverseArray(int [] arr, int size){

        System.out.println("Reversing an Array using different swap Implementations: ");

        System.out.println("Swapped using temp var");
        for(int i = 0 , j = size-1; i<=j; i++ , j--){
            swapTempVar(arr , i , j);
        }
        printArray(arr, size);

        System.out.println("Swapped using plus minus ");
        for(int i = 0 , j = size-1; i<=j; i++ , j--){
            swapPlusMinus(arr , i , j);
        }
        printArray(arr, size);

        System.out.println("Swapped using XOR Operator ");
        for(int i = 0 , j = size-1; i<=j; i++ , j--){
            swapXOR(arr , i , j);
        }
        printArray(arr, size);
    }

    public static void main(String args[]){
        int arr[] = {1, 2 ,3, 4, 5, 6, 7 , 8};
        reverseArray(arr, arr.length);
        
    }
}