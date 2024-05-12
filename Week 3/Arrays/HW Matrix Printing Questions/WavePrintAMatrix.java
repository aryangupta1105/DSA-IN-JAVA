import java.util.*;

public class WavePrintAMatrix {
    // Column Wise wave printing
    static void wavePrintingAMatrixColumnWise(int arr[][] , int m , int n){
      
        for(int i = 0; i<n; i++){
            if(i%2 == 0){
                for(int j = 0; j<m; j++){
                    System.out.print(arr[j][i] + " ");
                }
            }
            else{
                for(int j = m-1; j>=0; j--){
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
    }
    // Row Wise wave printing
    static void wavePrintingAMatrixRowWise(int arr[][] , int m , int n){
      
        for(int i = 0; i<m; i++){
            if(i%2 == 0){
                for(int j = 0; j<n; j++){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for(int j = n-1; j>=0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
    public static void main(String args[]){
            int arr[][] = new int[3][4];
            Scanner sc = new Scanner(System.in);
            int k = 0;
            System.out.println("Enter the elements: ");
            for(int i = 0; i<3; i++){
                for(int j = 0; j<4; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            wavePrintingAMatrixRowWise(arr, 3,4);
    }
}
