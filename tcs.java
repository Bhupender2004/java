
// Move Zero
// import java.util.*;
// public class tcs {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         int idx=0;
//         for(int i=0; i<n; i++){
//             if(arr[i]!=0){
//                 arr[idx]=arr[i];
//                 idx++;
//             }
//         }
//         while(idx<n){
//             arr[idx]=0;
//             idx++;
//         }
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


// Second Largest

import java.util.*;
public class tcs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest&&arr[i]!=largest){
                secondLargest=largest;
            }
        }

        if(secondLargest==Integer.MIN_VALUE){
            System.out.print("Second Largest doesn't exist.");
        }else{
            System.out.print(secondLargest);
        }
    }
}