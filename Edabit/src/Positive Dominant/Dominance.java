import java.util.ArrayList;

public class Dominance {
    public static boolean isPositiveDominant(int[] n) {
        //create list of unique ints
        ArrayList<Integer> unique = new ArrayList<>();
        for(int i: n){
            if(!unique.contains(i)){
                unique.add(i);
            }
        }

        //cycle unique list and count pos and neg
        int pos, neg;
        pos = neg = 0;
        for(int i: unique){
            if(i < 0){
                neg++;
            }else if(i > 0){
                pos++;
            }
        }

        return pos > neg;
    }
  }