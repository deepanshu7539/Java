import java.sql.SQLOutput;

abstract class Parent{
    public Parent(){
        System.out.println("main base constructer ");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
}

abstract class Child1 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}
public class abstract1 {

    public static void main(String[] args) {
        Child c = new Child();
        // Child1 c3 = new Child1();
        }
    }

