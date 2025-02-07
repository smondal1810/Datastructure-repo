package praticeforinterview;


class Human {
    private int age = 12;
    private String name ="Sunit";


    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age = a;

    }
    public void setName(String n){
        name = n;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human hu = new Human();
        //hu.setAge(5);
        //hu.setName("rohit");
        System.out.println(hu.getAge());
        System.out.println(hu.getName());
    }
}
