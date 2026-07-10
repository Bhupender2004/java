
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

// import java.util.*;
// public class tcs {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         Arrays.sort(arr);
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         int largest=Integer.MIN_VALUE;
//         int secondLargest=Integer.MIN_VALUE;

//         for(int i=0; i<n; i++){
//             if(arr[i]>largest){
//                 secondLargest=largest;
//                 largest=arr[i];
//             }else if(arr[i]>secondLargest&&arr[i]!=largest){
//                 secondLargest=largest;
//             }
//         }

//         if(secondLargest==Integer.MIN_VALUE){
//             System.out.print("Second Largest doesn't exist.");
//         }else{
//             System.out.print(secondLargest);
//         }
//     }
// }


// prime no.

// import java.util.*;
// class tcs{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=2; i<=n; i++){
//             boolean isPrime=true;
//             for(int j=2; j<i; j++){
//                 if(i%j==0){
//                     isPrime=false;
//                     break;
//                 }
//             }
//             if(isPrime){
//                 System.out.print(i+" ");
//             }
//         }
//     }
// }


// Rectangle Overlap
// class tcs{
//     static class Point{
//         int x,y;
//         Point(int x, int y){
//             this.x=x;
//             this.y=y;
//         }
//     }
//     static boolean doOverlap(Point l1, Point r1, Point l2, Point r2){
//         if(l1.x>r2.x||l2.x>r1.x){
//             return false;
//         }
//         if(r1.y>l2.y||r2.y>l1.y){
//             return false;
//         }
//         return true;
//     }
//     public static void main(String [] args){
//         Point l1=new Point(0, 10);
//         Point r1=new Point(10, 0);
//         Point l2=new Point(5, 5);
//         Point r2=new Point(15, 0);
        
//         if(doOverlap(l1, r1, l2, r2)){
//             System.out.println("Rectangle overlap.");
//         }else{
//             System.out.print("Rectangle don't overlap.");
//         }
//     }
// }