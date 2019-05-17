import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static String sortStr(String s)
    {
        int n;
        String temp;
        String names[] = s.split(" ");
        for (int i = 0; i < names.length; i++)
        {
            for (int j = i + 1; j < names.length; j++)
            {
                if (names[i].compareTo(names[j])>0)
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        return Arrays.toString(names);
    }
}
