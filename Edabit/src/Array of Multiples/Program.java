import java.util.*;

public class Program {
	public static int[] arrayOfMultiples(int num, int length) {
		ArrayList<Integer> multiples = new ArrayList<>();
        for(int i = 1; i <= length; i++){
            multiples.add(num*i);
        }
        return multiples.stream().mapToInt(i->i).toArray();
	}
}