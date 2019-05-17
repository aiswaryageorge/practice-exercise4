import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurences {


public  boolean multOccur(String text,String se){

        Pattern pattern = Pattern.compile(se);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Found at" + matcher.start() + "-" + matcher.end());
        }return true;


    }
}

