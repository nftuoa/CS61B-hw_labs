import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> letterandnum = new HashMap<>();
        Character currentchar='a';
        for(int i = 0;i<26;i++)
        {
            letterandnum.put((char) ('a'+i),i+1);
        }
        return letterandnum;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> squs = new HashMap<>();
        for(Integer item:nums){
            squs.put(item,item*item);
        }
        return squs;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordcount = new HashMap<>();
        for(String item:words){
            if(wordcount.containsKey(item))
            {
                wordcount.compute(item,(word,count)->count +1);
            }
            else wordcount.put(item,1);
        }
        return wordcount;
    }
}
