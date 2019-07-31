import java.util.Arrays;
import java.util.List;

/* Returns a String that only contains the vowels of the input String */

public class NoConsonants {

    //Input String, call method and display end product
    public static void main(String[] args){
        String input = "The World Is Your Oyster!!???";
        System.out.println(vowelOnly(input));
    }

    //method to leave only the vowels of the input String
    public static String vowelOnly(String input) {

        //create list of vowels
        Character vowels[] =
                { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        //create an array list with those vowels
        List<Character> list = Arrays.asList(vowels);

        //create StringBuffer
        StringBuffer sb = new StringBuffer(input);

        //goes through each char of input String and deletes all non-vowel chars
        for (int i = 0; i < sb.length(); i++) {
            if (!list.contains(sb.charAt(i))) {
                sb.replace(i, i + 1, "");
                i--;
            }
        }
        //returns sequence of chars as String
        return sb.toString();
    }
}
