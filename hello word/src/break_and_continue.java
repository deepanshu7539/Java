public class break_and_continue {
    public static void main(String[] args) {
        // Break and continue using loop;
        int i = 0;
        do {
            i++;
            if (i == 2) {
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");

        }while (i<5);
        System.out.println("loop ends here");
    }
}

