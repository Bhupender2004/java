import java.util.*;
class training_day8{
    public static void printNum(int n){
        if(n==0){
            return;
        }
        printNum(n-1);
        System.out.print(n+" ");
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.: ");
        int n=sc.nextInt();
        printNum(n);
    }
}