package praticeforinterview;

class A{
    public  void show(){
        System.out.println("show a");
    }
}
class B extends A {
    @Override
    public void show(){
        System.out.println("show b");

    }
}
class C extends A {
    public void show() {
        System.out.println("show c");
    }
}
public class Overriding {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        obj = new B();
        obj.show();

    }
}

