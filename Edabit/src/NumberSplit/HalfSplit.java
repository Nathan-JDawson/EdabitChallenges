package NumberSplit;

import java.util.Arrays;

public class HalfSplit {
	public static int[] numberSplit(int n) {
		int half = n/2;
        if(n % 2 == 0){
            return new int[]{half, half};
        }
        return new int[]{half, half+1};
	}

    public static void main(String[] args){
        System.out.println(Arrays.toString(numberSplit(605)));
        System.out.println(10);
    }
}