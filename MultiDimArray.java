public class MultiDimArray{
    public static void main(String[] args){
        /* The number of square bracket represet dimension of array */
        int[] oneDArray;
        int[][] twoDArray;
        int[][][] threeDArray;

        /* To allocate size we must allocate the size of each square bracket */
        twoDArray = new int[2][3]; 
        /* The first size 2 represent how many array
        * The second size 3 represent how many element/value inside the inner array */
        /* twoDArray can be seen as 
        * [
        *   [10, 20, 0], -> 0
        *   [0, 50, 100]  -> 1
        * ]
        */

        // twoDArray[0] -> take first array
        // twoDArray[0][0] -> take first element of first array
        twoDArray[0][0] = 10;
        twoDArray[0][1] = 20;
        twoDArray[1][1] = 50;
        twoDArray[1][2] = 100;
        // print/access
        System.out.println(twoDArray[0][1]);

        /* Task 
        * Make the following array
        * [
        *    [10, 20, 30, 50],
        *    [100, 200, 300, 400],
        *    [50, 60, 70, 10],
        *    [-10, -20, -30, -50],
        *    [1, 2, 3, 5]
        * ]
        * Variable name arrayDemo;
        */

        /* Print the 4th index array */
        /* Output 
        * The element in 4th index is 
        * 1
        * 2
        * 3
        * 5
        */
        int[][] easyArray = {
            {10, 20, 30, 50},
            {100, 200, 300, 400},
            {50, 60, 70, 10},
            {-10, -20, -30, -50},
            {1, 2, 3, 5}
        };
    }
}