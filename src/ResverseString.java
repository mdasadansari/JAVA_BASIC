
import java.util.Scanner;

public class ResverseString {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String og = "hello my name is jvm";
        String rev = "";
        for (int c=og.length()-1; c>=0; c--){
            rev = rev+og.charAt(c);
        }
        System.out.println(rev);


    }
}
