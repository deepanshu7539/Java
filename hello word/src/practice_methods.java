public class practice_methods {

    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.format("*");
            }
            System.out.println();
        }
    }

    static int sumRec(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }

    static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }

        }

    static float average(float...marks){
        float total=0;
        for (float scan:marks){
            total+=scan;
        }
        System.out.println(total/ marks.length);
        return total;
    }
        public static void main (String[] args) {
            //problem 1.
            //multiplication(5);

            //problem 2.
            //pattern(6);

            //problem 3.
            //int c = sumRec(4);
            //System.out.println(c);

            //Problem 4.
            //fibonacci series = -0, 1, 1, 2, 3, 5, 8, 13, 21, 34
            //int result = fib(6);
            //System.out.println(result);

            //Problem 5.
            //average of a set of no.
            float sum=average(1,2,3,4);

        }

    }

