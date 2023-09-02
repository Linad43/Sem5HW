package Lesson2HW;

public abstract class Live extends Sportsmen {

    public Live(String name) {
        super(name);
    }
    public abstract boolean jump(double height);
    public abstract boolean run(int dist);
}
