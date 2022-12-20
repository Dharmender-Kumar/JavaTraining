package Assignment02;

class Singleton{
    private static Singleton inst = null;
    public String s;

    private Singleton(){
        s = "hello there!";
    }
    public static Singleton getInstance(){
        if(inst==null){
            inst = new Singleton();
        }
        return inst;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        System.out.println(x.hashCode()+"\t"+y.hashCode()+"\t"+z.hashCode());
    }
}