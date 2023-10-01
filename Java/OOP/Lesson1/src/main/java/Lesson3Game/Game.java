package Lesson3Game;

import java.util.List;

public interface Game {
    void Start (Integer sizeWord, Integer maxTry);
    public List<String> generateCharList();
    Answer inputValue(String value);
    GameStatus getNameStatus();
}
