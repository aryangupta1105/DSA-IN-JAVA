import java.util.*;
public class MaxElement2dArray{
    static int findMaxElementIn2dArray(int arr[][] , int size ){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<size; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] >= max)
                    max = arr[i][j];
            }
        }
        return max;
    }
   public static void main(String args[]){
    int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

    Scanner sc = new Scanner(System.in);
        
        
        // Taking Row wise input from user:
        
        System.out.print("Taking Row wise input from user!\n");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.printf("Enter the element arr[%d][%d]:  " , i , j);
                arr[i][j] = sc.nextInt();
            }
        }

        int maxElement = findMaxElementIn2dArray(arr, arr.length);
        System.out.println("The maximum element in 2d array is " + maxElement);
   }
}