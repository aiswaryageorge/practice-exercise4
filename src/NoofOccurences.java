public class NoofOccurences {

    public static int totOccurences(String str) {

        int charcount = str.length() - str.replaceAll("a", "").length();

        return charcount;

    }
}
