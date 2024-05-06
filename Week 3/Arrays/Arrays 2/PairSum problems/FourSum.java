import java.util.*;

public class FourSum {
    static void findFourSum( Vector<Integer> v1 , int fourSum){
        for(int i = 0; i<v1.size(); i++){
            for(int j = i+1; j<v1.size(); j++){
                for(int k = j+1; k<v1.size(); k++){
                    for(int l = k+1; l<v1.size(); l++){
                        if(v1.get(i) + v1.get(j) + v1.get(k) + v1.get(l) == fourSum){
                            System.out.printf("The foursum Pair is (%d, %d, %d, %d)," , v1.get(i),v1.get(j),v1.get(k),v1.get(l));
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        Vector<Integer> v1 = new Vector<>();
        for(int i = 1; i<10; i++){
            v1.add(i*10);
        }
        System.out.println(v1);
        findFourSum(v1, 100);
    }
    
}
