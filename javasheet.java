// import java.util.*;
// class javasheet{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter string: ");
//         String s=sc.nextLine();
//         char [] charArr=s.toLowerCase().toCharArray();
//         int count1=0;
//         int count2=0;                                                                                // it can also be written as
//         for(int i=0; i<s.length(); i++){
//             if(charArr[i]=='a'||charArr[i]=='e'||charArr[i]=='i'||charArr[i]=='o'||charArr[i]=='u'){    // if("aeiou".indexOf(charArr[i]!=-1)){
//                 count1++;
//             }else if(charArr[i]>='a'&&charArr[i]<='z'){
//                 count2++;
//             }
//         }
//         System.out.println("Vowels in strings are: "+count1);
//         System.out.println("Consonants in string are: "+count2);
//         sc.close();
//     }
// }



// Count no. of words in a sentence.
// import java.util.*;
// class javasheet{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter sentence: ");
//         String s=sc.nextLine();
//         int count=1;
//         for(int i=0; i<s.length(); i++){
//             if(s.charAt(i)==' '){
//                 count++;
//             }
//         }
//         System.out.print(count);
//     }
// }



// also it can be write as
// import java.util.*;
// class javasheet{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter sentence: ");
//         String s=sc.nextLine();
//         int count=1;
//         String [] strs=s.trim().split("\s+");
//         System.out.print("No. of words are: "+strs.length);
//     }
// }


// Reverse the string.
// import java.util.*;
// class javasheet{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter string: ");
//         String s=sc.nextLine();
//         String rev="";
//         for(int i=s.length()-1; i>=0; i--){
//             rev+=s.charAt(i);
//         }
//         System.out.print("Reversed string: "+rev);
//     }
// }


// Program to check whether a string is Palindrome.
// import java.util.*;
// class javasheet{
//     public static boolean isPalindrome(String s){
//         int left=0;
//         int right=s.length()-1;
//         while(left<right){
//             if(s.charAt(left)!=s.charAt(right)){
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }

//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter string: ");
//         String s=sc.nextLine();
//         if(isPalindrome(s)){
//             System.out.print("String is Palindrome.");
//         }else{
//             System.out.print("String is not palindrome.");
//         }
//         sc.close();
//     }
// }



// Program to convert string to uppercase and lowercase without using inbuilt function.
// import java.util.*;
// public class javasheet{
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter string: ");
//         String s=sc.nextLine();
//         String upper="";
//         String lower="";
//         for(int i=0; i<s.length(); i++){
//             char ch=s.charAt(i);
//             if(ch>='a'&&ch<='z'){
//                 upper+=(char)(ch-32);
//             }else{
//                 upper+=ch;
//             }
//             if(ch>='A'&&ch<='Z'){
//                 lower+=(char)(ch+32);
//             }else{
//                 lower+=ch;
//             }
//         }
//         System.out.println("Upper case: "+upper);
//         System.out.print("Lower case: "+lower);
//     }
// }


// Program to count the frequency of each character in a string.
import java.util.*;
class javasheet{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine();
        HashMap<Character, Integer> freq=new HashMap<>();
        for(char ch:s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }
        for(char ch:freq.keySet()){
            System.out.println(ch+" : "+freq.get(ch));
        }
    }
}