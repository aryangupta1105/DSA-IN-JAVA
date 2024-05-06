import java.util.*;

public class TransposeOf2dArray {
    static void swap(int arr[][] , int i ,int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    static void findTransposeOf2dArray(int arr[][] , int size ){
        int transpose[][] = new int[size][arr[0].length];
        for(int i = 0; i<size; i++){
            for(int j = 0; j<arr[i].length; j++){
                transpose[i][j] = arr[j][i];
            }
        }
        System.out.println("Printing the Transpose of 2d Array");
        print2dArray(transpose, size);

    }

    static void print2dArray(int arr[][] , int size){
        for(int i = 0; i<size; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.printf(arr[i][j] + " ");
                
            }
            System.out.printf("\n");
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

        print2dArray(arr, arr.length);
        findTransposeOf2dArray(arr, arr.length);

       
    }
}
