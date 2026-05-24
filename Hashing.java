import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String [] args){
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // size
        System.out.println("Size of set is: "+set.size());

        // print all elements
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contain");
        }

        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("doest not contain 1");
        }

        // Iterator
        Iterator it = (Iterator) new set.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}
