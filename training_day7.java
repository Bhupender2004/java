
// Bit Manipulation


// 1. Find the single no. in the array.
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }

//         int ele = 0;
//         for(int i=0; i<n; i++){
//             ele=ele^arr[i];
//         }
//         System.out.print(ele);
//     }
    
// }




// Count Set bits
// import java.util.*; 
// public class training_day7{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//         int count=0;
//         while(n>0){
//             if((n&1)==1){
//                 count++;
//             }
//             n=n>>1;
//         }
//         System.out.print(count);

//     }
// }


// Find missing no. in the array using bit opertion.
import java.util.*;
class training_day7{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int val=0;
        for(int i=0; i<=n; i++){
            val=val^i;
        }
        for(int i=0; i<n; i++){
            val=val^arr[i];
        }
        System.out.print(val);
    }
}