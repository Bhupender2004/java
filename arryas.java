// Ques: 1 Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.
// import java.util.*;
// public class arrays{
//     public static void main(String [] args){    
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();
//         int [][] numbers = new int [rows][cols];
//         // input
//         // row ka input
//         for(int i=0; i<rows; i++){
//             // column ka input
//             for(int j=0; j<cols; j++){
//                 numbers[i][j] = sc.nextInt();
//             }
//         }
//         int x = sc.nextInt();
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 // compare with x
//                 if(numbers[i][j]==x){
//                     System.out.println("x found at location ("+i+","+j+")");
//                 }
//             }
//         }
//     }
// }


// import java.util.*;
// public class arrays{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();
//         int [][] numbers = new int[rows][cols];
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 numbers[i][j] = sc.nextInt();
//             }
//         }
//         int x = sc.nextInt();
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 if(numbers[i][j]==x){
//                     System.out.println("x found at index ("+i+" "+j+")");
//                 }
//             }
//         }
//     }
// }


// Ques: 1 Write a program to read the array elements from the user and display the odd elements of the array.
// import java.util.*;
// public class arrays{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int [] arr = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0; i<n; i++){
//             if(arr[i]%2!=0){
//                 System.out.println(arr[i]);
//             }
//         }
//     }
// }

// Ques:2 Write a program to store n elements in an array and print the elements in reverse order.
// import java.util.*;
// public class arrays{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int [] arr = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=n-1; i>=0; i--){
//             System.out.println(arr[i]);
//         }
//     }
// }


// Ques: Write a program to count the frequency of each element of an array.
import java.util.*;

public class arryas {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] freq = new int[n];

            // Input elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                freq[i] = -1; // mark all as uncounted initially
            }

            // Count frequency
            for (int i = 0; i < n; i++) {
                int count = 1;

                if (freq[i] != -1) {
                    continue; // already counted
                }

                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        freq[j] = 0; // mark duplicate positions
                    }
                }
                freq[i] = count; 
            }
            for (int i = 0; i < n; i++) {
                if (freq[i] > 0) {
                    System.out.println(arr[i] + " occurs " + freq[i] + " times");
                }
            }
        }
    }
}
