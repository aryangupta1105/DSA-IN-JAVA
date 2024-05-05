

public class ExtremePrintArray {
    static void extremePrintArray(int arr[] , int size){
        for(int i = 0 , j = size-1; i<=j; i++ , j--){
            // to not print 2times as i and j both prints
            if(i==j)
            System.out.print(arr[i] + " ");
            else
            System.out.print(arr[i] + " " + arr[j] + " ");

        }
    }
    public static void main(String args[]){
        int arr[] = {1, 4, 3,2 ,6 , 63 , 33};
        extremePrintArray(arr, arr.length);
    }
    
}
