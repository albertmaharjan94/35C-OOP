import java.util.ArrayList;
public class MultiDimArrayLoop{
    public static void main(String[] args){
        /* Make 2 dim array */
        int[][] arrayTwo = new int[3][2];
        arrayTwo[0][0] = 10;
        arrayTwo[0][1] = 20;
        arrayTwo[1][0] = 30;
        arrayTwo[1][1] = -10;
        arrayTwo[2][0] = -20;
        arrayTwo[2][1] = 100;
        /* Visual representation
        * [
        *    [10, 20],
        *    [30, -10],
        *    [-20, 100]
        * ] 
        */
        /* Iterate/ access each array */
        int arrayTwoLength = arrayTwo.length;
        for(int outer = 0; outer < arrayTwoLength; outer ++ ){
            System.out.println("Access Array in " + outer);
            // System.out.println(arrayTwo[outer][0]);
            // System.out.println(arrayTwo[outer][1]);
            int innerLength = arrayTwo[outer].length;
            for(int inner = 0; inner < innerLength; inner ++ ){
                System.out.println(arrayTwo[outer][inner]); 
                // outer loops from 0 - 2, inner from 0 - 1
            }
        }

        /* Make the following array 
        * [
        *    ["Prabesh", "Ankit", "Yubraj"],
        *    ["Muskan", "Manasvi", "Ritika"]
        * ]
        * Variable: names
        */
        /* Loop and print all */

        /* Continue and Find the array index in which Manasvi is in 
         * Output: 1
        */
        String[][] names = {
            {"Prabesh", "Ankit", "Yubraj"},
            {"Muskan", "Manasvi", "Ritika"}
        };
        int namesLength = names.length;
        for(int outer = 0; outer < namesLength; outer ++ ){
            System.out.println("Outer Index " + outer);
            int innerLength = names[outer].length;
            for(int inner = 0; inner < innerLength; inner ++ ){
                System.out.println(names[outer][inner]);
                if(names[outer][inner] == "Manasvi"){
                    System.out.println("Manasvi is in array index " + outer);
                }
            }
        }
        
        
    }
}