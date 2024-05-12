import java.util.*;

public class CommonElementsIn3SortedArray {
    // if not sorted:
    static void findCommonElementsIn3SortedArrayHashingMethod(Vector<Integer> v1 , Vector<Integer> v2 , Vector<Integer> v3){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<v1.size(); i++){
            if(v1.get(i) > max) max = v1.get(i);
        }
        for(int i = 0 ; i<v2.size(); i++){
            if(v2.get(i) > max) max = v2.get(i);
        }
        for(int i = 0 ; i<v3.size(); i++){
            if(v3.get(i) > max) max = v3.get(i);
        }
        int [] HashArr = new int[max+1];

        // counting the occurrences:
        for(int i = 0 ; i<v1.size(); i++){
            HashArr[v1.get(i)]++;
        }
        for(int i = 0 ; i<v2.size(); i++){
            HashArr[v2.get(i)]++;
        }
        for(int i = 0 ; i<v3.size(); i++){
            HashArr[v3.get(i)]++;
        }

        System.out.print("The common elements in 3 arrays are: ");
        for(int i = 0; i<HashArr.length; i++){
            if(HashArr[i] >= 3 ) System.out.println(i);
        }
    }

    // if sorted:
    static void removeDuplicate(Vector<Integer> v){
        for(int i = 0; i<v.size(); i++){
            for(int j = i+1; j<v.size(); j++){
                if(v.get(i) == v.get(j)) v.remove(i);
            }
        }
    }
    
    static Set<Integer> findCommonElementsIn3SortedArray(Vector<Integer> v1 , Vector<Integer> v2 , Vector<Integer> v3){
        int k = 0;
        int j = 0;
        int i = 0;
        // using set or we can remove duplicates before:
        Set<Integer> st = new HashSet<>();
        removeDuplicate(v3);
        removeDuplicate(v1);
        removeDuplicate(v2);
        System.out.print("The common elements in 3 sorted array are By removing duplicates: ");
        while(i<v1.size() && j<v2.size() && k<v3.size()){
            if(v1.get(i) == v2.get(j) && v2.get(j) == v3.get(k) )
            {
                st.add(v1.get(i));
                System.out.print(v1.get(i) + " ");
                i++; j++; k++;
            }
            else if(v1.get(i) < v2.get(j)){
                i++;
            }
            else if(v2.get(j) < v3.get(k)){
                j++;
            }
            else k++;
        }
        return st;
    }
    
    

    public static void main(String args[]){
        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>();
        Vector<Integer> v3 = new Vector<>();

        for(int i = 0; i<5; i++){
            v1.add(i+1);
            v3.add(i+10);
            v2.add(i+20);
        }

        v1.add(45);
        v2.add(45);
        v3.add(45);
        v1.add(45);
        v2.add(45);
        v3.add(45);
        v1.add(46);
        v2.add(46);
        v3.add(46);
        // v1.add(45);


        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        // Using Hash Method also works for not sorted array:
        findCommonElementsIn3SortedArrayHashingMethod(v1, v2, v3);

        
        // using loops: 
        Set<Integer> st = new HashSet<>();
        st = findCommonElementsIn3SortedArray(v1, v2, v3);
        System.out.println();
        System.out.println("The set of common elements: " + st);

    }
}
