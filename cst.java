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


// gcd
// import java.util.*;
// public class cst {
//     public static int gcd(int a, int b){
//         if(b==0){
//             return a;
//         }
//         return gcd(b, a%b);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         System.out.print(gcd(a,b));
//     }
// }





// Gun and Baloon Problem

// import java.util.*;
// public class cst {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         if (!sc.hasNextInt()) return;
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int[] b = new int[n];
//         for (int i = 0; i < n; i++) {
//             b[i] = sc.nextInt();
//         }
//         int minutes = 0;
//         while (true) {
//             Arrays.sort(b);
//             if (b[n - k] > 0) {
//                 minutes++;
//                 for (int i = n - 1; i >= n - k; i--) {
//                     b[i]--;
//                 }
//             } else {
//                 break; 
//             }
//         }
//         System.out.println(minutes);
//     }
// }


// sum of array elements except 
// import java.util.*;
// class cst{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         int sum=0;
//         for(int i=0; i<n; i++){
//             if(i==n-1){
//                 sum+=arr[i];
//             }else if(arr[i]>arr[i+1]){
//                 sum+=arr[i];
//             }else{
//                 continue;
//             }
//         }
//         System.out.print(sum);
//     }
// }



// print first and last character of string
// import java.util.*;

// public class cst {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String upp=s.toUpperCase();
//         char[] arr=upp.toCharArray();
//         for(int i=0; i<s.length(); i++){
//             System.out.print(arr[0]+"."+arr[s.length()-1]);
//             break;
//         }
//     }
// }


// Cup cake sales
// import java.util.*;
// public class cst {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         int sum=0;
//         for(int i=0;i<n; i++){
//             if(arr[i]>=5){
//                 sum+=arr[i];
//             }
//         }
//         System.out.println(sum);
//     }
// }



//

// import java.util.*;
// public class cst {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         if (sc.hasNextLong()) {
//             long n = sc.nextLong();
//             long m = sc.nextLong();
//             long k = sc.nextLong();
//             if ((2 * n * m) % k == 0) {
//                 System.out.println("YES");
//             } else {
//                 System.out.println("NO");
//             }
//         }
        
//         sc.close();
//     }
// }



// consecutive character
// import java.util.*;
// public class cst{
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         if (!sc.hasNext()) return;
//         String s = sc.next();
        
//         int totalEvenSum = 0;
//         int n = s.length();
//         for (int i = 0; i < n; i++) {
//             int count = 1;
//             while (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
//                 count++;
//                 i++;
//             }
//             if (count % 2 == 0) {
//                 totalEvenSum += count;
//             }
//         }
//         System.out.println(totalEvenSum);
//     }
// }



// Pizza Party Problem

// import java.util.*;
// public class cst {
//     public static void main(String args[] ) throws Exception {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT */
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int k=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }    
//         int limit=k-1;
//         HashMap<Integer, Integer> map=new HashMap<>();
//         int left=0;
//         int maxLen=0;
//         for(int right=0; right<n; right++){
//             map.put(arr[right], map.getOrDefault(arr[right],0)+1);
//             while(map.size()>limit){
//                 map.put(arr[left], map.get(arr[left])-1);
                
//                 if(map.get(arr[left])==0){
//                     map.remove(arr[left]);
//                 }
//                 left++;
//             }
//             maxLen=Math.max(maxLen, right-left+1);
//         }
//         System.out.println(maxLen);
//     }
// }



// Maximum possible numbers



import java.util.*;

public class cst{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numStr = sc.next();
        
        int[] digits = new int[10];
        for (int i = 0; i < 10; i++) {
            digits[i] = sc.nextInt();
        }
        
        char[] numArr = numStr.toCharArray();
        boolean replaced = false;
        
        for (int i = 0; i < numArr.length; i++) {
            int currentDigit = numArr[i] - '0';
            
            if (!replaced) {
                if (digits[currentDigit] > currentDigit) {
                    numArr[i] = (char) (digits[currentDigit] + '0');
                    replaced = true;
                }
            } else {
                if (digits[currentDigit] >= currentDigit) {
                    numArr[i] = (char) (digits[currentDigit] + '0');
                } else {
                    // Stop replacing once the condition fails
                    break;
                }
            }
        }
        
        System.out.println(new String(numArr));
    }
}

