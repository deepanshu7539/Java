

class Circle{

    public int radius;

    Circle(int r){
        System.out.println("i am circle parameeterize consterctor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{

    public int height;
    Cylinder1(int r , int h){

        super(r);
        System.out.println("i am cylinder parameterize constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.height;
    }
}
public class qustions {
    public static void main(String[] args) {
        //problem 1

        Cylinder1 obj = new Cylinder1(12 ,4);
    }
}
