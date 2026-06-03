
// Bit Manipulation


// 1. Find the single no. in the array.
import java.util.*;
public class training_day7 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int ele = 0;
        for(int i=0; i<n; i++){
            ele=ele^arr[i];
        }
        System.out.print(ele);
    }
    
}
