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