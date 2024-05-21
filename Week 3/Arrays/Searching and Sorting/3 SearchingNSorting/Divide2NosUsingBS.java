import java.util.*;

public class Divide2NosUsingBS {
    static int divide2NosUsingBS(int n1 , int n2){
        Scanner sc = new Scanner(System.in);
        int start = 0; 
        int end = Math.abs(n1);
        int ans = 0;
        int mid = 0;
        while(start<=end){
            
            mid = start + (end-start)/2;
            if(Math.abs(n1)== Math.abs(mid*n2)) {
                ans = mid;
                break;
            }
            
            if (Math.abs(n1) < Math.abs(mid*n2)) {
                end = mid-1;
            }
            else{ 
                ans = mid;
                start = mid+1;
            }
            
        }
       if((n1>0 && n2>0) || (n1<0 && n2<0))
            return ans;
       else 
            return -ans;
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int divident = sc.nextInt();
        int divisor = sc.nextInt();
        int quotient = divide2NosUsingBS(divident, divisor);
        System.out.println(quotient);
        System.out.println("Enter the number of floating digits: ");
        int precision = sc.nextInt();
        int remainder = divident%divisor;
        double step = 0.1;
        double finalAns = quotient;
        for (int i = 0; i < precision; i++) {
            while ((finalAns + step) * divisor <= divident) {
                finalAns += step;
            }
            step /= 10;
        }
        System.out.println("The square root is " + finalAns);
       
        
    }
}
