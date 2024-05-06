import java.util.*;

public class RowSumPrint {
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

        

        System.out.println("Printing column Sum!");
        for(int i = 0; i<3; i++){
            int rowSum = 0;
            for(int j = 0; j<3; j++){
                rowSum += arr[j][i];
            }
            System.out.print("The column " + i+ " sum: "+ rowSum + "\n");
           
        }
   }
}
