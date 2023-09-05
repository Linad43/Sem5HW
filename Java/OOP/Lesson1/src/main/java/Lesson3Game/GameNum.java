package Lesson3Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameNum extends AbstractGame{
    @Override
    public List<String> generateCharList() {
        List<String> list = new ArrayList<>(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));
        return list;
    }
}
