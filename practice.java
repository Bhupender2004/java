
// Ques1: To print the avg of 3 nos. using funciton.

// import java.util.*;
// public class practice {
//     public static float calAvg(float a, float b, float c) {
//         float avg = (a + b + c) / 3;
//         return avg;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first no. : ");
//         float a = sc.nextFloat();
//         System.out.print("Enter second no. : ");
//         float b = sc.nextFloat();
//         System.out.print("Enter third no. : ");
//         float c = sc.nextFloat();
//         float avg = calAvg(a, b, c);
//         System.out.print("The avg is : " + avg);
//     }
// }


// Ques:2 Write a function to print the sum of all odd numbers from 1 to n.
// import java.util.*;
// public class practice{
//     public static int calSum(int n){
//         int sum = 0;
//         for(int i=1; i<=n; i=i+2){
//             sum = sum+i;
//         }
//         return sum;
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a no.: ");
//         int n = sc.nextInt();
//         int sum = calSum(n);
//         System.out.print("The sum is: "+sum);
//     }
// }


// Ques:4 Write a function that takes in the radius as input and returns the circumference of a circle.
// import java.util.*;
// public class practice{
//     public static float calCir(float r){
//         float pi = 3.14f;
//         float cir = 2*pi*r;
//         return cir;
//     }
//     public static void main(String [] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the radius : ");
//     float r = sc.nextFloat();
//     float cir = calCir(r);
//     System.out.print("The cirumference of the circle is : "+cir);
//     }
// }


// Ques: Write a function to print the sum of all even numbers when user gives even no. and print the sum of all odd numbers when user gives odd no.
// import java.util.*;
// public class practice{
//     public static int printSum(int n){
//         int sum = 0;
//         if(n%2==0){
//             for(int i=0; i<=n; i=i+2){
//             sum = sum+i;
//         }
//         }else{
//              for(int i=1; i<=n; i=i+2){
//             sum = sum+i;
//         }
//     }
//     return sum;
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a no : ");
//         int n = sc.nextInt();
//         int sum = printSum(n);
//         System.out.print("The sum is: "+sum);
//     }
// }


// Ques:3 Write a function which takes in 2 numbers and returns the greater of those two.
// import java.util.*;
// public class practice{
//     public static int greaterNo(int a, int b){
//         if(a>b){
//             return a;
//         }else{
//             return b;
//         }
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first no. : ");
//         int a = sc.nextInt();
//         System.out.print("Enter second no. : ");
//         int b = sc.nextInt();
//         int greater = greaterNo(a, b);
//         System.out.print("The greater no. is: "+greater);
//     }
// }


// Ques: 5 Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
// import java.util.*;
// public class practice{
//     public static boolean eligibleToVote(int age){
//         if(age>18){
//             return true;
//         }else{
//             return false;
//         }
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter age: ");
//         int age = sc.nextInt();
//         boolean eligible = eligibleToVote(age);
//         if(eligible){
//             System.out.print("Can Vote");
//         }else{
//             System.out.print("Can't Vote");
//         }
//     }
// }


// Ques:6 Write an infinite loop using do while condition.

// import java.util.*;
// public class practice{
//     public static void main(String[] args){
//         int i = 1;
//         do{
//             System.out.print(i);
//         }while(i<10);
//     }
// }


// Ques:7 Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
// import java.util.*;
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int pos = 0, neg = 0, zero = 0;
//         char choice;
//         do{
//             System.out.print("Enter a no.: ");
//             int n = sc.nextInt();
//             if(n>0){ 
//                 pos++;
//             }else if(n<0){
//                 neg++;
//             }else{
//                 zero++;
//             }
//             System.out.print("Do you want to continue? (y/n): ");
//             choice = sc.next().charAt(0);
//         }while(choice == 'y' || choice == 'Y');
//         System.out.print("Positive: "+pos+"\nNegative: "+neg+"\nZero: "+zero);
//     }
// }


import java.util.*;
public class practice{
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            int numbers[] = new int[size];
            for(int i=0; i<size; i++){
                numbers[i] = sc.nextInt();
            }
            for(int i=0; i<size; i++){
                System.out.print(numbers[i]+" ");
            }
        }
    }
}