import java.util.HashMap;
import java.util.Map;

public class Challenge {
	public static int findOdd(int[] arr) {
		HashMap<Integer, Integer> count = new HashMap<>();


        for(int i = 0; i < arr.length; i++){
            if(count.get(arr[i]) == null){
                count.put(arr[i], 1);
            }else{
                int newCount = count.get(arr[i]) + 1;
                count.put(arr[i], newCount);
            }
        }

        for (Map.Entry<Integer,Integer> entry: count.entrySet()){
            if(entry.getValue() % 2 != 0){
                return entry.getKey();
            }
        }
        return 0;
	}

    public static void main(String[] args){
        System.out.println(findOdd(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
    }
}