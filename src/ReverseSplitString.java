import java.util.Arrays;
import java.util.Collections;

public class ReverseSplitString {
    public static void main(String[] args) {
        String og = "Hello I need to get split and reversed";
        String rev[] = og.split(" ");
        String reverse = "";
        System.out.println(Arrays.toString(rev));
        for (String s:rev){
            for (int i = s.length()-1; i >=0;i--){
                reverse = reverse+s.charAt(i);
            }
            reverse = reverse+" ";
        }
        System.out.println(reverse);

    }
}
