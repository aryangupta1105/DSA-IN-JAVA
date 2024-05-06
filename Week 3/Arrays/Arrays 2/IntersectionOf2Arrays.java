import java.util.Vector;

public class IntersectionOf2Arrays {
    static void intersectionOf2Arrays(Vector<Integer> v1 , Vector<Integer> v2){
        Vector<Integer> ans = new Vector<>();
        int flag = 0; 
        for(int i = 0; i<v1.size(); i++){
            for(int j = 0; j<v2.size(); j++)
            {
                if(v1.get(i) == v2.get(j)) {
                    v2.set(j , -1);
                    flag = 1;
                    break;
                }
                else{
                    flag = 0;
                }
            }
            if(flag == 1) ans.add(v1.get(i));
        }
      
        System.out.println(ans);
    }
    public static void main(String args[]){
        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>();
        
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(4);
        v1.add(5);
        v2.add(4);
        v2.add(4);
        v2.add(3);
        v2.add(3);
        v2.add(5);
        v2.add(6);

        System.out.println(v1);
        System.out.println(v2);

        intersectionOf2Arrays(v1, v2);
    }
}
