package SingletonDesignPattern;

class A{

    private static A a;

    private A() {

    }

    public static A getInstance(){
        if (a == null){
            a = new A();
        }

        return a;
    }

    public void MyMethod(){
        System.out.println("myMethod In " + this);
    }
}

public class Example {
    public static void main(String[] args) {
        A a1 = A.getInstance();
        a1.MyMethod();

        A a2 = A.getInstance();
        a2.MyMethod();
    }
}
