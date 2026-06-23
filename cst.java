// Automorphic Number 

// import java.util.Scanner;
// class cst {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if (isAutomorphic(num)) {
//             System.out.println("Automorphic");
//         } else {
//             System.out.println("Not Automorphic");
//         }
//     }
//     public static boolean isAutomorphic(int n) {
//         int sq = n * n; 
//         while (n > 0) {
//             if (n % 10 != sq % 10) {
//                 return false; 
//             }
//             n /= 10;      
//             sq /= 10; 
//         }
//         return true; 
//     }
// }

// Factorial mein zeros
// import java.util.*;
// public class cst {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int count = 0;
//         while (n > 0) {
//             n = n / 5;
//             count += n;
//         }
//         System.out.println(count);
//     }
// }


// gcd
// import java.util.*;
// public class cst {
//     public static int gcd(int a, int b){
//         if(b==0){
//             return a;
//         }
//         return gcd(b, a%b);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         System.out.print(gcd(a,b));
//     }
// }





// Gun and Baloon Problem

import java.util.*;
public class cst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int minutes = 0;
        while (true) {
            Arrays.sort(b);
            if (b[n - k] > 0) {
                minutes++;
                for (int i = n - 1; i >= n - k; i--) {
                    b[i]--;
                }
            } else {
                break; 
            }
        }
        System.out.println(minutes);
    }
}