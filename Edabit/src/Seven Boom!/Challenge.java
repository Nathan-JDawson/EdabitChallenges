public class Challenge {
    
	public static String sevenBoom(int[] arr) {
        String boom = "Boom!";
        String error = "there is no 7 in the array";
		for(int i = 0; i < arr.length; i++){
            //find number of digits and split up the number
            int num = arr[i];
            while(num > 0){
                if(num % 10 == 7){
                    return boom;
                }
                num /= 10;
            }
        }
        return error;
	}
}