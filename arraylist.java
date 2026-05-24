import java.util.*;
public class arraylist {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        
        int size = list.size();
        System.out.println(size);
    
        System.out.println(list);

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

        
    }
}
