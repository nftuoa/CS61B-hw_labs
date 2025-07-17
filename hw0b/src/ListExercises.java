import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        int sum=0;
        for(int item:L)
        {
            sum+=item;;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> evens = new ArrayList<>();
        for(int item:L)
        {
            if(item%2==0)
            {
                evens.add(item);
            }
        }
        return evens;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> coexist = new ArrayList<>();
        for (int item:L1){
            if(L2.contains(item)){
                coexist.add(item);
            }
        }
        return coexist;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int occ = 0;
        for(String item:words) {
            for (Character ch:item.toCharArray()){
                if(ch.equals(c))occ++;
            }
        }
        return occ;
    }
}
