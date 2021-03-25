public class Program {
    public static int warOfNumbers(int[]numbers){
        int odd = 0;
        int even = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                even += numbers[i];
            }else{
                odd += numbers[i];
            }
        }
        return Math.abs(even - odd);
    }
  }