import java.util.Scanner;

public class CalculatePercentage {
  //  public static double percentage;

    public static void main (String[] args){
        System.out.println("CalculatePercentage");
        Scanner mark = new Scanner(System.in);
        System.out.println("subject 1.");
        float a = mark.nextFloat();
        System.out.println("subject 2.");
        float b = mark.nextFloat();
        System.out.println("subject 3.");
        float c = mark.nextFloat();
        System.out.println("subject 4.");
        float d = mark.nextFloat();
        System.out.println("subject 5.");
        float e = mark.nextFloat();
        float sum = a+b+c+d+e;
        System.out.println("total mark obtain");
        System.out.println(sum);
       double percentage = (sum / 500.0) * 100;
        System.out.println("Percentage = "+percentage);
    };
}