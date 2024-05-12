import java.util.*;
public class BS2dArray {
    static int binarySearch2dMatrix(int arr[][] , int m , int n , int target){
        int rowIndex = 0;
        int colIndex = 0;
        int start = 0;
        int end = m*n -1;
        int mid = -1;
        while(start <= end){
            mid = start + (end- start)/2;
            rowIndex = mid/n;
            colIndex  = mid % n;
            if(arr[rowIndex][colIndex] ==target ){
                System.out.println(rowIndex + " " + colIndex);
                return mid;
            } 
            else if(arr[rowIndex][colIndex] <target)
            {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println(-1 + " " + -1);
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = {
            {1 , 2 ,3} , 
            {4, 5, 6} , 
            {7 , 8, 9}
        };
        
        int m = arr.length;
        int n = arr[0].length;
        
        // Taking user input for the target value...
        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        // retrieving index from binarySearch..
        int index = binarySearch2dMatrix(arr, 3, 3,target);

        // converting index into 2d Index of Array....
        System.out.printf("The element is present at (%d , %d) position." ,index/n , index%n);
    }
}
