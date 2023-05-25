public class array_practice {
    public static void main(String[] args) {
        // Problem 1.
        // sum of the array
       /* float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("the value of sum " + sum);

        */

        //Problem 2.
        // finding the array
        /*float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.7f;
        boolean isInArray = false;
        for (float element : marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("value present in the array");
        }
        else{
            System.out.println("THe value is not present in the array");
        }
         */

        // Problem 3.
        // calculate the average marks from an array containing marks of all student in phy using for-each loop.
        /*int [] marks =  {24, 56, 75, 45, 35, 64, 64};
                int sum = 0;
        for (int element:marks){
            sum = sum+element;
        }
        System.out.println("the value of average marks " + sum/marks.length);
         */
        //Problem 4.
        // sum of two maTrix 2*3
        /*int [][] matrix1 = { {1, 2, 3},
                             {4, 5, 6}};
        int [][] matrix2 = { {2, 6, 13},
                                 {3, 7, 1} };
        int [][] result = { {0, 0, 0},
                              {0, 0, 0} };
        for (int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1[i].length; j++){
                System.out.format("setting value for i=%d and j=%d\n", i, j);
                result[i][j]= matrix1[i][j] + matrix2[i][j];
            }
        }
        // Printing the element of 2D array
        for(int i=0; i<matrix1.length; i++){
            for (int j=0; j<matrix1[i].length; j++){
                System.out.print(result[i][j] + " ");
                result[i][j] = matrix1[i][j] + matrix1[i][j];
            }
            System.out.println(" ");

         */
        // Problem 5.
        // java program to revere the array
       /* int [] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2); // for mid-point of array
        int temp;
        for (int i=0; i<n; i++){
            //swap a[i] and a[l-1-i]
            temp = arr[i];
            arr[i] = arr[l-i-1]; // for replace the element
            arr[l-i-1] = temp;
        }
        for(int element: arr){
            System.out.print(element +" ");

        */
        //Problem 6.
        // find the maximum array
       /* int [] arr = {4, 5, 3, 8, 2, 7, 1};
        int max = 0;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is : " + max);

        */
        // Problem 7.
        // find the minimum
        /*int [] arr = {23,544,22, 23,1 ,45 ,54 };
        int min = Integer.MAX_VALUE;
        for(int e: arr){
            if (min>e){
                min = e;
            }
        }
        System.out.println("min value " + min);

         */
        // Problem 8.
        // find array is sorted or not
        boolean isSorted = true;
        int [] arr = {1, 35, 43, 56, 24, 78, 76};
        for (int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is shot");
        }
        else{
            System.out.println(" The array is not Shorted");
        }

        }
    }

