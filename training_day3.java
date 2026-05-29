// // Merge sort 

// import java.util.*;
// class Main{
//     static void mergeSort(int arr[], int left, int right){
//         if(left<right){
//             int mid=(left+right)/2;
//             mergeSort(arr, left, mid);
//             mergeSort(arr, mid+1, right);
//             merge(arr, left, mid, right);
//         }
//     }
    
//     static void merge(int arr[], int left, int mid, int right){
//         int temp[]=new int[right-left+1];
//         int i=left;
//         int j=mid+1;
//         int k=0;
        
//         while(i<=mid&&j<=right){
//             if(arr[i]<=arr[j]){
//                 temp[k]=arr[i];
//                 i++;
//             }else{
//                 temp[k]=arr[j];
//                 j++;
//             }
//             k++;
//         }
        
//         while(i<=mid){
//             temp[k]=arr[i];
//             i++;
//             k++;
//         }
        
//         while(j<=right){
//             temp[k]=arr[j];
//             j++;
//             k++;
//         }
        
//         for(i=left, k=0; i<=right; i++, k++){
//             arr[i]=temp[k];
//         }
//     }
    
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
        
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
        
//         mergeSort(arr,0,n-1);
        
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


// Given an array of integers numbers that is sorted in non-decreasing order.
// public class training_day3 {
//     public int[] twoSum(int[] numbers, int target) {
//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = i + 1; j < numbers.length; j++) {
//                 if (numbers[i] + numbers[j] == target) {
//                     return new int[] { i + 1, j + 1 };
//                 }
//             }
//         }
//         return new int[0];
//     }
// }

