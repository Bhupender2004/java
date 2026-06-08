// import java.util.*;
// public class training_day10 {
//     public static void subset(int arr[], int idx, String curr ){
//         if(idx==arr.length){
//             System.out.println("{"+curr+"}");
//             return;
//         }
//         subset(arr, idx+1, curr);
//         subset(arr, idx+1, curr+arr[idx]+" ");
//     }

//     public static void main(String [] ar){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         subset(arr,0," ");
//     }
// }


import java.util.Scanner;
class training_day10{
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float total=(float)(a+b+c);
        // float tot=300.0;
        float ans=total/300t;
        float cgpa=ans*10;
        
        System.out.printf("%.2f", cgpa);
    }
}