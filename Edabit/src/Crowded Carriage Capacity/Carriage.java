public class Carriage {
	public static int findSeat(int n, int[] arr) {
		//find max capacity of each carriage
        float capacity = n / arr.length;

        //for each carriage, find % full
        for(int i = 0; i < arr.length; i++){
            float percentage = (arr[i] / capacity) * 100;
            if(percentage <= 50.0){
                return i;
            }
        }
        return -1;
	}
}		