package Lesson2HW;

public class Human extends Live implements Moving{
    private final double heightJump;
    private final int distRun;

    public Human(String name, double heightJump, int distRun) {
        super(name);
        this.heightJump = heightJump;
        this.distRun = distRun;
    }


    @Override
    public boolean jump(double height) {
        return (height <= heightJump);
    }
    @Override
    public boolean run(int dist) {
        return (dist <= distRun);
    }

    public double getHeightJump() {
        return heightJump;
    }

    public int getDistRun() {
        return distRun;
    }
}
