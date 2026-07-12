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
import java.util.*;
class infosys{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        n=Math.abs(n);
        int count=0;
        if(n==0){
            count=1;
        }else{
        while(n>0){
            count++;
            n=n/10;
            }
        }
        System.out.print(count);
    }
}
