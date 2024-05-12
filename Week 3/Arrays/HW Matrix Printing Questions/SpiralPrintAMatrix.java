import java.util.Scanner;
import java.util.Vector;

public class SpiralPrintAMatrix {
    static void spiralPrintingAMatrix(int arr[][] , int m , int n){
        int startRow = 0; 
        int startCol = 0;
        int endCol = n-1;
        int endRow = m-1;
        int totalElements = m*n;
        int count = 0;
        Vector<Integer> ans = new Vector<>();
        while(count < totalElements){
            for(int i = startCol; i<=endCol && count < totalElements; i++){
                ans.add(arr[startRow][i]);
                count++;
            }
            startRow++;
            for(int i = startRow; i<=endRow && count < totalElements; i++){
                ans.add(arr[i][endCol]);
                count++;
            }
            endCol--;
            for(int i = endCol; i>=startCol && count < totalElements; i--){
                ans.add(arr[endRow][i]);
                count++;
            }
            endRow--;
            for(int i=endRow; i>=startRow && count < totalElements; i--){
                ans.add(arr[i][startCol]);
                count++;
            }
            startCol++;
        }
        System.out.println(ans);
        
    }
    public static void main(String args[]){
        int arr[][] = {
            {1 , 2, 3} , {4,5,6} , {7,8,9}
        };
        // Scanner sc = new Scanner(System.in);
        // for(int i = 0; i<3; i++){
        //     for(int j = 0; j<3; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        spiralPrintingAMatrix(arr, 3, 3);
    }
}
