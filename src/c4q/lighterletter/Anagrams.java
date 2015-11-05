package c4q.lighterletter;
import java.util.Arrays;

/**
 * Created by c4q-john on 10/22/15.
 */
public class Anagrams
{

    public static boolean checkAnagram(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args)
    {
        String word1 = "cat";
        String word2 = "tac";

        if(checkAnagram(word1, word2))
        {
            System.out.println("Oh my Glob! Totally an anagram!");
        }
        else System.out.println("Womp Womp, not an anagram. :(");

    }

}
