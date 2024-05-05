import java.util.Vector;

public class UnionOf2Arrays {
    // if no duplicates present
    static void unionOf2Arrays(Vector<Integer> v1 , Vector<Integer> v2){
        Vector<Integer> ans = new Vector<>();
        for(int i = 0; i<v1.size(); i++){
            ans.add(v1.get(i));
        }
        for(int i = 0; i<v2.size(); i++){
            ans.add(v2.get(i));
        }

        System.out.println("The union of 2 arrays is: ");
        System.out.println(ans);
    }
    // if duplicates are also present
    static void unionOf2ArraysDuplicates(Vector<Integer> v1 , Vector<Integer> v2)
    {
        Vector<Integer> ans = new Vector<>();
        for(int i = 0; i<v1.size(); i++){
            for(int j = 0; j<v2.size(); j++){
                if(v1.get(i) != v2.get(j)){
                    ans.add(v1.get(i));
                }
            }
        }
        for(int i = 0; i<v2.size(); i++){
            ans.add(v2.get(i));
        }

        System.out.println(ans);
    }
    public static void main(String args[]){
        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>();

        for(int i = 0; i<5; i++){
            v1.add(i+1);
            v2.add(i+11);
        }
        System.out.println("The array 1: " + v1);
        System.out.println("The array 2: " + v2);
        unionOf2Arrays(v1, v2);

    }
}
