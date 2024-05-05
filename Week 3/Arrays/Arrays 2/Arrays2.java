import java.util.*;

public class Arrays2 {
    public static void main(String args[]){
        // Understanding Vectors in java:

// --> Initialising:
    Vector<Integer> v = new Vector<>(5);
    v.add(5);

// --> fetching element: using get(index);
    System.out.print(v.get(0));

// --> fetching capacity(): returns elements that can be stored in a vector:
    System.out.print(v.capacity());

// --> fetching size(): returns elements that are  stored in a vector:
    System.out.print(v.size());

// --> removing element remove(index): removes element
    v.remove(0);
    
// --> clearing element clear(): removes all element
    Vector<Integer> v2 = new Vector<>();
    for(int i = 0; i<5; i++){
        v2.add(i+1);
    }
    System.out.print(v2);
    v2.clear();
    System.out.print(v2);
    

    }
}
