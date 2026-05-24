// Java intro and defining class...

// public class firstclass{
//     public static void main(String[] args){
//         System.out.println("Hello World!");
//     }
// }

// Input / Output / Variables...

// import java.util.*;
// public class Sumoftwonums{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two numbers: ");
//         int a = sc.nextInt();
//         System.out.println("Enter second number: ");
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println("Sum of two numbers is: " + sum);
//     }
// }

// If-else Statements...

// import java.util.*;
// public class Checknums{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a : ");
//         int a = sc.nextInt();
//         System.out.println("Enter b: ");
//         int b = sc.nextInt();
//         if(a > b){
//             System.out.println("a is greater than b");
//         }
//         else if(a < b){
//             System.out.println("a is less than b");
//         }
//         else{
//             System.out.println("a is equal to b");
//         }
//     }
// }


// Practice question...
// Simple Calculator question

// import java.util.*;
// public class Calculator {
//     /**
//      * @param args
//      */
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a: ");
//         int a = sc.nextInt();
//         System.out.println("Enter b: ");
//         int b = sc.nextInt();
//         System.out.println("Enter operator: ");
//         char operator = sc.next().charAt(0);
//         switch (operator) {
//             case '+':
//                 System.out.println("Sum of two numbers is: " + (a + b));
//                 break;
//             case '-':
//                 System.out.println("Difference of two numbers is: " + (a - b));
//                 break;
//             case '*':
//                 System.out.println("Product of two numbers is: " + (a * b));
//                 break;
//             case '/':
//                 if (b != 0) {
//                     System.out.println("Division of two numbers is: " + (a / b));
//                 } else {
//                     System.out.println("Cannot divide by zero");
//                 }
//                 break;
//             case '%':
//                 System.out.println("Modulus of two numbers is: " + (a % b));
//                 break;
//             default:
//                 System.out.println("Invalid operator");
//                 break;
//         }
//     }
// }


// Practice Questions...
// pattern qustions

// public class Pattern {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Output--------->>          *
//                           **
//                          ***
//                         ****