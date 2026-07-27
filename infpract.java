
// import java.util.Scanner;
// class infpract{
//     public static void main(String [] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter a: ");
//         int a=sc.nextInt();
//         System.out.print("Enter b: ");
//         int b=sc.nextInt();
//         System.out.print("Enter c: ");
//         int c= sc.nextInt();

//         if(a<b && a<c){
//             System.out.print("A is smallest.");
//         }else if(b<a&&b<c){
//             System.out.print("B is smallest.");
//         }else{
//             System.out.print("C is largest.");
//         }
//     }
// }

// import java.util.*;
// public class infpract{
//     public static void main(String [] args){

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a character: ");
//         char ch=sc.next().charAt(0);
    
//         if(Character.isLetter(ch)){
//             System.out.print("Alaphbet");
//         }else if(Character.isDigit(ch)){
//             System.out.print("Digits");
//         }else{
//             System.out.println("Symobls");
//         }
//     }
// }


import java.util.*;
class infpract{
    public static void main(String [] ars){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}

