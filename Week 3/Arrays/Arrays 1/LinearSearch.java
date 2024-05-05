import java.util.*;

public class LinearSearch {
    static int linearSearch(int arr[] , int size , int key){
        for(int i = 0; i<size; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr [] = {1, 3,2, 523, 53 ,21};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int index = linearSearch(arr , arr.length , key);
        if(index == -1)
            System.out.print("The key " + key+ " does not exist");
        else
            System.out.print("The key" + key+ " is present at index " + index);
    }
}
