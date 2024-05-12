import java.util.*;
public class FindSquareRoot {
    static int findSquareRoot(int number ){
        
        int start = 0; 
        int end = number-1;
        int ans = 0;
        int mid = 0;
        while(start<=end){
             mid = start + (end- start)/2;
            
            if(mid*mid < number)
            { 
                ans = mid;
                start = mid+1;
            }
            else if(mid*mid > number){
                end = mid-1;
            }
            if(mid*mid == number)
                return mid;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int ans  = findSquareRoot(number );
        double step = 0.1;
        System.out.println("Enter the number of floating digits: ");
        int precision = sc.nextInt();
        double finalAns = ans;
        for(int i = 0; i<precision; i++){
            for(double j = finalAns; j*j <= number; j = j+step){
                finalAns =  j;
            }
            step = step / 10;
        }
        System.out.println("The square root is " + finalAns);
    }
}
