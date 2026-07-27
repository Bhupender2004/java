// import java.util.HashSet;
// import java.util.Iterator;

// public class Hashing {
//     public static void main(String [] args){
//         HashSet<Integer> set = new HashSet<>();

//         set.add(1);
//         set.add(2);
//         set.add(3);
//         set.add(1);

//         // size
//         System.out.println("Size of set is: "+set.size());

//         // print all elements
//         if(set.contains(1)){
//             System.out.println("set contains 1");
//         }
//         if(!set.contains(6)){
//             System.out.println("does not contain");
//         }

//         //delete
//         set.remove(1);
//         if(!set.contains(1)){
//             System.out.println("doest not contain 1");
//         }

//         // Iterator
//         Iterator it = (Iterator) new set.iterator();
//         while(it.hasNext()){
//             System.out.print(it.next());
//         }
//     }
// }



// import java.util.*;
// class Hashing{
//    public static void majorityElement(int [] arr){
//       HashMap<Integer, Integer> map=new HashMap<>();
//       int n=arr.length;
//       for(int i=0; i<n; i++){
//          if(map.containsKey(arr[i])){
//             map.put(arr[i], map.get(arr[i])+1);
//          }else{
//             map.put(arr[i], 1);
//          }
//       }
//       for(int key:map.keySet()){
//          if(map.get(key)>n/3){
//             System.out.println(key);
//          }
//       }
//    }


//    public static void main(String [] args){
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter size of array: ");
//       int n=sc.nextInt();
//       int arr[]=new int[n];
//       System.out.print("Enter array: ");
//       for(int i=0; i<n; i++){
//          arr[i]=sc.nextInt();
//       }
//       majorityElement(arr);
//    }
// }


