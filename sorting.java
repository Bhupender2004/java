
// Bubble Sort
// public class sorting {
//     public static void printarray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String [] args){
//         int arr[] = {54,78,14,86,12,34,67};
//         for(int i=0; i<arr.length-1; i++){
//             for(int j=0; j<arr.length-i-1; j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j+1];
//                     arr[j+1]=arr[j];
//                     arr[j]=temp;
//                 }
//             }
//         }
//         printarray(arr);
//     }
// }


// Selection Sort
// public class sorting{
//     public static void printarray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String [] args){
//         int arr[] = {43,745,376,27,234,23,1};
//         for(int i=0; i<arr.length-1; i++){
//             int smallest = i;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[smallest]>arr[j]){
//                     smallest = j;
//                 }
//             }
//             int temp = arr[smallest];
//             arr[smallest]=arr[i];
//             arr[i]=temp;
//         }
//         printarray(arr);
//     }
// }



// Insertion Sort
// public class sorting{
//     public static void printarray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String [] args){
//         int arr[] = {2,35,6,243,43,5,27};

//         for(int i=1; i<arr.length; i++){
//             int current = arr[i];
//             int j = i-1;
//             while(j>0 && current < arr[j]){
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1]=current;
//         }
//         printarray(arr);
//     }
// }



