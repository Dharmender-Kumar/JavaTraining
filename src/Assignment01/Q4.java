package Assignment01;


class Grandparent{
    static{
        System.out.println("static-grandfather");
    }{
        System.out.println("instance-grandparent");
    }

    public Grandparent(){
        System.out.println("constructor-grandparent");
    }
}

class Parent extends Grandparent{
    {
        System.out.println("instance-parent");
    }
    public Parent(){
        System.out.println("constructor-parent");
    }

    static{
        System.out.println("static-parent");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("constructor-child");
    }
    static {
        System.out.println("static-child");
    }
    {
        System.out.println("instance-child");
    }
}

public class Q4 extends Child {
    public static void main(String[] args) {
        Child ch = new Child();
    }
}
