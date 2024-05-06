import java.util.*;
public class BuyAndSellStockLevel1 {
    static int buyAndSellStockLevel1(Vector<Integer> v){
        int best = Integer.MIN_VALUE;
        for(int i = 0; i<v.size(); i++){
            for(int j = i; j<v.size(); j++){
                if(v.get(j) - v.get(i) > best)
                {
                    best = v.get(j) - v.get(i);
                }
            }
        }
        return best;

    }
    public static void main(String args[]){
        Vector<Integer> v = new Vector<>();
        v.add(7);
        v.add(6);
        v.add(4);
        v.add(3);
        v.add(1);

        int best = buyAndSellStockLevel1(v);
        System.out.println(best);

    }
    
}
