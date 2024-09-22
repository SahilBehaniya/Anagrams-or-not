import java.util.Arrays;
import java.util.Scanner;

public class Anagarams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.nextLine();
        String s2 =sc.nextLine();
        
        if(s1.length()!=s2.length()) System.out.println("false");

        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();


        Arrays.sort(ch1);
        Arrays.sort(ch2);

       
            if(Arrays.equals(ch1,ch2)){
                System.out.println( "anagrams");
                    
            }else{
                System.out.println("not aanragrams");
            }
        
       
    }
}
