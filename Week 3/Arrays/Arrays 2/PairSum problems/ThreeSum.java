import java.util.*;

public class ThreeSum{
    static void findThreeSum(Vector<Integer> v1 , int threeSum){
        for(int i = 0; i<v1.size(); i++){
            for(int j = i+1; j<v1.size(); j++){
                for(int k = j+1; k<v1.size(); k++){
                    if(v1.get(i) + v1.get(j) + v1.get(k) == threeSum){
                        System.out.printf("The ThreeSum pair is (%d , %d, %d)\n" , v1.get(i), v1.get(j), v1.get(k) );
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        Vector<Integer> v1 = new Vector<Integer>();
        for(int i = 0; i<6; i++){
            v1.add((i+1 )* 10);
        }
        System.out.println(v1);
        findThreeSum(v1 , 70);
    }
}