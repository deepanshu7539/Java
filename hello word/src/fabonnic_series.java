public class fabonnic_series {
   // public static void main (String[] args){

        static int Fibonacci(int n)
        {
            // Base Case
            if (n <= 1)
                return n;

            // Recursive call
            return Fibonacci(n - 1)
                    + Fibonacci(n - 2);
        }

        // Driver Code
        public static void main(String args[])
        {
            // Given Number N
            int N = 10;

            // Print the first N numbers
            for (int i = 0; i < N; i++) {

                System.out.print(Fibonacci(i) + " ");
            }
        }
    }