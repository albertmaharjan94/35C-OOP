public class ForLoop{
    public static void main(String[] args){
        for(int index = 0; index < 4; index ++ ){
            System.out.println("Loop " + index);
        }
        /* Make the table for the following */
        for(int index = 10; index >=0 ; index --){
            System.out.println("Decrement "+ index);
        }

        /* Task 
        * Make a multiplication table of 2
        * 2 x 1 = 2
        * 2 x 2 = 4
        * ..
        * 2 x 10 = 20
        */
       for(int index = 1; index <= 10; index ++ ){
        System.out.println("2 x " + index + " = " + index * 2);
       }

       /* Nested for loop
       * for loop inside a for loop scope/block */
        for(int outer = 0; outer < 2; outer ++){
            for(int inner = 3; inner >=0 ; inner --){
                System.out.println("Inner Loop" + inner);
            }
            System.out.println("Outer Loop " + outer);
        }

        /* Task 
        * Make a multiplication table as following
        * print Multiplication table of 1
        * 1 x 1 = 1
        * 1 x 2 = 2
        * ..
        * 1 x 10 = 10
        * ..
        * print Multiplication table of 5
        * 5 x 1 = 5
        * 5 x 2 = 10
        * ..
        * 5 x 10 = 50
        */


    }
}