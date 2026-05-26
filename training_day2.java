// write first max without using built in function
// import java.util.*;
// class Main{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
        
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
        
        
//         int max=arr[0];
//         for(int i=1; i<n; i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         System.out.print(max);
//     }
// }


// second max without using any built in function

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int max = 0;
//         int secondMax = 1;

//         for (int i = 0; i < n; i++) {
//             if (arr[i] > max) {
//                 secondMax = max;
//                 max = arr[i];
//             }
//             else if (arr[i] > secondMax && arr[i] != max) {
//                 secondMax = arr[i];
//             }
//         }
      
//             System.out.println("Second Largest Element is " + secondMax);

//         sc.close();
//     }
// }