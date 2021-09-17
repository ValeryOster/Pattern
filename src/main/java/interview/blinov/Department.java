package interview.blinov;

public class Department {
    public static void main(String[] args) {
        new DemoLogicMain(71);
    }
}

class DemoLogicMain {


    private int id = 42;

    {
        System.out.println("logic (1) id=" + this.id);
    }

    { /* not very good location of the logical block */
        System.out.println("logic (2) id=" + id);
    }
    static {
        System.out.println("static logic");
    }
    public DemoLogicMain(int id) {
        this.id = id;
        System.out.println("constructor id=" + id);
    }

    public int getId() {
        return id;
    }
}
