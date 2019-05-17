import java.util.Scanner;

public class PresenceofName {
    public static String sortAlpha(String str,String find){
        String contain = "";

        String[] str1 = str.split(" ");

        if(str1.equals(find)){
            contain = "true";
        }
        else
            contain="false";
    return contain;
    }
}
