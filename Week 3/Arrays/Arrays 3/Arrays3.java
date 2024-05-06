import java.util.Scanner;
import java.util.Vector;

// 2d Arrays and 2d Vectors: 
public class Arrays3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    // -->Initialisation of 2d Arrays:
    
        // int arr[][] = new int[3][3];
        // int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        
        
        
        // // Taking Row wise input from user:
        
        // System.out.print("Taking Row wise input from user!\n");
        // for(int i = 0; i<3; i++){
        //     for(int j = 0; j<3; j++){
        //         System.out.printf("Enter the element arr[%d][%d]:  " , i , j);
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        
        // System.out.println("Printing Row wise!");
        // for(int i = 0; i<3; i++){
        //     for(int j = 0; j<3; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.print("\n");
        // }
        
        
        // // Taking Column wise input from user:
        // System.out.print("Taking Column wise input from user!\n");
        // for(int i = 0; i<3; i++){
        //     for(int j = 0; j<3; j++){
        //         System.out.printf("Enter the element arr[%d][%d]:  " , j , i);
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        // System.out.println("Printing Column wise!");
        // for(int i = 0; i<3; i++){
        //     for(int j = 0; j<3; j++){
        //         System.out.print(arr[j][i] + " ");
        //     }
        //     System.out.print("\n");
        // }

        

        // 2d Vectors:

    // -->Initialising 2d Vectors:
        Vector<Vector<Integer>> Arr = new Vector<>();
        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>();
        Vector<Integer> v3 = new Vector<>();

        for(int i = 0; i<3; i++){
            v1.add(i+30);
            v2.add(i+10);
            v3.add(i+20);
        }

        Arr.add(v1);
        Arr.add(v2);
        Arr.add(v3);

        System.out.println(Arr);
    // -->Accessing elements in 2d Array:

        for(int i = 0; i<Arr.size(); i++){
            for(int j = 0; j<Arr.get(i).size(); j++){
                System.out.print(Arr.get(i).get(j) + " ");
            }
            System.out.print("\n");
        }



    }
}
