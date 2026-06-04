// import java.util.*;
// class training_day8{
//     public static void printNum(int n){
//         if(n==0){
//             return;
//         }
//         printNum(n-1);
//         System.out.print(n+" ");
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the no.: ");
//         int n=sc.nextInt();
//         printNum(n);
//     }
// }


// Fibonacci series using recursion.

import java.util.*;
class training_day8{
    public static int printFib(int a, int b, int n){
        if(n==0){
            return 1;
        }
        int c=a+b;
        System.out.print(c+" ");
        return printFib(b,c,n-1);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. : ");
        int n=sc.nextInt();
        int a=0, b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        printFib(a,b,n-2);
    }
}