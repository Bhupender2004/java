//

// import java.util.Arrays;
// import java.util.Scanner;

// public class training_day5 {
//     public static void main(String [] args){
// 		Scanner sc = new Scanner(System.in);
// 		int n =sc.nextInt();
// 		int [] start=new int[n];
// 		int [] end=new int[n];

// 		for(int i=0; i<n; i++){
// 			start[i]=sc.nextInt();
// 			end[i]=sc.nextInt();
// 		}
// 		Arrays.sort(start);
// 		Arrays.sort(end);

// 		int rooms=0;
// 		int maxRooms=0;

// 		int i=0; 
// 		int j=0;
// 		while(i<n&&j<n){
// 			if(start[i]<end[j]){
// 				rooms++;

// 				if(rooms>maxRooms){
// 					maxRooms=rooms;
// 				}
// 				i++;
// 			}else{
// 				rooms--;
// 				j++;
// 			}
// 		}
// 		System.out.println(maxRooms);
// 	}
// }
