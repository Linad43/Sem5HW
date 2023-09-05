package Lesson3Game;

import java.util.ArrayList;
import java.util.List;

public class ENGame extends AbstractGame{

    @Override
    public List<String> generateCharList() {
        List<String> list = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            list.add(String.valueOf((char)i));
        }
        return list;
    }
}