public class Shiritori {
	private String[] words;
    public Boolean game_over;

    public Shiritori(){
        game_over = false;
    }

    public Object play(String word){
        if(words == null){
            words = new String[]{word};
            return words;
        }

        int size = words.length;

        if(size == 0){
            words = new String[]{word};
            return words;
        }

        //check for duplicate word rule
        for(int i = 0; i < size; i++){
            if(words[i].equals(word)){
                game_over = true;
                return "game over";
            }
        }

        //check for character rule
        String[] lastWord = words[size-1].split("");
        String[] newWord  = word.split("");
        if(lastWord[lastWord.length - 1].equals(newWord[0])){
            words = addNewWord(word, size);
            return words;
        }
        game_over = true;
        return "game over";
    }

    public String restart(){
        words = new String[]{};
        game_over = false; 
        return "game restarted";
    }

    public String[] getWords(){
        return words;
    }

    private String[] addNewWord(String word, int size){
        String[] newWords = new String[size + 1];
        for(int i = 0; i < size; i++){
            newWords[i] = words[i];
        }
        newWords[size] = word;
        return newWords;
    }
}