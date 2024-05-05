
public class Count1s0s {
    static void count1s0s(int arr[] , int size){
        int numZeroes = 0;
        int numOnes = 0;
        for(int i = 0; i<size; i++){
            if(arr[i] == 1){
                numOnes += 1;
            }
            else if(arr[i] == 0){
                numZeroes += 1;
            }
        }
        System.out.println("The number of Zeroes: " + numZeroes + "\nThe number of ones: " + numOnes);
    }
    public static void main(String args[]){
        int arr[] = { 1, 1, 0, 0 ,1, 1 , 0};
        count1s0s(arr, arr.length);
    }
}
