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


// min element in the array without using any built in func
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int min=arr[0];
//         for(int i=1; i<n; i++){
//             if(arr[i]<min){
//                 min=arr[i];
//                 System.out.print(min);
//             }
//         }
//     }
// }


// reverse the array
// import java.util.*;
// public class training_day2{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         System.out.print("Enter array: ");
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
        
//         int a=0;
//         int b=n-1;
        
//         while(a<b){
//             int temp=arr[a];
//             arr[a]=arr[b];
//             arr[b]=temp;
            
//             a++;
//             b--;
            
//         }
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }




// import java.util.*;
// class Main{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             int start=i;
//             int step=n-1;
            
//             for(int j=1; j<=i; j++){
//                 System.out.print(start+" ");
//                 start+=step;
//                 step-=1;
//             }
//             System.out.println();
//         }
//     }
// }





// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int num = 1;

//         for (int i = 1; i <= n; i++) {
//             int start = num + i - 1;
//             for (int j = 1; j <= i; j++) {
//                 if (i % 2 == 0) {
//                     System.out.print(start-- + " ");
//                 } else {
//                     System.out.print(num++ + " ");
//                 }
//             }

//             if (i % 2 == 0) {
//                 num = start + i + 1;
//             }

//             System.out.println();
//         }
//     }
// }