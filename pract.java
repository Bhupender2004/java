// import java.util.*;
// class pract {
//     public static void main(String [] args){
//         System.out.println("Hello Bhuppii !!");
//     }
// }

// class pract{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your name: ");
//         String name = sc.nextLine();
//         System.out.println(name);
//     }
// }

// class pract{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a first no.: ");
//         int a = sc.nextInt();
//         System.out.print("Enter second no.: ");
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.print("The sum is : "+sum);
//     }
// }


// Check whether a no. is even or odd.
// class pract{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int num = sc.nextInt();
        
//         if(num>=0&&num%2==0){
//             System.out.print("Even number.");
//         }else if(num>0&num%2!=0){
//             System.out.print("Odd number.");
//         }else{
//             System.out.print("Negative number is entered");
//         }
//     }
// }

// Calculator using java.
// class pract{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();
//         System.out.print("Enter a valid operator +,-,*,/ : ");
//         char operator = sc.next().charAt(0);
//         int result;

//         switch(operator){
//             case '+':
//                 result = a+b;
//                 System.out.print("The sum is: "+result);
//                 break;
//             case '-':
//                 result = a-b;
//                 System.out.print("The subtraction is: "+result);
//                 break;
//             case '*':
//                 result = a*b;
//                 System.out.print("The multiplication is: "+result);
//                 break;
//             case '/':
//                 if(b!=0){
//                     result = a/b;
//                     System.out.print("The division is: "+result);
//                     break;
//                 }else{
//                     System.out.print("Division by zero is not possible.");
//                 }
//             default:
//                 System.out.print("Invalid operator.");
//         }
//     }
// }

// class pract{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int i=0;
//         do{
//             System.out.println("Hii bhuppii");
//             i++;
//         }while(i<=10);
//     }
// }

// Print sum of first n natural numbers.

// class pact{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int sum=0;
//         for(int i=0; i<=n; i++){
//             sum+=i;
//         }
//         System.out.print("The sum is: "+sum);
//     }
// }


// class pract{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n=4, m=5;

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// class practice{
//     public static void main(String[] args){
//         int n=4, m=5;
//         for(int i=1; i<n; i++){
//             for(int j=1; j<m; j++){
//                 if(i==1||j==1||i==n||j==m){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//         }
//         System.out.println();
//     }
// }