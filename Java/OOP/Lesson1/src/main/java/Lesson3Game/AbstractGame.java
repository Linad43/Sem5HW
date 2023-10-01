package Lesson3Game;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game{

    private Game game;
    Integer sizeWord;
    Integer maxTry;
    String word;
    GameStatus gameStatus = GameStatus.INIT;
    public String generateWord(){
        List<String> alphavit = generateCharList();
        Random r = new Random();
        String result = "";
        for (int i = 0; i < sizeWord; i++) {
            int index = r.nextInt(alphavit.size());
            result = result.concat(alphavit.get(index));
            alphavit.remove(index);
        }
        return result;
    }

    public List<String> generateCharList(Game game1) {
        return game1.generateCharList();
    }

    @Override
    public void Start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        this.word = generateWord();
        gameStatus = GameStatus.START;
        Answer.stringWord(word);
    }

    @Override
    public Answer inputValue(String value) {
        maxTry--;
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < value.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == value.charAt(i)) {
                    cows++;
                    if (i == j) {
                        bulls++;
                    }
                }
            }

        }
        if (word.length() == bulls)
        {
            gameStatus = GameStatus.WIN;
        }
        else if (maxTry==0)
        {
            gameStatus = GameStatus.LOSE;
        }
        return new Answer(value, bulls, cows);
    }

    @Override
    public GameStatus getNameStatus() {
        return gameStatus;
    }
}
