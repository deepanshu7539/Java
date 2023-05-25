
import java.sql.SQLOutput;
import java.util.Scanner;
public class condition {
    public static void main(String[] args){
     /*   byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);

        System.out.println("you are math");
        m1 = sc.nextByte();

        System.out.println("you are semi science");
        m2 = sc.nextByte();

        System.out.println("you are not english");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("overall parcentage is: " +avg);
        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("cogratulation 'you have been parmoted'");
        }
         else{
            System.out.println("sorry 'you are not parmoted");
        }*/

         //<!--Find a leap year --!>
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");

    }

}
