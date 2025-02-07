package praticeforinterview;

class Tolerngenerics<E,A>{
    E a;
    A name;


    public Tolerngenerics(E a, A name){
        this.a = a;
        this.name = name;
    }
}

public class Genirics {
    public static void main(String[] args) {
        Tolerngenerics<Integer, String> obj = new Tolerngenerics<>(10,"sunit");
        System.out.println(obj.name);

    }
}
