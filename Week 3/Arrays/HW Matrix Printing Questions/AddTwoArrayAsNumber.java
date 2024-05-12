import java.util.*;

public class AddTwoArrayAsNumber {
    static void addTwoArrayAsNumber(Vector<Integer> v1 , Vector<Integer> v2){
        int i = v1.size()-1;
        int j = v2.size()-1;
        int carry = 0;
        Vector<Integer> ans = new Vector<>();
        int x = 0; 

        while(i>=0 && j>=0){
            x = v1.get(i) + carry + v2.get(j);
            int digit = x%10;
            ans.add(digit);
            carry = x/10;
            i--; j--;
        }
        while(i>=0){
            x = v1.get(i) + carry + 0;
            int digit = x % 10;
            ans.add(digit);
            carry = x/10;
            i--;
        }
        while(j>=0){
            x = v2.get(j) + carry + 0;
            int digit = x % 10;
            ans.add(digit);
            carry = x/10;
            j--;
        }
        if(carry!=0){
            ans.add(carry);
        }
        // to remove the 0 at the starting
        while(ans.get(ans.size()-1) == 0){
            ans.remove(ans.size()-1);
        }
        String sumAns = new String();
        for(int k = ans.size()-1; k>=0; k--){
            sumAns += ans.get(k);
        }

        System.out.println(sumAns);

    }

    
    public static void main(String args[])
    {
        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>();
        v1.add(0);
        v1.add(2);
        v1.add(8);
        v2.add(2);
        v1.add(2);
        v1.add(8);
        v2.add(1);
        v2.add(2);
        System.out.println(v1);
        System.out.println(v2);
        addTwoArrayAsNumber(v1, v2);

        findFactorialOfLargeNumber(50);
    }
}
