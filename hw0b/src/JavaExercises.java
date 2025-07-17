import java.util.ArrayList;
import java.util.List;

public class JavaExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        int[] nums =  new int[6];
        for(int i  = 1;i<=6;i++) {
            nums[i-1]=i;
        }
        
        return nums;
    }

    /** Returns the order depending on the customer.
     *  If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     *  If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     *  In any other case, return an empty String[] of size 3. */
    public static String[] takeOrder(String customer) {
        String[] Erguns = {"beyti", "pizza", "hamburger", "tea"};
        String[] Eriks = {"sushi", "pasta", "avocado", "coffee"};
        String[] others = new String[3];
        if(customer.equals("Ergun")) {return Erguns;}
        else if(customer.equals("Erik")) {return Eriks;}
        else return others;
    }

    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    public static int findMinMax(int[] array) {
        int max=0,min=Integer.MAX_VALUE;
        for(int item:array){
            if(item>max){max=item;}
            if(item<min){min=item;}
        }
        return max-min;
    }

    /**
      * Uses recursion to compute the hailstone sequence as a list of integers starting from an input number n.
      * Hailstone sequence is described as:
      *    - Pick a positive integer n as the start
      *        - If n is even, divide n by 2
      *        - If n is odd, multiply n by 3 and add 1
      *    - Continue this process until n is 1
      */
    public static List<Integer> hailstone(int n) {
        return hailstoneHelper(n, new ArrayList<>());
    }

    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
        list.add(x);
        if(x>0&&x%2==0) {

            return hailstoneHelper(x/2, list);
        }
        else if(x==1) {
            return list;
        }
        else {

            return hailstoneHelper(3*x+1, list);
        }
    }

}
