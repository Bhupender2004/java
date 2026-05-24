//  Write a program to check given no. is palindrome or not, using function.
// import java.util.*;
// public class function{
//     public static boolean isPalindrome(int n){
//         int rev = 0;
//         int temp = n;
//         while(temp!=0){
//             int lastDigit = temp%10;
//             rev = rev*10 + lastDigit;
//             temp = temp/10;
//         }
//         if(rev==n){
//             return true;
//         }else{
//             return false;
//         }
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a no. : ");
//         int n = sc.nextInt();
//         boolean ans = isPalindrome(n);
//         if(ans){
//             System.out.print("Palindrome");
//         }else{
//             System.out.print("Not Palindrome");
//         }
//     }
// }  

// Write a progra to find whether the two given strings are anagrams or not.
// import java.util.*;
// public class function{
//     public static boolean isAnagram(String a, String b){
//         if(a.length()!=b.length()){
//             return false;
//         }
//         char[] a1 = a.toCharArray();
//         char[] b1 = b.toCharArray();
//         Arrays.sort(a1);
//         Arrays.sort(b1);
//         for(int i=0; i<a.length(); i++){
//             if(a1[i]!=b1[i]){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first string : ");
//         String a = sc.nextLine();
//         System.out.print("Enter second string : ");
//         String b = sc.nextLine();
//         boolean ans = isAnagram(a, b);
//         if(ans){
//             System.out.print("Anagram");
//         }else{
//             System.out.print("Not Anagram");
//         }
//     }
// }