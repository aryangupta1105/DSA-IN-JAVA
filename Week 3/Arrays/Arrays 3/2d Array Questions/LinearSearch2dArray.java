import java.util.*;

public class LinearSearch2dArray {
    static void linearSearch2dArray(int arr[][] , int size , int key){
        for(int i = 0; i<size; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] == key)
                System.out.printf("The %d is present at (%d, %d).\n" , key , i, j);
            }
        }
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

        linearSearch2dArray(arr, arr.length, 5);
   }
}
