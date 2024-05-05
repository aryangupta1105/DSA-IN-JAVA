import java.util.Scanner;
import java.util.Vector;

public class XORFindUniqueElement {
    static int findUniqueElement(Vector <Integer> v){
        int ans = 0;
        for(int i = 0; i<v.size(); i++){
            ans = ans ^ v.get(i);
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        Vector<Integer> v = new Vector<>(n);
        
        System.out.println("Enter the elements of array:");
        for(int i = 0; i<v.capacity(); i++){
            int e = sc.nextInt();
            v.add(e);
        }

        int uniqueElement = findUniqueElement(v);
        System.out.println("The unique element is " + uniqueElement);


    }
}
