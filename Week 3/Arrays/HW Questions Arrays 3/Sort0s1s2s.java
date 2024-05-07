import java.util.Vector;

// Also called Sort colors Question:
public class Sort0s1s2s {
    static void sort0s1s2sCount(Vector<Integer> v ){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i<v.size(); i++){
            if(v.get(i) == 0) count0++;
            else if(v.get(i) == 1) count1++;
            else if(v.get(i) == 2) count2++;
        }
        for(int i = 0; i<count0; i++){
            v.set(i , 0);
        }
        for(int i = 0; i<count1; i++){
            v.set(i+count0 , 1);
        }
        for(int i = 0; i<count0; i++){
            v.set(i+count0+count1 , 2);
        }

        System.out.println("Sorted 0s 1s and 2s using count Method: \n " + v);
    }

    static void swap(Vector<Integer> v ,int i ,int j){
        int temp = v.get(i);
        v.set(i , v.get(j));
        v.set(j , temp);
    }

    static void sort0s1s2sSwapping(Vector<Integer> v){
        int start = 0; 
        int i = 0;
        int end = v.size()-1;

        while(i<=end){
            if(v.get(i) == 0){
                swap(v , i , start);
                i++;
                start++;
            }
            else if(v.get(i) == 2){
                swap(v, i , end);
                end--;
            }
            else{
                i++;
            }
        }

        System.out.println("Sorted 0s 1s and 2s using Swapping Method: \n" + v);
    }
    public static void main(String args[]){
        Vector<Integer> v = new Vector<>();
        v.add(0);
        v.add(1);
        v.add(0);
        v.add(2);
        v.add(1);
        v.add(2);
        v.add(1);
        v.add(2);
        v.add(0);
        v.add(2);
        v.add(0);
        v.add(1);
        
        System.out.println(v);
        sort0s1s2sCount(v);
        
        
        Vector<Integer> v1 = new Vector<>();
        v1.add(0);
        v1.add(1);
        v1.add(2);
        v1.add(0);
        v1.add(1);
        v1.add(1);
        v1.add(2);
        v1.add(1);
        v1.add(0);
        System.out.println(v1);
        sort0s1s2sSwapping(v1);

    }
}
