// public class recursion {
//     public static void printNumb(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         printNumb(n-1);
//     }
//     public static void main(String [] args){
//         int n=5;
//         printNumb(n);
//     }
// }


// Tower of Hanoi.

// public class recursion{
//     public static void towerofHanoi(int n, String src, String helper, String dest){
//         if(n==1){
//             System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
//             return;
//         }
//         towerofHanoi(n-1, src, dest, helper);
//         System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
//         towerofHanoi(n-1, helper, src, dest);
//     }
//     public static void main(String[] args) {
//         int n=3;
//         towerofHanoi(n, "S", "H", "D");
//     }
// }


// Print the string in reverse.

// public class recursion{
//     public static void printRev(String str, int idx){
//         if(idx==0){
//             System.out.print(str.charAt(idx));
//             return;
//         }
//         System.out.print(str.charAt(idx));
//         printRev(str, idx-1);
//     }
//     public static void main(String [] args){
//         String str = "BHUPENDER";
//         printRev(str, str.length()-1);
//     }
// }




// class Recursion{
//     public static boolean isSorted(int arr[], int idx){
//         if(idx==arr.length-1){
//             return true;
//         }
//         if(arr[idx]<arr[idx+1]){
//             return isSorted(arr, idx+1);
//         }else{
//             return false;
//         }
//     }
//     public static void main(String [] args){
//         int arr[]={1,3,5};
//         System.out.println(isSorted(arr,0));
//     }
// }


// Move all 'x' to the end of the string.

// class Recursion{
//     public static void moveAllX(String str, int idx, int count, String newString){
//         if(idx==str.length()){
//             for(int i=0; i<count; i++){
//                 newString += 'x';
//             }
//             System.out.println(newString);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if(currChar == 'x'){
//             count++;
//             moveAllX(str, idx+1, count, newString);
//         }else{
//             newString += currChar;
//             moveAllX(str, idx+1, count, newString);
//         }
//     }
//     public static void main(String [] args){
//         String str = "axbcxxd";
//         moveAllX(str, 0, 0, " ");
//     }
// }


// Remove duplicates in a String "abbccda".

// class Recursion{
//     public static boolean [] map = new boolean[26];
//     public static void removeDuplicate(String str, int idx, String newString){
//         if(idx==str.length()){
//             System.out.println(newString);
//             return;
//         }
//         char currChar=str.charAt(idx);
//         if(map[currChar-'a']==true){
//             removeDuplicate(str, idx+1, newString);
//         }else{
//             newString+=currChar;
//             map[currChar-'a']=true;
//             removeDuplicate(str, idx+1, newString);
//         }
//     }
//     public static void main(String [] args){
//         String str = "abbccda";
//         removeDuplicate(str, 0, " ");
//     }
// }