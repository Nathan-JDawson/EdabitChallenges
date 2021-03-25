public class Challenge {
	public static int solutions(int a, int b, int c) {
		int discriminant = ((int)Math.pow(b, 2)) - (4*a*c);
    if(discriminant > 0){
      return 2;
    }else if(discriminant == 0){
      return 1;
    }
    return 0;
  }

  public static void main(String[] args){
    System.out.println(solutions(1, 0, 0));

  }
}

