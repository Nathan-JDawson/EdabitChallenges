public class Challenge {
	public static int[][] squarePatch(int n) {
		int[][] patch = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                patch[i][j] = n;
            }
        }

        return patch;
	}
}