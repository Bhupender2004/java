// Write a program to print the matrix.

// import java.util.*;
// public class matrix{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter row : ");
//         int r = sc.nextInt();
//         System.out.print("Enter col : ");
//         int c = sc.nextInt();
//         int arr [] [] = new int[r][c];
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 arr[i][j]=sc.nextInt();
//          }
//         }
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 System.out.print("The matrix is: "+ arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Write a program to print the sum of all the elements of a matrix.

// import java.util.*;
// public class matrix{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter row : ");
//         int r = sc.nextInt();
//         System.out.print("Enter col : ");
//         int c = sc.nextInt();
//         int arr [] [] = new int[r][c];
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 arr[i][j]=sc.nextInt();
//          }
//         }
//         int sum = 0;
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 sum = sum + arr[i][j];
//             }
//         }
//         System.out.println("The sum is: "+sum);
//     }
// }


// Write a program to print the transpose of a matrix.

// import java.util.*;
// public class matrix{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter row : ");
//         int r = sc.nextInt();
//         System.out.print("Enter col : ");
//         int c = sc.nextInt();
//         int arr [] [] = new int[r][c];
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 arr[i][j]=sc.nextInt();
//          }
//         }
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 System.out.print(arr[j][i]+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// Write a program to print the sum of the diagonal elements of a matrix.

// import java.util.*;
// public class matrix{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter row : ");
//         int r = sc.nextInt();
//         System.out.print("Enter col : ");
//         int c = sc.nextInt();
//         int arr [] [] = new int[r][c];
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 arr[i][j]=sc.nextInt();
//           }
//         }
//         int sum = 0;
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 if(i==j){
//                     sum = sum + arr[i][j];
//                 }
//             }
//         }
//         System.out.println("The sum is: "+sum);
//     }
// }


// Write a program to find the sum of two matrices.

// import java.util.*;
// public class matrix{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter row : ");
//         int r = sc.nextInt();
//         System.out.print("Enter col : ");
//         int c = sc.nextInt();
//         int arr1 [] [] = new int[r][c];
//         int arr2 [] [] = new int[r][c];
//         int sum [] [] = new int[r][c];
//         System.out.println("Enter elements of first matrix: ");
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 arr1[i][j]=sc.nextInt();
//           }
//         }
//         System.out.println("Enter elements of second matrix: ");
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 arr2[i][j]=sc.nextInt();
//           }
//         }
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 sum[i][j] = arr1[i][j] + arr2[i][j];
//             }
//         }
//         System.out.println("The sum is: ");
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 System.out.print(sum[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// Write a program to find the product of two matrices.

// import java.util.*;
// public class matrix{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter row : ");
//         int r = sc.nextInt();
//         System.out.print("Enter col : ");
//         int c = sc.nextInt();
//         int arr1 [] [] = new int[r][c];
//         int arr2 [] [] = new int[r][c];
//         int product [] [] = new int[r][c];
//         System.out.println("Enter elements of first matrix: ");
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 arr1[i][j]=sc.nextInt();
//            }
//         }
//         System.out.println("Enter elements of second matrix: ");
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 arr2[i][j]=sc.nextInt();
//            }
//         }
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 for(int k=0; k<c; k++){
//                     product[i][j] += arr1[i][k] * arr2[k][j];
//                 }
//             }
//         }
//         System.out.println("The product is: ");
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 System.out.print(product[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }


//  Write a program to find the lower triangular matrix.

// import java.util.*;
// public class matrix{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter row : ");
//         int r = sc.nextInt();
//         System.out.print("Enter col : ");
//         int c = sc.nextInt();
//         int arr [] [] = new int[r][c];
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 arr[i][j]=sc.nextInt();
//            }
//         }
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 if(i<j){
//                     arr[i][j]=0;
//                 }
//             }
//         }
//         System.out.println("The lower triangular matrix is: ");
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// Write a program to find the upper triangular matrix.

// import java.util.*;
// public class matrix{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter row : ");
//         int r = sc.nextInt();
//         System.out.print("Enter col : ");
//         int c = sc.nextInt();
//         int arr [] [] = new int[r][c];
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 arr[i][j]=sc.nextInt();
//            }
//         }
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 if(i>j){
//                     arr[i][j]=0;
//                 }
//             }
//         }
//         System.out.println("The upper triangular matrix is: ");
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }


//  Write a program to find the saddle point of a matrix.
