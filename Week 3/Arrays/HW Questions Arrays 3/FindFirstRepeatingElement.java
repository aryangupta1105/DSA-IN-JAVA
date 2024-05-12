import java.util.*;
public class FindFirstRepeatingElement {
    // "returns" the index of first repeating element:
    static int findFirstRepeatingElement(Vector<Integer> v){
        int index = -1;
       for(int i = 0; i<v.size(); i++){
        for(int j = i+1; j<v.size(); j++){
            if(v.get(i) == v.get(j)){
                index = i+1;
                return index;
            }
        }
       }
       return index;
    } 
    static int findFirstRepeatingElementHashMethod(Vector<Integer> v){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<v.size(); i++){
            if(v.get(i) > max) max = v.get(i);
        }
        
        int HashArr[] = new int[max+1];
        for(int i = 0; i<v.size(); i++){
            HashArr[v.get(i)]++; 
        }
        // we need to traverse in original array to get the first repeated element ...
        for(int i = 0; i<v.size(); i++){
            if(HashArr[v.get(i)] > 1) return i+1;
        }
        return -1;
    }
    public static void main(String args[]){
        Vector<Integer> v  = new Vector<>();
        
        v.add(30);
        v.add(2);
        v.add(30);
        v.add(30);
        v.add(30);
        v.add(2);
        v.add(5);
        System.out.println(v);

        // Using Hash Method:
        int firstRepeatedElement = findFirstRepeatingElementHashMethod(v);
        System.out.println("The first repeated element is present at index: " + firstRepeatedElement);

        // Using Brute Force:
        int firstRepeatedElement2 = findFirstRepeatingElement(v);
        System.out.println("The first repeated element is present at index: " + firstRepeatedElement2);
    }
}
