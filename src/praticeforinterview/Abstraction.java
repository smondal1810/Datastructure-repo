package praticeforinterview;

abstract class car {
    public abstract void bmw();



}
class Bicycle extends car{

    @Override
    public void bmw() {
        System.out.println("made by my company :");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        car obj = new Bicycle();
        obj.bmw();



        }

    }

