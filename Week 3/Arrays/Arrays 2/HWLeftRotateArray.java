import java.util.*;
public class HWLeftRotateArray {
    static void nleftRotatingAnArray(Vector<Integer> v , int d){
        int i;
        while(d>0){
            int temp = v.get(0);
            for( i = 0; i<v.size()-1; i++){
                v.set(i , v.get(i+1));
            }
            v.set(v.size() -1 , temp);
            d--;
        }

        System.out.println("Rotated by " + d +" shifts:\n" + v);
    }
    static void leftRotatingAnArray(Vector<Integer> v ){
        int i;
            int temp = v.get(0);
            for( i = 0; i<v.size()-1; i++){
                v.set(i , v.get(i+1));
            }
            v.set(v.size() -1 , temp);

        System.out.println("Left Rotated by 1 shift:\n" + v);
    }
    public static void main(String args[]){
        Vector<Integer> v = new Vector<>();
        for(int i = 0 ; i<10; i++){
            v.add(i+1);
        }
        System.out.println("Before Rotating: \n" + v);
        nleftRotatingAnArray(v, 2);
        
        System.out.println("Before Rotating: \n" + v);
        leftRotatingAnArray(v);
    }
    
}
