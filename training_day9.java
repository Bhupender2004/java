// tower of hanoi
import java.util.*;
class training_day9{
    public static void main(String [] r){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int ans=(int)Math.pow(2,n);
		System.out.print(ans-1);
	}
}