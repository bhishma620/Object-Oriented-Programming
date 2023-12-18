abstract class Pen {
    protected String name;

    Pen(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("I am a " + this.name);
    }

    public abstract void write();

    public String getName() {
        return name;
    }
}

class BallPen extends Pen {
    BallPen(String name) {
        super(name);
    }

    public void write() {
        System.out.println("You are writing using Ball Pen");
    }
}

class FountainPen extends Pen {
    FountainPen(String name) {
        super(name);
    }

    public void write() {
        System.out.println("You are writing using Fountain Pen");
    }
}

public class UsingAbstractClass {
    public static void main(String[] args) {
//        Pen p=new Pen("pen");//we cann't create object of abstract class

        BallPen bp = new BallPen("Ball Pen");
        bp.displayName();
        bp.write();

        FountainPen fp = new FountainPen("Fountain Pen");
        fp.displayName();
        fp.write();
    }
}
