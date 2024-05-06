import java.util.Vector;

public class PairSum {
    static void findPairSum(Vector <Integer> v1 , int sum){
        for(int i = 0; i<v1.size(); i++){
            for(int j = 0; j<v1.size(); j++){
                if(v1.get(i) + v1.get(j) == sum){
                    // ans.add({v1.get(i) , v1.get(j)});
                    System.out.printf("The (%d , %d) is the pair sum" , v1.get(i) , v1.get(j));
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Vector<Integer> v1 = new Vector<>();
        for(int i = 0; i<10; i++){
            v1.add(i+1);
        }
        System.out.println(v1);
        findPairSum(v1, 6);

    }
}
