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
import java.util.*;
class javasheet{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1; i>=0; i--){
            rev+=s.charAt(i);
        }
        System.out.print("Reversed string: "+rev);
    }
}

