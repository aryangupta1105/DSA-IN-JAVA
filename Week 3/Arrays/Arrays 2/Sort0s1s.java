import java.util.*;
public class Sort0s1s {

    static void sort0s1sCount(Vector<Integer> v){
        int count0s = 0;
        int count1s = 0;
        for(int i = 0; i<v.size(); i++){
            if(v.get(i) == 0) count0s++;
            else if(v.get(i) == 1) count1s++;
        }
        for(int i = 0; i<v.size(); i++){
            if(i<count0s)
            v.set(i , 0);
            else
            v.set(i , 1);
        }
        System.out.println("Sorted 0s and 1s using Counting Method: "+ v);
    }
    static void swap(Vector<Integer> v ,int i ,int j){
        int temp = v.get(i);
        v.set(j , v.get(i));
        v.set(i, temp);
    }
    
    static void sort0s1sSwapping(Vector<Integer> v){
        int start = 0;
        int end = v.size() -1;
        int i = 0;
        while(start<=end){
            if(v.get(i) == 0){
                swap(v , i , start);
                start++;
                i++;
            }
            else if(v.get(i) == 1){
                swap(v , i , end);
                end--;
                i++;
            }
            
        }

        System.out.println("Sorted 0s and 1s using Swapping: "  + v);
    }
    public static void main(String args[]){
        Vector<Integer> v = new Vector<>();
        for(int i = 0; i<8; i++){
            if(i%2 == 0) v.add(0);
            else v.add(1);
        }
        v.add(1);
        v.add(1);
        v.add(0);
        v.add(0);
        System.out.println("Unsorted Array: " + v);
        sort0s1sCount(v);
        
        Vector<Integer> v1 = new Vector<>();
        for(int i = 0; i<8; i++){
            if(i%2 == 0) v1.add(0);
            else v1.add(1);
        }
        v1.add(1);
        v1.add(1);
        v1.add(0);
        v1.add(0);
        System.out.println("Unsorted Array: " + v1);

        sort0s1sSwapping(v1);
    }
}
