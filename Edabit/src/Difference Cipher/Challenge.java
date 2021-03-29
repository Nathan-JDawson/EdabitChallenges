public class Challenge {
	public static int[] encrypt(String str) {
        int diff = 0;
        char[] stringArray = str.toCharArray();
        int[] coded = new int[stringArray.length];
		for(int i = 0; i < stringArray.length; i++){
            coded[i] = stringArray[i] - diff;
            diff = stringArray[i];
        }
        return coded;
	}

	public static String decrypt(int[] arr) {
        char lastChar = 0;
        char[] decoded = new char[arr.length];
        for(int i = 0; i < arr.length; i++){
            char letter = (char)(arr[i] + lastChar);
            decoded[i] = letter;
            lastChar = letter;
        }
        return new String(decoded);
	}
}