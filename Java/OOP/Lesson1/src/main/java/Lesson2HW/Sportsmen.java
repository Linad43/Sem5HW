package Lesson2HW;

public abstract class Sportsmen {
    private Moving moving;
    private final String name;

    public Sportsmen(String name) {
        this.name = name;
    }

    public static boolean jump(Moving moving, double height)
    {
        return moving.jump(height);
    }
    public static boolean run(Moving moving, int dist)
    {
        return moving.run(dist);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Sportsmen{" +
                "name='" + name + '\'' +
                '}';
    }
}
