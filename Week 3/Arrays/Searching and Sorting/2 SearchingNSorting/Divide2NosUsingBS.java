import java.util.*;

public class Divide2NosUsingBS {
    static int divide2NosUsingBS(int n1 , int n2){
        Scanner sc = new Scanner(System.in);
        int start = 0; 
        int end = n1;
        int ans = 0;
        int mid = 0;
        while(start<=end){
            
            mid = start + (end-start)/2;
            if(n1/n2 == mid) ans = mid;
            
            if (n1/n2 < mid) {
                end = mid-1;
            }
            else start = mid+1;
            
        }
        
        return mid;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int quotient = divide2NosUsingBS(n1, n2);
        System.out.println(quotient);
        System.out.println("Enter the precision:");
        
    }
}
