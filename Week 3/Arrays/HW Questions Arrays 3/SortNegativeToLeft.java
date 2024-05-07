import java.util.*;
public class SortNegativeToLeft {

    static void swap(Vector<Integer> v ,int i ,int j){
        int temp = v.get(i);
        v.set(i , v.get(j));
        v.set(j , temp);
    }

    static void sortNegativeToLeft(Vector<Integer> v){
        int start = 0; 
        int i = 0;
        int end = v.size()-1;

        while(i<=end){
            if(v.get(i) < 0){
                swap(v , i , start);
                i++;
                start++;
            }
            else if(v.get(i) >= 0){
                swap(v, i , end);
                end--;
            }
        }

        System.out.println("Sorted 0s 1s and 2s using Swapping Method: \n" + v);
    }
    public static void main(String args[]){
        Vector<Integer> v = new Vector<>();
        v.add(0);
        v.add(-1);
        v.add(0);
        v.add(2);
        v.add(-1);
        v.add(2);
        v.add(1);
        v.add(-2);
        v.add(0);
        v.add(-52);
        v.add(0);
        v.add(1);
        
        System.out.println(v);
        sortNegativeToLeft(v);
    }
}
