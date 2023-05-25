
    class  employee{
    int salary;
    String name;
    public void printDetail(){
        System.out.println("my id salary "+ salary);
        System.out.println("and my name is "+ name );
    }
}
public class class_{
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        employee harry = new employee();
        employee john = new employee();

        harry.salary = 12;
        harry.name = "code with harry";

        john.salary = 23;
        john.name = "john don";

        harry.printDetail();
        john.printDetail();

    }
}
