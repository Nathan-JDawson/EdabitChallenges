public class Program {
	public static int sum(int[] arr) {
		if(arr.length == 0){
            return 0;
        }else{
            int size = arr.length - 1;
            int[] newArr = new int[size];
            for(int i = 0; i < size; i++){
                newArr[i] = arr[i];
            }
            return arr[size] + sum(newArr);
        }
	}

    public static void main(String[] args){
        System.out.println(sum(new int[]{1,2,3,4}));
    }
}