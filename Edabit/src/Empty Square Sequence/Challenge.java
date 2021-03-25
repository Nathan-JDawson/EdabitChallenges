public class Challenge {
	public static int emptySq(int step) {
        int width = step * 2;
        int emptyInRow = (step - 1) * 2;
        return width * emptyInRow;
  }
}