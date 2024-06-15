public class JumpStatement{
    public static void main(String[] args){
        /* break and continue are jump statement in java*/
        for(int i = 0; i <= 5; i ++ ){
            if(i == 2){
                break;
            }
            System.out.println("For loop " + i);
        }
        /* can be used in while and do while */
        int count = 0;
        while(count <= 5){
            if(count == 1){
                break;
            }
            System.out.println("While count " + count);
            count ++;
        }
        /* Break ends/terminates the loop where it is called */

        /* Continue skips the current iteration */
        for(int index = 0; index <= 5; index ++ ){
            if(index == 3){
                continue; // will ignore all the remaining and go to next loop
            }
            System.out.println("Continue Loop " + index);
        }

        /* Break in nested loop */
        for(int outer = 0; outer <= 2; outer ++){
            for(int inner = 0; inner <= 3; inner ++){
                if(inner == 1){
                    break;
                }
                System.out.println("Inner loop " + inner);
            }
        }
        /* if you want to break outer loop */
        System.out.println("Outer loop break");
        outerLoop: for(int outer = 0; outer <=2 ; outer ++){
            innerLoop: for(int inner = 0; inner <= 3 ; inner ++ ){
                if(inner == 1){
                    break outerLoop;
                }
                System.out.println("Inner loop " + inner);
            }
        }

        /* Task 1
        * use for loop from -5 to 5
        * if the value is positive end the loop
        */

       /* Task 2
       * use for loop from 1-20
       * only print the value if the value is even
       * use "continue" to perform this
       */

    }
}