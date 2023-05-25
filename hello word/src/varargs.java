public class varargs {
    static int sum(int ...arr){
        // Available as int [] arr;
        int result=0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main (String[] args){
        System.out.println("welcome to varargs");
        System.out.println("the sum of 2 and 4 is:" + sum( 2,4));
    }
}
