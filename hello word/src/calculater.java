import java.util.ArrayList;

public class calculater {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();

        l2.add(15);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,1);
        l1.addAll(l2);
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.remove(2));
        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
