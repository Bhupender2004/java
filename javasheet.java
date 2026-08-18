import java.util.*;
class javasheet{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine();
        char [] charArr=s.toLowerCase().toCharArray();
        int count1=0;
        int count2=0;
        for(int i=0; i<s.length(); i++){
            if(charArr[i]=='a'||charArr[i]=='e'||charArr[i]=='i'||charArr[i]=='o'||charArr[i]=='u'){
                count1++;
            }else if(charArr[i]>='a'&&charArr[i]<='z'){
                count2++;
            }
        }
        System.out.println("Vowels in strings are: "+count1);
        System.out.println("Consonants in string are: "+count2);
        sc.close();
    }
}