import java.util.*;

public class LargeFactorialOfNumber {
    static void findFactorialOfLargeNumber(int number){
        Vector<Integer> ans = new Vector<>();
        ans.add(1);
        int carry = 0;
 
        for(int i = 2; i<=number ; i++){
             for(int j = 0; j<ans.size(); j++){
                 int x = ans.get(j) * i + carry;
                 ans.set(j , x % 10);
                 carry = x / 10;
 
             }
             while(carry > 0){
                 ans.add(carry%10);
                 carry /= 10;
             }
             carry = 0;
        }
        String result = new String();
        for(int i = ans.size()-1; i>=0; i--){
             result += ans.get(i);
        }
        System.out.println(result);
 
     }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();

        findFactorialOfLargeNumber(number);
    }
}
