package Assignment01;

public class Q2 {
    int a;
    String b;

    public Q2(int a,String b){
        this.a=a;
        this.b=b;
    }

    Q2(Q2 ques2){
        System.out.println("Copy constructor");
        this.a=a;
        this.b=b;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Q2 obj1 = new Q2(1,"Deku");

        Q2 obj2 = (Q2) obj1.clone();// cloneable
        Q2 obj3 = new Q2(obj1);//copy constructor
    }

}
