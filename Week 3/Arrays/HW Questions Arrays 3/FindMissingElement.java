import java.util.*;

public class FindMissingElement {

    // Negative Marking Method:
    static void findMissingElement(Vector<Integer> v){
        int ans = -1;
        for(int i = 0; i<v.size(); i++){
            int index = Math.abs(v.get(i));
           if(v.get(index -1) >0)  
                v.set(index-1 , v.get(index -1 ) * -1);

        }
        System.out.print("The missing elements are: ");
        for(int i = 0; i<v.size(); i++){
            if(v.get(i) > 0)
            {
                System.out.print((i+1) + " ");
        }
    }
    
}

    static void swap(Vector<Integer> v , int i , int j){
        int temp = v.get(i);
        v.set(i , v.get(j));
        v.set(j , temp);
    }

    static void findMissingElementSwapNSort(Vector<Integer> v){
        int ans = 0; 
        int i = 0;
        while(i<v.size()){
            int index = v.get(i) -1;
            if(v.get(index) != v.get(i)){
                swap(v , index , i);
            }
            else i++;
        }
        for(int  j= 0; j<v.size(); j++){
            if(v.get(j) != j+1) {
                ans = j+1;
                System.out.println(ans);
    }
        }
        System.out.println(v);;
    }

    public static void main(String args[]){

        // Missing Element using Negative Marking method:
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(3);
        v.add(3);
        v.add(3);
        v.add(5);
        
        System.out.println(v);
        // findMissingElement(v);
        findMissingElementSwapNSort(v);
    }
}
