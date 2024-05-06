import java.util.*;
public class FindDuplicateElement {

    static void findDuplicateElement(Vector<Integer> v){
        System.out.print("The duplicate elements are ");
        int flag = 0; 
        int dup = 0;
        for(int i = 0; i<v.size(); i++){
            for(int j = 0; j<v.size(); j++){
                if(v.get(i) == v.get(j)){
                    flag = 1;
                    break;
                }
                else flag = 0;
            }
            if (flag == 1) System.out.print(v.get(i) + " ");
        }
    }
    public static void main(String args[]){
        Vector<Integer> v = new Vector<>();
        for(int i = 0; i<5; i++){
            v.add(i);
        }
        v.add(2);
        v.add(3);
        v.add(4);

        System.out.println(v);
        findDuplicateElement(v);

    }
}
