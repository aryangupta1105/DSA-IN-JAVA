import java.util.*;
public class MinElement2dArray{
    static int findMinElementIn2dArray(int arr[][] , int size ){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<size; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] <= min)
                    min = arr[i][j];
            }
        }
        return min;
    }
   public static void main(String args[]){
    int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

    Scanner sc = new Scanner(System.in);
        
        System.out.print("Taking Row wise input from user!\n");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.printf("Enter the element arr[%d][%d]:  " , i , j);
                arr[i][j] = sc.nextInt();
            }
        }

        int maxElement = findMinElementIn2dArray(arr, arr.length);
        System.out.println("The minimum element in 2d array is " + maxElement);
   }
}