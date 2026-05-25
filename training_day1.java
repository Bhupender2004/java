// import java.util.Scanner;

// public class training_day1 {
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int [] arr1={1,2,3,4};
//         int [] arr2={2,3,5,6};
        
//         for(int i=0; i<arr1.length; i++){
//             for(int j=0; j<arr2.length; j++){
//                 if(arr1[i]==arr2[j]){
//                     System.out.print(arr1[i]+" ");
//                 }
//             }
//         }
//     }
// }



// sum of the digit of a given no.
// import java.util.*;
// class Main{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a no.: ");
//         int n = sc.nextInt();
//         int sum=0;
//         while(n!=0){
//             sum+=n%10;
//             n=n/10;
//         }
//         System.out.print(sum);
//     }
// }


//Strong Number..

// import java.util.*;
// class Main{
//     public static void main(String [] args){
//         Scanner sc  = new Scanner(System.in);
//         System.out.print("Enter a no.: ");
//         int n = sc.nextInt();
//         int temp=n;
//         int sum=0;
//         while(n!=0){
//             int dig = n%10;
//             int fact=1;
//             for(int i=1; i<=dig; i++){
//                 fact=fact*i;
//             }
//             sum=sum+fact;
//             n=n/10;
//         }
//         if(sum==temp){
//             System.out.println("Strong Number");
//         }else{
//             System.out.println("Not a Strong Number");
//         }
//     }
// }