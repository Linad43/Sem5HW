package Lesson3Game;

import java.util.ArrayList;
import java.util.List;

public class RUGame extends AbstractGame{

    @Override
    public List<String> generateCharList() {
        List<String> list = new ArrayList<>();
        for (int i = 'а'; i <= 'я'; i++) {
            list.add(String.valueOf((char)i));
        }
        list.add("ё");
        return list;
    }
}
