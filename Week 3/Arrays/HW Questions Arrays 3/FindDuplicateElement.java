import java.util.*;
public class FindDuplicateElement {

    static void findDuplicateElement(Vector<Integer> v){
        System.out.print("The duplicate elements are ");
        int i = 0;
        while(i<=v.size()-1)
        {
            for(int j = i+1; j<v.size(); j++){
                if(v.get(i) == v.get(j)){
                    System.out.print(v.get(i) + " ");
                    break;
                }
            }
            i++;
        }
    }
    static void swap(Vector<Integer> v, int i , int j){
        int temp = v.get(i);
        v.set(i , v.get(j));
        v.set(j , temp);

    }
    // Positioning Method:
    static void findDuplicateElementPositioning(Vector<Integer> v){
        
        while(v.get(v.get(0)) != v.get(0)){
                swap(v , 0 , v.get(0));
            }
            
            System.out.println("Finding Duplicate using Positioning Method: " + v.get(0));
            System.out.println("Finding Duplicate using Positioning Method: " + v.get(v.get(0))); 
        }
    
    static void findDuplicateElementNegativeMarking(Vector<Integer> v){
        int ans = -1;
        for(int i = 0; i<v.size(); i++){
            int index = Math.abs(v.get(i));
            if(v.get(index) < 0){
                ans = index;
            }

            v.set(index , v.get(index) * -1);
        }
        
        System.out.println("Duplicate element using Negative Marking method: " + ans);
    }
        public static void main(String args[]){
            Vector<Integer> v = new Vector<>();
            // Traversing Method:
            for(int i = 0; i<5; i++){
                v.add(i+1);
            }
            v.add(2);
            v.add(3);
            
            System.out.println(v);
            findDuplicateElement(v);
            
            // Positioning Method:
            System.out.println();
            
            Vector<Integer> v1 = new Vector<>();
            for(int i = 0; i<5; i++){
                v1.add(i+1);
        }
        v1.add(2);
        v1.add(2);
        
        System.out.println(v1);
        findDuplicateElementPositioning(v1);
        
        // Negative Marking Method:

        findDuplicateElementNegativeMarking(v1);
    }
}
