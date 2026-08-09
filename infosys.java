// 1. Contains Duplicate

// import java.util.*;
// public class infosys {
//     public boolean containsDuplicate(int [] nums){
//         HashSet<Integer> set=new HashSet<>();
//         for(int num:nums){
//             if(set.contains(num)){
//                 return true;
//             }
//             set.add(num);
//         }
//         return false;
//     }
// }


// 2. Valid Anagram


// import java.util.*;
// class infosys{
//     public static boolean isAnagram(String s, String t){
//         if(s.length()!=t.length()){
//             return false;
//         }
//         char [] sSort=s.toCharArray();
//         char [] tSort=t.toCharArray();
//         Arrays.sort(sSort);
//         Arrays.sort(tSort);
//         if(Arrays.equals(sSort, tSort)){
//             return true;
//         }
//         return false;
//     }
//     public static void main(String [] args){
//         Scanner sc= new Scanner(System.in);
//         String s=sc.nextLine();
//         String t=sc.nextLine();
//         System.out.print(isAnagram(s,t));
//     }
// }



// Program to convert seconds into hour, min and second.
// import java.util.*;
// class infosys{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter seconds: ");
//         int seconds=sc.nextInt();

//         int hr=seconds/3600;
//         int remSec=seconds%3600;

//         int min=remSec/60;
//         int sec=remSec%60;

//         System.out.println("Hour: "+hr);
//         System.out.println("Min: "+min);
//         System.out.println("Sec: "+sec);
//     }
// }


// Program to check whether given character is Alphabet, Digit or Symbol.

// import java.util.*;
// class infosys{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a character: ");
//         char ch=sc.next().charAt(0);
//         if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
//             System.out.print("Alphabet");
//         }else if(ch>='0'&&ch<='9'){
//             System.out.print("Digit");
//         }else{
//             System.out.print("Symbol");
//         }
//     }
// }

// import java.util.*;
// class infosys{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a character: ");
//         char ch=sc.next().charAt(0);
//         if(Character.isLetter(ch)){
//             System.out.print("Alphabet");
//         }else if(Character.isDigit(ch)){
//             System.out.print("Digit");
//         }else{
//             System.out.print("Symbol");
//         }
//     }
// }


// Count the no. of digit in a number.
// import java.util.*;
// class infosys{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a no.: ");
//         int n=sc.nextInt();
//         n=Math.abs(n);
//         int count=0;
//         if(n==0){
//             count=1;
//         }else{
//         while(n>0){
//             count++;
//             n=n/10;
//             }
//         }
//         System.out.print(count);
//     }
// }



// Program to display all the digits of a number n (one per line).
// import java.util.*;
// class infosys{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a no.: ");
//         int n=sc.nextInt();
//         int temp=n;
//         int div=1;
//         while(temp>=10){
//             div=div*10;
//             temp=temp/10;
//         }
//         while(div>0){
//             int dig=n/div;
//             System.out.println(dig);
//             n=n%div;
//             div=div/10;
//         }
//     }
// }


// Count even and odd digit in a number.

// import java.util.*;
// class infosys{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter no.: ");
//         int n= sc.nextInt();
//         int evdig=0;
//         int oddig=0;
//         while(n>0){
//             int dig=n%10;
//             if(dig%2==0){
//                 evdig++;
                
//             }else if(dig%2!=0){
//                 oddig++;
                
//             }
//             n/=10;
//         }
//         System.out.println("Even digits are: "+evdig);
//         System.out.println("Odd digits are: "+oddig);
//     }
// }


// Program to replace all zeros in a number n with digit 5.

// import java.util.*;
// class infosys{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number: ");
//         int n=sc.nextInt();
//         int rev=0;
//         int newNum=rev;
//         while(n>0){
//             int dig=n%10;
//             if(dig==0){
//                 dig=5;
//             }
//             rev=(rev*10)+dig;
//             n=n/10;
//         }
//         while(rev>0){
//             int dig=rev%10;
//             newNum=(newNum*10)+dig;
//             rev=rev/10;
//         }
//         System.out.print(newNum);
//     }
// }


// Program to find sum of first and last digit of a number n.

// import java.util.*;
// class infosys{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n=sc.nextInt();
//         int temp=n;
//         int div=1;
//         while(temp>=10){
//             div=div*10;
//             temp=temp/10;
//         }
//         int firstdig=n/div;
//         int lastdig=n%10;
//         System.out.print(firstdig+lastdig);
//     }
// }


// Program to display the first n prime number.

// import java.util.*;
// class infosys{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n=sc.nextInt();
//         int count=0;
//         int num=2;
//         while(count<n){
//             boolean isPrime=true;
//             for(int i=2; i<num; i++){
//                 if(num%i==0){
//                     isPrime=false;
//                     break;
//                 }
//             }
//             if(isPrime){
//                 System.out.println(num);
//                 count++;
//             }
//             num++;
//         }
//     }
// }


// Program to check if a no. is armstrong or not.

// import java.util.*;
// class Main{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a no.: ");
//         int n=sc.nextInt();
//         int org=n;
//         int temp=n;
//         int count=0;
//         int sum=0;
//         while(temp>0){
//             count++;
//             temp=temp/10;
//         }
//         temp=org;
//         while(temp>0){
//             int dig=temp%10;
//             sum+=(int)Math.pow(dig, count);
//             temp=temp/10;
//         }
//         System.out.print(sum);
//         if(sum==org){
//             System.out.print("Armstrong");
//         }else{
//             System.out.print("Not armstrong");
//         }
//     }
// }



// Program to print Armstrong no.
// import java.util.*;
// class infosys{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n=sc.nextInt();
//         for(int i=1; i<=n; i++){
//             int temp=i;
//             int org=i;
//             int count=0;
//             int sum=0;

//             while(temp>0){
//                 count++;
//                 temp=temp/10;
//             }
//             temp=org;
//             while(temp>0){
//                 int dig=temp%10;
//                 sum+=(int)Math.pow(dig, count);
//                 temp=temp/10;
//             }
//             if(sum==org){
//                 System.out.println(i);
//             }
//         }
//     }
// }


// Program to check whether a no. is perfect no. or not.
// import java.util.*;
// class infosys{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a no.: ");
//         int n=sc.nextInt();
//         int sum=0;
//         for(int i=1; i<=n/2; i++){
//             if(n%i==0){
//                 sum+=i;
//             }

//         }
//         if(sum==n){
//             System.out.print("Perfect no.");
//         }else{
//             System.out.print("Not perfect no.");
//         }
//     }
// }


// Program to check strong number.
// import java.util.*;
// class infosys{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a no.: ");
//         int n=sc.nextInt();
//         int temp=n;
//         int sum=0;
//         while(temp>0){
//             int dig=temp%10;
//             int fact=1;
//             for(int i=1; i<=dig; i++){
//                 fact=fact*i;
//             }
//             sum+=fact;
//             temp=temp/10;
//         }
//         if(sum==n){
//             System.out.print("Strong no.");
//         }else{
//             System.out.print("Not strong no.");
//         }
//     }
// }

// Automorphic number

// import java.util.*;
// class infosys{
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number: ");
//         int n=sc.nextInt();
//         int sq=n*n;
//         int temp=n;
//         boolean isAuto=true;
//         while(temp>0){
//             if(sq%10!=temp%10){
//                 isAuto=false;
//                 break;
//             }
//             temp/=10;
//             sq/=10;
//         }
//         if(isAuto){
//             System.out.print("Automorphic");
//         }else{
//             System.out.print("Not automorphic");
//         }
//     }
// }


// GCD of two nos.

// import java.util.*;
// class infosys{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a: ");
//         int a=sc.nextInt();
//         System.out.print("Enter b: ");
//         int b=sc.nextInt();
//         while(b!=0){
//             int temp=b;
//             b=a%b;
//             a=temp;
//         }
//         System.out.print(a);
//     }
// }


// LCM of two nos.

// import java.util.*;
// class infosys{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a: ");
//         int a=sc.nextInt();
//         System.out.print("Enter b: ");
//         int b=sc.nextInt();
//         int x=a; int y=b;
//         while(y!=0){
//             int temp=y;
//             y=x%y;
//             x=temp;
//         }
//         int hcf=x;
//         int lcm=(a*b)/hcf;
//         System.out.print("LCM is: "+lcm);
//     }
// }


// Fibonacci Series
// import java.util.*;
// class infosys{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n=sc.nextInt();
//         int a=0; int b=1;
//         for(int i=1; i<=n; i++){
//             System.out.print(a+" ");
//             int next=a+b;
//             a=b;
//             b=next;
//         }
//     }
// }


// Fibonacci series using recursion.
// import java.util.*;
// class infosys{
//     public static void printFib(int a, int b, int n){
//         if(n==0){
//             return;
//         }
//         int c=a+b;
//         System.out.print(c+" ");
//         printFib(b,c,n-1);
//     }
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n=sc.nextInt();
//         int a=0; int b=1;
//         System.out.print(a+" ");
//         System.out.print(b+" ");
//         printFib(a,b,n-2);
//     }
// }


// Sum of fibonacci series upto n terms.
// import java.util.*;
// class infosys{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n=sc.nextInt();
//         int a=0; int b=1;
//         int sum=0;
//         for(int i=1; i<=n; i++){
//             sum=sum+a;
//             int next=a+b;
//             a=b;
//             b=next;
//         }
//         System.out.print("Sum of "+n+" term of fibo is: "+sum);
//         sc.close();
//     }
// }


// Sum of square of n terms.
// import java.util.*;
// class infosys{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n=sc.nextInt();
//         int sum=(n*(n+1)*((2*n)+1))/6;
//         System.out.print(sum);
//     }
// }


// import java.util.*;
// class infosys{
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n=sc.nextInt();
//         int sum=0;
//         for(int i=1; i<=n; i++){
//             sum+=i*i;
//         }
//         System.out.print(sum);
//     }
// }


// Power of x raised to y without any inbuilt function.
// import java.util.*;
// class Main{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter x: ");
//         int x=sc.nextInt();
//         System.out.print("Enter y: ");
//         int y=sc.nextInt();
//         int power=1;
//         for(int i=1; i<=y; i++){
//             power*=x;
//         }
//         System.out.print(power);
//     }
// }


// 1
// 2 3
// 4 5 6... print this pattern.

import java.util.*;
class infosys{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int count=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}