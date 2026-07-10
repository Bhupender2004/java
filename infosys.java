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

import java.util.*;
class infosys{
    public boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        char [] sSort=s.toCharArray();
        char [] tSort=t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        if(Arrays.equals(sSort, tSort)){
            return true;
        }
        return false;
    }
}