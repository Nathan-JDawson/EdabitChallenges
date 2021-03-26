public class Challenge {
    public static boolean pagesInBook(int total) {
        int count, page;
        count = page = 0;
        while(count < total){
            page++;
            count += page;
        }
        return count == total;
    }
  }