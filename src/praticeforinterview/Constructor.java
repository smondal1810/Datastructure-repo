package praticeforinterview;

class Cuman {
    int age;
    String name;

    public Cuman(int age, String name){
        this.age = age;
        this.name = name;
        System.out.println("hello world !");
    }

}

public class Constructor {
    public static void main(String[] args) {
        Cuman obj = new Cuman(14,"rohit");
        System.out.println(obj.age);
        System.out.println(obj.name);

    }
}
