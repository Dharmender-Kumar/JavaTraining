package Assignment02;


interface Wooden{
    void fireTest();
    void stressTest();
}

interface Metal{
    void fireTest();void stressTest();
}

class Chair implements Wooden, Metal{

    String type;
    public Chair(String type){
        this.type = type;
    }
    @Override
    public void fireTest() {
        System.out.println(this.type+" chair fire test!");
    }

    @Override
    public void stressTest() {
        System.out.println(this.type+" chair stress test!");
    }
}

class Table implements Wooden, Metal{
    String type;
    public Table(String type){
        this.type = type;
    }
    @Override
    public void fireTest() {
        System.out.println(this.type+" table fire test!");
    }

    @Override
    public void stressTest() {
        System.out.println(this.type+" table stress test!");
    }
}
public class Q4 {
    public static void main(String[] args) {
        Chair woodenChair = new Chair("wooden");
        Table woodenTable = new Table("wooden");
        Chair metalChair = new Chair("metal");
        Table metalTable = new Table("metal");
        metalTable.fireTest();
        metalChair.fireTest();
        woodenTable.fireTest();
        woodenChair.fireTest();
    }
}
