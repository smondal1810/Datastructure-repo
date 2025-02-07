package praticeforinterview;

class D {
    public void sum(int a,int b){
        System.out.println(a+b);
    }
}
class E extends D{
    public void multiplication(int a, int b ){
        System.out.println(a*b);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        E obj = new E();
        obj.multiplication(3,7);
        obj.sum(4,8);
    }
}
