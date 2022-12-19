package Assignment02;

public class Q4 {
    static class Wooden{
        String item;// table or chair
        public Wooden(String item) {
            this.item = item;
        }
    }
    static class WoodenChair extends Wooden{
        public WoodenChair(String item) {
            super(item);
        }
        public void StressTest(){
            System.out.println("wooden chair stress test");
        }
        public void FireTest(){
            System.out.println("wooden chair fire test");
        }

    }
    static class WoodenTable extends Wooden{
        public WoodenTable(String item) {
            super(item);
        }
        public void StressTest(){
            System.out.println("wooden table stress test");
        }
        public void FireTest(){
            System.out.println("wooden table fire test");
        }
    }
    static class Metal{
        String item;// table or chair
        public Metal(String item) {
            this.item = item;
        }
    }
    static class MetalChair extends Metal{

        public MetalChair(String item) {
            super(item);
        }

        public void StressTest(){
            System.out.println("metal chair stress test");
        }
        public void FireTest(){
            System.out.println("metal chair fire test");
        }

    }
    static class MetalTable extends Metal{
        public MetalTable(String item) {
            super(item);
        }
        public void StressTest(){
            System.out.println("metal table stress test");
        }
        public void FireTest(){
            System.out.println("metal table fire test");
        }
    }

    public static void main(String[] args) {

    }
}
