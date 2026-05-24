// import java.util.Scanner;
// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first no. : ");
//         int a = sc.nextInt();
//         System.out.println("Enter second no. : ");
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.println("The sum is" + " " + sum);
//     }
// }


// import java.util.Scanner;
// public class main{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a no. : ");
//         int a = sc.nextInt();
//         if( a%2 == 0){
//             System.out.println("Even");
        
//         }else{
//             System.out.println("Odd");
//         }
//     }
// }


// Calculator.

// import java.util.*;
// public class Calculator{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number : ");
//         double num1 = sc.nextDouble();
//         System.out.println("Enter second number : ");
//         double num2 = sc.nextDouble();
        
//         System.out.println("Choose an operator(+,-,*,/,%): ");
//         char operator = sc.next().charAt(0);
//         double result;
        
//         switch(operator) {
//             case '+':
//                 result = num1 + num2;
//                 System.out.println("Result = " + result);
//                 break;
                
//             case '-':
//                 result = num1 - num2;
//                 System.out.println("Result = " + result);
//                 break;
                
//             case '*':
//                 result = num1 * num2;
//                 System.out.println("Result = " + result);
//                 break;
                
//             case '/':
//                 if(num2 != 0){
//                     result = num1 / num2;
//                     System.out.println("Result = " + result);
//                 } else {
//                     System.out.println("Error: Division by zero is not allowed");
//                 }
//                 break;
//             case '%':
//                 if(num2 != 0){
//                     result = num1 % num2;
//                     System.out.println("Result = " + result);
//                 } else {
//                     System.out.println("Error: Division by zero");
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid Operator!");
//         }
//         sc.close();
//     }
// }

// Sum of n natural nos.

// import java.util.*;
// public class main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         int sum = 0;
//         for (int i = 1; i <= n; i++) {
//             if (i % 2 == 0) {
//                 sum += i;
//             }
//         }

//         System.out.println("Sum of even numbers is: " + sum);
//     }
// }


// Print the pattern

// import java.util.*;
// public class main{
//     public static void main(String[] args){
//         int n=4;
//         int m=5;
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=5; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class main{
//     public static void main(String[] args){
//         int n=4;
//         int m=5;
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=5; j++){
//                 if(i==1||j==1||i==n||j==m){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }


// import java.util.*;
// public class main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//         System.out.println(" ");
//     }
// }
// }


// import java.util.*;
// public class main{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//         System.out.println(" ");
//     }
// }
// }

// import java.util.*;
// public class main{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//     }
// }
// }

// import java.util.*;
// public class main{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=n; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//     }
// }
// }

// Pattern for numbers.
// import java.util.*;
// public class main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number for the pattern: ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println("");
//         }
//     }
// }

// import java.util.*;
// public class main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number for the pattern: ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println("");
//         }
//     }
// }

// Flyod's Triangle
// import java.util.*;
// public class main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int num =1;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(num+" ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 int sum = i+j;
//                 if(sum%2==0){
//                     System.out.print("1");
//                 }else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// Print name by function.

// import java.util.*;
// public class main{
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         printMyName(name);
        
//     }
// }


// Product using function.
// import java.util.*;
// public  class main{
//     public static int calculatemult(int a, int b){
//         int mult = a*b;
//         return mult;
//     }
    
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a: ");
//         int a = sc.nextInt();
//         System.out.print("Enter b: ");
//         int b = sc.nextInt();
//         int mult = calculatemult(a,b);
//         System.out.print("The multiplication is: "+mult);
//     }
// }

//  Printing the facrtorial of a number.
// import java.util.*;
// public  class main{
//     public static void printFactorial(int n){
//         if(n<0){
//             System.out.print("Invalid number");
//             return;
//         }
//         int fact = 1;
//         for(int i=n; i>=1; i--){
//             fact = fact*i;
//         }
//         System.out.print(fact);
//         return;
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a no. : ");
//         int num = sc.nextInt();
//         printFactorial(num);

//     }
// }

// import java.util.*;
// public class main{
//     public static void printFact(double n){
//         if(n<0){
//             System.out.print("Invalid number !!");
//             return;
//         }
//         double fact = 1;
//         for(double i=n; i>=1; i--){
//             fact = fact*i;
//         }
//         System.out.print(fact);
//         return;
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a no. : ");
//         double num = sc.nextDouble();
//         printFact(num);
//     }
// }